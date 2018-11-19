package dam.vehiculos.vista;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import dam.vehiculos.controller.Controller;
import dam.vehiculos.recursos.Vehiculo;
import javax.swing.JButton;

public class VehiculosFrm extends javax.swing.JFrame {

    private Controller controller;

    public VehiculosFrm() {

        initComponents();
        Controller.cargarTabla(tablaVehiculos);

    }

    @SuppressWarnings("unchecked")

// <editor-fold defaultstate="collapsed" desc="Generated Code">						
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        jScrollPane1 = new javax.swing.JScrollPane();

        tablaVehiculos = new javax.swing.JTable();

        txtMarca = new javax.swing.JTextField();

        txtModelo = new javax.swing.JTextField();

        jLabel2 = new javax.swing.JLabel();

        jLabelMatricula = new javax.swing.JLabel();

        txtMatricula = new javax.swing.JTextField();

        btRegistrar = new javax.swing.JButton();
        
        btModificar = new javax.swing.JButton();

        btEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Marca");

        tablaVehiculos.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}

                },
                new String[]{
                    "Title 1", "Title 2", "Title 3", "Title 4"

                }
        ));

        jScrollPane1.setViewportView(tablaVehiculos);
        
        txtMarca.setName("marca"); // NOI18N

        txtModelo.setToolTipText("");

        txtModelo.setName("modelo"); // NOI18N

        txtModelo.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                txtModeloActionPerformed(evt);

            }

        });

        jLabel2.setText("Modelo");

        jLabelMatricula.setText("Matricula");

        txtMatricula.setToolTipText("");

        btRegistrar.setText("Registrar");

        btRegistrar.setActionCommand("btRegistrar");

        btRegistrar.setName("btRegistrar"); // NOI18N

        btRegistrar.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                btRegistrarActionPerformed(evt);

            }

        });

        btEliminar.setText("Eliminar");

        btEliminar.setToolTipText("");

        btEliminar.setName("btLeer"); // NOI18N

        btEliminar.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                btEliminarActionPerformed(evt);

            }

        });
        
        btModificar.setText("Modificar");

        btModificar.setToolTipText("");

        btModificar.setName("btModificar"); // NOI18N

        btModificar.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                btModificarActionPerformed(evt);

            }

        });

        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
                layout.createParallelGroup(Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabelMatricula))
                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                                        .addComponent(txtModelo, 196, 196, 196)
                                                        .addGroup(layout.createParallelGroup(Alignment.LEADING, false)
                                                                .addComponent(txtMarca)
                                                                .addComponent(txtMatricula, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)))
                                                .addPreferredGap(ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                                        .addGroup(layout.createParallelGroup(Alignment.LEADING, false)
                                                                .addComponent(btRegistrar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btEliminar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(btModificar))))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                                                .addComponent(jLabel1)
                                                .addComponent(txtMarca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btRegistrar))
                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(txtModelo, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                                                        .addComponent(jLabelMatricula)
                                                        .addComponent(txtMatricula, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(15)
                                                .addComponent(btEliminar)
                                                .addGap(18)
                                                .addComponent(btModificar)))
                                .addGap(9)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().setLayout(layout);

        pack();

    }// </editor-fold>					

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void btRegistrarActionPerformed(java.awt.event.ActionEvent evt) {

        Controller.insertarVehiculo(this, tablaVehiculos);
    }

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {
        Controller.eliminarVehiculo(this, tablaVehiculos);
    }
    
    private void btModificarActionPerformed(java.awt.event.ActionEvent evt){
        Controller.modificarVehiculo(this, tablaVehiculos);
    }

    public javax.swing.JTextField getTxtMatricula() {
        return txtMatricula;
    }

    public void setTxtMatricula(javax.swing.JTextField txtMatricula) {
        this.txtMatricula = txtMatricula;
    }

    public javax.swing.JTextField getTxtMarca() {
        return txtMarca;
    }

    public void setTxtMarca(javax.swing.JTextField txtMarca) {
        this.txtMarca = txtMarca;
    }

    public javax.swing.JTextField getTxtModelo() {
        return txtModelo;
    }

    public void setTxtModelo(javax.swing.JTextField txtModelo) {
        this.txtModelo = txtModelo;
    }

// Variables declaration - do not modify					
    private javax.swing.JButton btEliminar;

    private javax.swing.JButton btRegistrar;

    private javax.swing.JButton btModificar;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel2;

    private javax.swing.JLabel jLabelMatricula;

    private javax.swing.JScrollPane jScrollPane1;

    private javax.swing.JTable tablaVehiculos;

    private javax.swing.JTextField txtMatricula;

    private javax.swing.JTextField txtMarca;

    private javax.swing.JTextField txtModelo;
}
