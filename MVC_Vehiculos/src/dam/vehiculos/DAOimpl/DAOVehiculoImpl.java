package dam.vehiculos.DAOimpl;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import dam.vehiculos.IDAO.IDAOVehiculo;
import dam.vehiculos.recursos.Vehiculo;

public class DAOVehiculoImpl implements IDAOVehiculo {

    private List<Vehiculo> falsaBD;
    private static IDAOVehiculo dao = null;

    private DAOVehiculoImpl() {
        super();
    }

    @Override
    public int insertarVehiculo(Vehiculo vehiculo) {

        Conexion connect = new Conexion();
        Connection conn = connect.getConnection();
        Statement st;

        String marca = vehiculo.getMarca();
        String modelo = vehiculo.getModelo();
        String matricula = vehiculo.getMatricula();
        String consulta = "INSERT INTO `vehiculo` (`Marca`, `Modelo`, `Matricula`) VALUES ('" + marca + "', '" + modelo + "', '" + matricula + "')";

        try {
            st = conn.createStatement();
            st.executeUpdate(consulta);

            conn.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOVehiculoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        falsaBD = getVehiculos();

        return 1;
    }

    @Override
    public int modificarVehiculo(Vehiculo vehiculo) {
        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();
        Statement st;
        String marca = vehiculo.getMarca();
        String modelo = vehiculo.getModelo();
        String matricula = vehiculo.getMatricula();
        
        String sql = "UPDATE vehiculo SET Marca = '" + marca + "', Modelo = '" + modelo + "' WHERE Matricula = '"+matricula+"'";
   
        try {

            st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            con.close();
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(DAOVehiculoImpl.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    @Override
    public int eliminarVehiculo(String matricula) {
        Conexion connect = new Conexion();
        Connection conn = connect.getConnection();
        Statement st;
        String consulta = "DELETE FROM vehiculo WHERE Matricula = '" + matricula + "'";
        try {

            st = conn.createStatement();
            int confirmar = st.executeUpdate(consulta);
            if (confirmar == 1) {
                return 0;
            } else {
                return 1;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAOVehiculoImpl.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
    }

    @Override
    public int eliminarVehiculos(List<Vehiculo> lstVehiculos) {

        return 0;
    }

    @Override
    public Vehiculo getVehiculo(String matricula) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Vehiculo> getVehiculos() {
        Conexion connect = new Conexion();
        Connection conn = connect.getConnection();
        Statement st;
        ResultSet rs;
        String consulta = "SELECT * FROM vehiculo";

        try {
            st = conn.createStatement();
            rs = st.executeQuery(consulta);
            imprimirConsulta(rs);
            rs.close();
            st.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOVehiculoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return this.falsaBD;
    }

    public static IDAOVehiculo getInstance() {
        if (dao == null) {
            dao = new DAOVehiculoImpl();
        }

        return dao;
    }

    public void imprimirConsulta(ResultSet rs) {
        try {
            this.falsaBD = new ArrayList<Vehiculo>();
            while (rs.next()) {
                falsaBD.add(new Vehiculo(rs.getString("Marca"), rs.getString("Modelo"), rs.getString("Matricula")));
            }
        } catch (SQLException ex) {
            System.out.println("Error en el resultset");
            ex.printStackTrace();
        }
    }
}
