package Models;

public class Skateboards extends Motorcycle {
    private Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Skateboars{" +
                "client=" + client +
                '}';
    }

}
