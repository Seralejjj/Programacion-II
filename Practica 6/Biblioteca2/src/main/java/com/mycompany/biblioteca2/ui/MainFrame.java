package com.mycompany.biblioteca2.ui; // Paquete UI

import com.mycompany.biblioteca2.ControladorBiblioteca;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {
    
    private ControladorBiblioteca controlador;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainFrame.class.getName());

public MainFrame() {
        initComponents();
        
        this.controlador = new ControladorBiblioteca(); 
        
        System.out.println("Interfaz de usuario (MainFrame) inicializada."); 
        
        mostrarEstadoSistema(); 
        
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {

            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                int dialogResult = JOptionPane.showConfirmDialog(null, 
                    "¿Desea guardar los datos antes de salir?", 
                    "Guardar y Salir", 
                    JOptionPane.YES_NO_OPTION);
                
                if (dialogResult == JOptionPane.YES_OPTION) {
                    controlador.guardarDatos();
                    JOptionPane.showMessageDialog(null, "Datos guardados. Saliendo...");
                    System.out.println("Guardando datos y cerrando aplicación..."); 
                } else {
                    JOptionPane.showMessageDialog(null, "Saliendo sin guardar.");
                    System.out.println("Saliendo sin guardar datos."); 
                }
                dispose();
                System.exit(0);
            }
        });
    }

public void mostrarEstadoSistema() {
    String estado = controlador.mostrarEstado();
    txtSalida.setText("Sistema de Biblioteca iniciado y cargado.\n\n" + estado);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPrincipal = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        txtCodEstudiante = new javax.swing.JTextField();
        txtNomEstudiante = new javax.swing.JTextField();
        btnRegEstudiante = new javax.swing.JButton();
        txtNomAutor = new javax.swing.JTextField();
        txtNacAutor = new javax.swing.JTextField();
        btnRegAutor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JTextField();
        txtISBN = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        btnRegLibro = new javax.swing.JButton();
        btnVerLibros = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtPrestCodEst = new javax.swing.JTextField();
        txtPrestTituloLib = new javax.swing.JTextField();
        btnRegPrestamo = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtSalida.setColumns(20);
        txtSalida.setRows(5);
        jScrollPane1.setViewportView(txtSalida);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabPrincipal.addTab("1) Estado del Sistema", jPanel1);

        btnRegEstudiante.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnRegEstudiante.setText("Registrar");
        btnRegEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegEstudianteActionPerformed(evt);
            }
        });

        btnRegAutor.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnRegAutor.setText("Registrar");
        btnRegAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegAutorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Registrar Alumno");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Registrar Autor");

        jLabel3.setText("Nombre");

        jLabel4.setText("Nacimiento");

        jLabel5.setText("C.I");

        jLabel6.setText("Nombre");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnRegEstudiante))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btnRegAutor))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNomEstudiante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                .addComponent(txtCodEstudiante, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNacAutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                .addComponent(txtNomAutor, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(btnRegEstudiante)
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNacAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(btnRegAutor)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        tabPrincipal.addTab("2) Registro de Entidades", jPanel2);

        btnRegLibro.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnRegLibro.setText("Registrar");
        btnRegLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegLibroActionPerformed(evt);
            }
        });

        btnVerLibros.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnVerLibros.setText("Ver Libros");
        btnVerLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerLibrosActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setText("Codigo libro");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setText("Stok libro");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel9.setText("Registrar libro");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(btnRegLibro)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnVerLibros)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(36, 36, 36)))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegLibro)
                    .addComponent(btnVerLibros))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        tabPrincipal.addTab("3) Registro de Libros", jPanel3);

        btnRegPrestamo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnRegPrestamo.setText("Prestar");
        btnRegPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegPrestamoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel10.setText("Nombre Libro");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel11.setText("Codigo Libro");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegPrestamo)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                        .addComponent(txtPrestCodEst)
                        .addComponent(txtPrestTituloLib)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPrestCodEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPrestTituloLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegPrestamo)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        tabPrincipal.addTab("4) Registrar Prestamo", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPrincipal)
        );

        tabPrincipal.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegEstudianteActionPerformed
    String codigo = txtCodEstudiante.getText().trim();
    String nombre = txtNomEstudiante.getText().trim();
    
    if (codigo.isEmpty() || nombre.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debe ingresar Código y Nombre del estudiante.", "Error de registro", JOptionPane.ERROR_MESSAGE);
        System.out.println("Registro Estudiante: Falló por campos vacíos."); 
        return;
    }
    
    String resultado = controlador.registrarEstudiante(codigo, nombre);
    JOptionPane.showMessageDialog(this, resultado, "Registro de Estudiante", JOptionPane.INFORMATION_MESSAGE);
    
    if (resultado.startsWith("✅")) {
        System.out.println("Estudiante registrado: " + nombre + " (" + codigo + ")");
    } else {
        System.out.println("Estudiante NO registrado (Error en Controlador): " + resultado);
    }
    
    txtCodEstudiante.setText("");
    txtNomEstudiante.setText("");
    mostrarEstadoSistema();  
    }//GEN-LAST:event_btnRegEstudianteActionPerformed

    private void btnRegAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegAutorActionPerformed
    String nombre = txtNomAutor.getText().trim();
    String nacionalidad = txtNacAutor.getText().trim();
    
    if (nombre.isEmpty() || nacionalidad.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debe ingresar Nombre y Nacionalidad del autor.", "Error de registro", JOptionPane.ERROR_MESSAGE);
        System.out.println("Registro Autor: Falló por campos vacíos."); 
        return;
    }
    
    String resultado = controlador.registrarAutor(nombre, nacionalidad);
    JOptionPane.showMessageDialog(this, resultado, "Registro de Autor", JOptionPane.INFORMATION_MESSAGE);
    
    if (resultado.startsWith("✅")) {
        System.out.println("Autor registrado: " + nombre + " (" + nacionalidad + ")");
    }
    
    txtNomAutor.setText("");
    txtNacAutor.setText("");
    mostrarEstadoSistema(); 
    }//GEN-LAST:event_btnRegAutorActionPerformed

    private void btnRegLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegLibroActionPerformed
    try {
        String titulo = txtTitulo.getText().trim();
        String isbn = txtISBN.getText().trim();
        int stock = Integer.parseInt(txtStock.getText().trim());
        
        if (titulo.isEmpty() || isbn.isEmpty() || stock <= 0) {
            throw new Exception("Datos incompletos o Stock inválido.");
        }
        
        String resultado = controlador.registrarLibro(titulo, isbn, stock);
        JOptionPane.showMessageDialog(this, resultado, "Registro de Libro", JOptionPane.INFORMATION_MESSAGE);
        
        if (resultado.startsWith("")) {
            System.out.println("Libro registrado: " + titulo + " (Stock: " + stock + ")");
        } else {
            System.out.println(" Libro NO registrado (Error en Controlador): " + resultado);
        }
        
        txtTitulo.setText("");
        txtISBN.setText("");
        txtStock.setText("");
        mostrarEstadoSistema();
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El campo Stock debe ser un número entero válido.", "Error de formato", JOptionPane.ERROR_MESSAGE);
        System.out.println("Registro Libro: Error de formato en Stock (no es un número)."); 
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error de registro", JOptionPane.ERROR_MESSAGE);
        System.out.println("Registro Libro: Falló. Causa: " + e.getMessage()); 
    } 
    }//GEN-LAST:event_btnRegLibroActionPerformed

    private void btnVerLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerLibrosActionPerformed

    String lista = controlador.listarLibros();
    
    System.out.println("Botón 'Ver Libros' presionado. Mostrando lista en pestaña Estado."); 
    
    tabPrincipal.setSelectedIndex(0); 
    txtSalida.setText(lista); 
    }//GEN-LAST:event_btnVerLibrosActionPerformed

    private void btnRegPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegPrestamoActionPerformed
    String codigoEstudiante = txtPrestCodEst.getText().trim();
    String tituloLibro = txtPrestTituloLib.getText().trim();
    
    if (codigoEstudiante.isEmpty() || tituloLibro.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debe ingresar Código de Estudiante y Título del Libro.", "Error de Préstamo", JOptionPane.ERROR_MESSAGE);
        System.out.println("Registro Préstamo: Falló por campos vacíos."); 
        return;
    }
    
    String resultado = controlador.realizarPrestamo(codigoEstudiante, tituloLibro);
    JOptionPane.showMessageDialog(this, resultado, "Registro de Préstamo", JOptionPane.INFORMATION_MESSAGE);
    
    if (resultado.startsWith("[ACCIÓN]")) {
        System.out.println("Préstamo exitoso. Estudiante: " + codigoEstudiante + ", Libro: " + tituloLibro);
    } else {
        System.out.println("Préstamo fallido. Causa: " + resultado);
    }
    
    txtPrestCodEst.setText("");
    txtPrestTituloLib.setText("");
    mostrarEstadoSistema();  
    }//GEN-LAST:event_btnRegPrestamoActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MainFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegAutor;
    private javax.swing.JButton btnRegEstudiante;
    private javax.swing.JButton btnRegLibro;
    private javax.swing.JButton btnRegPrestamo;
    private javax.swing.JButton btnVerLibros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane tabPrincipal;
    private javax.swing.JTextField txtCodEstudiante;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtNacAutor;
    private javax.swing.JTextField txtNomAutor;
    private javax.swing.JTextField txtNomEstudiante;
    private javax.swing.JTextField txtPrestCodEst;
    private javax.swing.JTextField txtPrestTituloLib;
    private javax.swing.JTextArea txtSalida;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}