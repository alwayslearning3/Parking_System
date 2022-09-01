package services;

public interface PaymentService {

    double calculateTotalPrice(int tipoVehiculo, int horaEntrada, int horaSalida);
}