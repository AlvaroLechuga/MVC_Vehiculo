package dam.vehiculos.controller;

import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dam.vehiculos.DAOimpl.DAOVehiculoImpl;
import dam.vehiculos.recursos.Vehiculo;
import dam.vehiculos.vista.VehiculosFrm;

public class Controller {

    public static void cargarTabla(JTable tablaVehiculos) { //DefaultTableModel modeloDeDatosTabla = (DefaultTableModel) tablaVehiculos.getModel();
        List<Vehiculo> lstVehiculos = DAOVehiculoImpl.getInstance().getVehiculos();

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Marca");

        modelo.addColumn("Modelo");

        modelo.addColumn("Matricula");

        for (Vehiculo vehiculo : lstVehiculos) {

            Object[] registroLeido
                    = {
                        vehiculo.getMarca(),
                        vehiculo.getModelo(),
                        vehiculo.getMatricula()

                    };

            modelo.addRow(registroLeido);

        }

        tablaVehiculos.setModel(modelo);
    }

    public static boolean insertarVehiculo(VehiculosFrm frmVehiculo, JTable tablaVehiculos) {
        boolean borrado = false;
        Vehiculo vehiculo = new Vehiculo();

        vehiculo.setMarca(frmVehiculo.getTxtMarca().getText());

        vehiculo.setModelo(frmVehiculo.getTxtModelo().getText());

        vehiculo.setMatricula(frmVehiculo.getTxtMatricula().getText());

        if (DAOVehiculoImpl.getInstance().insertarVehiculo(vehiculo) != 0) {
            borrado = true;
            cargarTabla(tablaVehiculos);
        }
        return borrado;
    }

    public static boolean eliminarVehiculo(VehiculosFrm frmVehiculo, JTable tablaVehiculos) {
        boolean borrado = false;
        Vehiculo vehiculo = new Vehiculo();
        String matricula="";
        if (tablaVehiculos.getSelectedColumn() != -1) {
            matricula = (String) tablaVehiculos.getValueAt(tablaVehiculos.getSelectedRow(), 2);
            vehiculo.setMatricula(matricula);
            vehiculo.setMarca("");
            vehiculo.setModelo("");
        }else{
            vehiculo.setMatricula(frmVehiculo.getTxtMatricula().getText());
            vehiculo.setMarca("");
            vehiculo.setModelo("");  
        }

        if (DAOVehiculoImpl.getInstance().eliminarVehiculo(vehiculo.getMatricula()) == 0) {
            borrado = true;
            cargarTabla(tablaVehiculos);
        }

        return borrado;
    }
    
    public static boolean modificarVehiculo(VehiculosFrm frmVehiculo, JTable tablaVehiculos){
        boolean borrado = false;
        
        Vehiculo vehiculo = new Vehiculo();
        String matricula = "";
            
            String marc = frmVehiculo.getTxtMarca().getText();
            String mod = frmVehiculo.getTxtModelo().getText();
            String matr = frmVehiculo.getTxtMatricula().getText();
            
            vehiculo.setMarca(marc);
            vehiculo.setModelo(mod);
            vehiculo.setMatricula(matr);
           
        if (DAOVehiculoImpl.getInstance().modificarVehiculo(vehiculo) != 0) {
            borrado = true;
            cargarTabla(tablaVehiculos);
        }
        
        return borrado;
    }

}
