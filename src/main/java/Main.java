
import Models.Car;
import Models.Client;
import Models.Motorcycle;
import Models.ParkingManager;
import services.MenuServices;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        horaLocal();
        ParkingLotPrueba parkingLot = ParkingLotPrueba.getInstance();

        System.out.println("Bienvenido al sistema de parqueadero Keyrus");

        ArrayList<ParkingLotPrueba> parkingSpace = new ArrayList();

        MenuServices menuServices = new MenuServices();
        menuServices.menu();

        parkingLot.addToArray(new Car(1,"Clasic","mercedes","negro","ADS165",new Client("Jorge","Quintero",1234567890,315426248)));
        parkingLot.addToArray(new Car(1,"Sport","mercedes","rojo","ADS165",new Client("Raul","Quintero",23456789,315426248)));
        parkingLot.addToArray(new Car(1,"Tour","mercedes","azul","ADS165",new Client("Jose","Quintero",3456789,315426248)));

        parkingLot.addToArray(new Motorcycle());

        System.out.println(parkingLot.getArray());

        Motorcycle moto1 = new Motorcycle();
        Client cliente1 = new Client();

        ParkingManager administradorParqueo = new ParkingManager();
        administradorParqueo.registerEntryDate(moto1, cliente1);
        administradorParqueo.registreDepartureDate(moto1, cliente1);
        System.out.println(administradorParqueo.getEntryDate());
        System.out.println(administradorParqueo.getDepartureDate());
        System.out.println(administradorParqueo.getTimeRecord());

    }

    public static void horaLocal(){
        DateTimeFormatter entryDate = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(entryDate.format(LocalDateTime.now()));
    }
}
