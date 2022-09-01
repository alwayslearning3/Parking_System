package services;

import Models.Client;
import Models.Vehicle;

public interface TimeRecord {

    public void registerEntryDate(Vehicle vehicle, Client client);

    public void registreDepartureDate(Vehicle vehicle, Client client);

}
