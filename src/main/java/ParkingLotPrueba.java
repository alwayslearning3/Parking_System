import Models.Vehicle;

import java.util.ArrayList;

public class ParkingLotPrueba {
    private static ParkingLotPrueba parkingLotPrueba;
    boolean isParkingLotRunning = false;
    private ArrayList<Vehicle> clientList = null;

    public static ParkingLotPrueba getInstance() {
        if (parkingLotPrueba == null)
            parkingLotPrueba = new ParkingLotPrueba();

        return parkingLotPrueba;
    }

    private ParkingLotPrueba() {
        clientList = new ArrayList<Vehicle>();
    }

    // retrieve array from anywhere
    public ArrayList<Vehicle> getArray() {
        return this.clientList;
    }

    //Add element to array
    public ParkingLotPrueba addToArray(Vehicle value) {
        clientList.add(value);
        return null;
    }

    public void Run(){
        if (!isParkingLotRunning) {
            System.out.println("La aplicación se está ejecutando");
            isParkingLotRunning = true;
        } else {
            System.out.println("La aplicación del parqueadero ya está ejecutándose.");
        }
    }

    @Override
    public ParkingLotPrueba clone(){
        try {
            throw new CloneNotSupportedException();
        } catch (CloneNotSupportedException ex) {
            System.out.println("No se puede clonar un objeto de la clase ParkingLot");
        }
        return null;
    }

}
