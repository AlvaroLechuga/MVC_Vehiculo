package dam.vehiculos.DAOimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    private static String servidor="jdbc:mysql://localhost/vehiculo";
    private static String user="root";
    private static String pass="";
    private static String driver="com.mysql.jdbc.Driver";
    private static Connection conexion;

    public Conexion() {
        try {
            Class.forName(driver);
            conexion=DriverManager.getConnection(servidor,user,pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException e){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public Connection getConnection(){
        return conexion;
    }
}
