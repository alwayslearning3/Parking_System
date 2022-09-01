package Models;

public abstract class Vehicle {

    private int typeOfVehicle;

    private String model;

    private String brand;

    private String color;

    private String plate;


    public Vehicle() {
    }

    public Vehicle(int typeOfVehicle, String model, String brand, String color, String plate) {
        this.typeOfVehicle = typeOfVehicle;
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.plate = plate;
    }

    public int getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(int typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

//    @Override
//    public String toString() {
//        return "Vehicle{" +
//                "typeOfVehicle=" + typeOfVehicle +
//                ", model='" + model + '\'' +
//                ", brand='" + brand + '\'' +
//                ", color='" + color + '\'' +
//                ", plate='" + plate + '\'' +
//                '}';
//    }
}
