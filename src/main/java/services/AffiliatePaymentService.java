package services;

import Models.ParkingManager;

public class AffiliatePaymentService implements PaymentService {

    @Override
    public double calculateTotalPrice(int tipoVehiculo, int horaEntrada, int horaSalida) {
        final double minutePrice = 60;
        double totalCost = 0;
        if (tipoVehiculo == 1) {
            totalCost = minutePrice * 10;
        } else if (tipoVehiculo == 2) {
            totalCost = minutePrice * 15;
        } else if (tipoVehiculo == 3) {
            totalCost = minutePrice * 20;
        }

        return totalCost;
    }
}
