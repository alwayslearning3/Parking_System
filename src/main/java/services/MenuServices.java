package services;

import Models.Car;
import Models.Client;

import java.util.Scanner;

public class MenuServices {

    Scanner scanner = new Scanner(System.in);
    Car vehicle = new Car();
    Client client = new Client();

    int posicion;

    int typeOfVehicle;

    String vehicleModel;

    String plate;

    String vehicleBrand;

    String vehicleColor;

    String nameClient;

    String lastnameClient;

    long idDocumentClient;

    long telephoneClient;

    int optionUser = 0;


    public void menu() {


        do {
            System.out.println("\n==============Menu Principal===============");
            System.out.println();
            System.out.println("Por favor, ingrese la placa de su vehículo: ");
            plate = scanner.nextLine();
            vehicle.setPlate(plate);

            System.out.println("Por favor, ingrese su nombre: ");
            nameClient = scanner.nextLine();
            client.setName(nameClient);

            System.out.println("Por favor, ingrese su apellido: ");
            lastnameClient = scanner.nextLine();
            client.setLastName(lastnameClient);

            System.out.println("Ingrese sólo números. Digite su número de documento: ");
            idDocumentClient = scanner.nextLong();
            client.setIdDocument(idDocumentClient);

            System.out.println("Ingrese sólo números. Digite su número de teléfono: ");
            telephoneClient = scanner.nextLong();
            client.setTelephone(telephoneClient);

            System.out.println();
            System.out.println("Elija una opción.");
            System.out.println("1. Elija su tipo de vehiculo...");
            System.out.println("0. Salir.");
            optionUser = scanner.nextInt();

            switch (optionUser) {
                case 1:
                    System.out.println("\n=======> 1. Tipo de vehiculo.");
                    System.out.println("¿Cuál es tu tipo de vehículo?: ");
                    System.out.println("1. Moto ");
                    System.out.println("2. Carro ");
                    System.out.println("3. Carro pesado ");
                    System.out.println("4. Patineta. ");
                    typeOfVehicle = scanner.nextInt();
                    vehicle.setTypeOfVehicle(typeOfVehicle);

                    if (typeOfVehicle == 1) {
                        System.out.println(">Ingrese el modelo de la moto:");
                        vehicleModel = scanner.nextLine();
                        vehicle.setModel(vehicleModel);
                        System.out.println(">Ingrese la marca de la moto:");
                        vehicleBrand = scanner.nextLine();
                        vehicle.setBrand(vehicleBrand);
                        System.out.println(">Ingrese el color de la moto:");
                        vehicleColor = scanner.nextLine();
                        vehicle.setColor(vehicleColor);
                    } else if (typeOfVehicle == 2) {
                        System.out.println(">Ingrese el modelo del carro:");
                        vehicleModel = scanner.nextLine();
                        vehicle.setModel(vehicleModel);
                        System.out.println(">Ingrese la marca del carro:");
                        vehicleBrand = scanner.nextLine();
                        vehicle.setBrand(vehicleBrand);
                        System.out.println(">Ingrese el color del carro:");
                        vehicleColor = scanner.nextLine();
                        vehicle.setColor(vehicleColor);
                    } else if (typeOfVehicle == 3) {
                        System.out.println(">Ingrese el modelo del carro pesado:");
                        vehicleModel = scanner.nextLine();
                        vehicle.setModel(vehicleModel);
                        System.out.println(">Ingrese la marca del carro pesado:");
                        vehicleBrand = scanner.nextLine();
                        vehicle.setBrand(vehicleBrand);
                        System.out.println(">Ingrese el color del carro pesado:");
                        vehicleColor = scanner.nextLine();
                        vehicle.setColor(vehicleColor);
                    } else if (typeOfVehicle == 4) {
                        System.out.println(">Ingrese el modelo de la patineta:");
                        vehicleModel = scanner.nextLine();
                        vehicle.setModel(vehicleModel);
                        System.out.println(">Ingrese la marca de la patineta:");
                        vehicleBrand = scanner.nextLine();
                        vehicle.setBrand(vehicleBrand);
                        System.out.println(">Ingrese el color de la patineta:");
                        vehicleColor = scanner.nextLine();
                        vehicle.setColor(vehicleColor);
                    }
                    break;
                case 0:
                    System.out.println("Muchas gracias por utilizar nuestros servicios...");
                    break;
                default:
                    System.out.println("No es un número válido...");
                    break;
            }
        } while (optionUser != 0);
    }


}

