package com.xwork.task1.PanCard;

public class PanCardRunner {

    public static void main(String[] args)
    {
        PanCard[] cardArray = new PanCard[5];
        StorePanCard storePanCard = new StorePanCard(cardArray);

        PanCard card1 = new PanCard();
        card1.panNumber = "ABCDE1234F";
        card1.holderName = "Ravi";
        card1.dob = "01-01-2000";
        card1.address = "Bangalore";
        card1.fatherName = "Ramesh";

        PanCard card2 = new PanCard();
        card2.panNumber = "PQRSX5678Y";
        card2.holderName = "Sita";
        card2.dob = "05-05-1998";
        card2.address = "Hyderabad";
        card2.fatherName = "Keshav";

        PanCard card3 = new PanCard();
        card3.panNumber = "LMNOP4321Z";
        card3.holderName = "Arjun";
        card3.dob = "10-10-1995";
        card3.address = "Chennai";
        card3.fatherName = "Shiva";

        System.out.println("Storing the PAN card details");
        storePanCard.storePanCard(card1);
        storePanCard.storePanCard(card2);
        storePanCard.storePanCard(card3);

        System.out.println("Search by PAN number");
        storePanCard.searchByPan("ABCDE1234F");

        System.out.println("Update PAN number");
        storePanCard.update("LMNOP4321Z", "NEWPAN9999");
    }
}
