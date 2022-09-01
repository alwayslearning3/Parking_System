package Models;

public class Motorcycle extends Vehicle {
    private Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "client=" + client +
                '}';
    }

}
