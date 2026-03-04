class HamperRunner {

    public static void main(String[] args) {

        Hamper hamper1 = new Hamper();
        hamper1.addItem();
        hamper1.removeItem();
        hamper1.diaplayItem();
        hamper1.packHamper();
        hamper1.openHamper();
        hamper1.sealHamper();
        hamper1.checkWeight();
        hamper1.calculatePrice();
        hamper1.applyDiscount();
        hamper1.attachGreetingCard();
        hamper1.deliverHamper();
        hamper1.trackDelivery();
        hamper1.cancelOrder();
        hamper1.returnHamper();
        hamper1.rateHamper();
        System.out.println("------------");
        
		Hamper hamper2 = new Hamper();
        hamper2.addItem();
        hamper2.removeItem();
        hamper2.diaplayItem();
        hamper2.packHamper();
        hamper2.openHamper();
        hamper2.sealHamper();
        hamper2.checkWeight();
        hamper2.calculatePrice();
        hamper2.applyDiscount();
        hamper2.attachGreetingCard();
        hamper2.deliverHamper();
        hamper2.trackDelivery();
        hamper2.cancelOrder();
        hamper2.returnHamper();
        hamper2.rateHamper();

        System.out.println("------------");
 
        Hamper.showHamperCategory();
        Hamper.showCompanyName();
        Hamper.deliveryPolicy();
        Hamper.customerReveiw();
        Hamper.returnPolicy();
    }
}