package Models;

import java.util.ArrayList;

public class ParkingLot {

    private static ParkingLot parkingLot;
    private boolean isParkingLotRunning = false;

    private ParkingLot() {
    }

    public static ParkingLot getParkingLotIntance() {
        if (parkingLot == null) {
            parkingLot = new ParkingLot();
        }
        return parkingLot;
    }

    public void Run() {
        if (!isParkingLotRunning) {
            System.out.println("La aplicación se está ejecutando");
            isParkingLotRunning = true;
        } else {
            System.out.println("La aplicación del parqueadero ya está ejecutándose.");
        }
    }

    public boolean isParkingLotRunning() {
        return isParkingLotRunning;
    }

    public void setParkingLotRunning(boolean parkingLotRunning) {
        isParkingLotRunning = parkingLotRunning;
    }

    public void getArrayList(ArrayList<Vehicle> vehicle) {
        for (Vehicle i : vehicle) {
            System.out.println(i);
        }
    }

    @Override
    public ParkingLot clone() {
        try {
            throw new CloneNotSupportedException();
        } catch (CloneNotSupportedException ex) {
            System.out.println("No se puede clonar un objeto de la clase ParkingLot");
        }
        return null;
    }

}
