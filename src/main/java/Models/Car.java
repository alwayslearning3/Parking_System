package Models;

public class Car extends Vehicle {

    private Client client;

    public Car() {
    }

    public Car(int typeOfVehicle, String model, String brand, String color, String plate, Client client) {
        super(typeOfVehicle, model, brand, color, plate);
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehículo {");
        sb.append("tipo: ").append(getTypeOfVehicle());
        sb.append(", modelo: ").append(getModel());
        sb.append(", marca: ").append(getBrand());
        sb.append(", color: ").append(getColor());
        sb.append(", placa: ").append(getPlate());
        sb.append("}, Cliente {nombre: ").append(client.getName());
        sb.append(", apellido: ").append(client.getLastName());
        sb.append(", documento: ").append(client.getIdDocument());
        sb.append(", teléfono: ").append(client.getTelephone());
        sb.append('}');
        return sb.toString();
    }
}
