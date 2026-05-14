public class Dealer {
    boolean isOver15;
    int cardTotal;
    boolean isBust;
    Card[]hand;

    public Dealer() {
        isOver15 = false;
        cardTotal = 12;
        isBust = true;
        hand = new Card[2];
    }

    public void hit(){

    }

    public void stand(){


    }

    public void printInfo(){
        System.out.println("It is " + isOver15 +" that the card value is over 15 ");
        System.out.println("The card total is: " + cardTotal);
        System.out.println("It is " + isBust + " that the hand has busted");
        System.out.println("The hand is: " + hand);
    }
}
