package dam.vehiculos.test;

import java.awt.EventQueue;

import dam.vehiculos.vista.VehiculosFrm;

public class TestVehiculos {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VehiculosFrm window = new VehiculosFrm();
                    window.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }

}
