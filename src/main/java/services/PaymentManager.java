package services;

import Models.Client;

public class PaymentManager {

    public void calculateParkingCost() {

        final PaymentManagerFactory paymentManagerFactory = new PaymentManagerFactory();

        final PaymentService paymentService = paymentManagerFactory.getPaymentService(new Client());

        paymentService.calculateTotalPrice(1,1,1);

        int test = 0;

        switch (test) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
        }
    }
}
