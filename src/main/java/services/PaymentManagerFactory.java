package services;

import Models.Client;

public class PaymentManagerFactory {

    public PaymentService getPaymentService(Client client){

        final Boolean userStatus;

        final PaymentService paymentService;

        if(client.isInNewUser()){
            userStatus = true;
            paymentService = new AffiliatePaymentService();
        }else {
            userStatus = false;
            paymentService = new NewUserPaymentService();
        }
        return paymentService;
    }
}
