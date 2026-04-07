package com.xwork.task1.PanCard;

public class StorePanCard {

    PanCard[] cards;
    int currentIndex;

    StorePanCard(PanCard[] cards)
    {
        this.cards = cards;
    }

    void storePanCard(PanCard card) {
        System.out.println("Executing storePanCard in StorePanCard");

        if (this.cards != null) {
            int size = this.cards.length - 1;

            if (this.currentIndex <= size) {
                this.cards[currentIndex] = card;

                System.out.println("Stored at index: " + this.currentIndex);
                currentIndex++;
            } else {
                System.out.println("Array is full, cannot store");
            }
        } else {
            System.out.println("Array is not pointing to memory");
        }
    }

    boolean searchByPan(String pan)
    {
        if (pan != null) {
            System.out.println("Searching for PAN: " + pan);

            if (this.cards != null)
            {
                for (PanCard card : this.cards) {
                    if (card != null && card.panNumber.equals(pan)) {
                        System.out.println("Found at index: " + currentIndex);
                        card.displayInfo();
                        return true;
                    }
                    currentIndex++;
                }
                System.out.println("PAN not found");
            }
        }
        return false;
    }

    boolean update(String oldPan, String newPan)
    {
        if(this.cards != null)
        {
            if(oldPan != null && newPan != null)
            {
                for(PanCard card : this.cards)
                {
                    if(card != null && card.panNumber.equals(oldPan))
                    {
                        card.panNumber = newPan;
                        System.out.println("Updated at index: " + currentIndex);
                        return true;
                    }
                    currentIndex++;
                }
                System.out.println("Old PAN not found");
            }
        }
        return false;
    }
}
