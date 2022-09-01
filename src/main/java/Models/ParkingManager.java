package Models;

import services.TimeRecord;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class ParkingManager implements TimeRecord {

    private LocalDateTime entryDate;
    private LocalDateTime departureDate;

    private Map<DateTimeFormatter, Vehicle> timeRecord = new HashMap<>();

    public ParkingManager() {
    }

    public LocalDateTime getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDateTime entryDate) {
        this.entryDate = entryDate;
    }

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDateTime departureDate) {
        this.departureDate = departureDate;
    }

    public Map<DateTimeFormatter, Vehicle> getTimeRecord() {
        return timeRecord;
    }

    public void setTimeRecord(Map<DateTimeFormatter, Vehicle> timeRecord) {
        this.timeRecord = timeRecord;
    }

    @Override
    public void registerEntryDate(Vehicle vehicle, Client client) {
        DateTimeFormatter entryDate = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        entryDate.format(LocalDateTime.now());
        timeRecord.put(entryDate, vehicle);
        System.out.println(entryDate.format(LocalDateTime.now()));
    }

    @Override
    public void registreDepartureDate(Vehicle vehicle, Client client) {
        DateTimeFormatter departureDate = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        departureDate.format(LocalDateTime.now());
        timeRecord.put(departureDate,vehicle);
        System.out.println(departureDate.format(LocalDateTime.now()));
    }
}
