public class Player {
    public int cardTotal;
    public boolean isBust;
    public  boolean isHit;
    public Card[] hand;
    public  String name;

    public Player(){
        cardTotal = 16;
        isBust = false;
        isHit = true;
        name = "shea";
        hand = new Card[3];
    }

    public void printInfo(){
        System.out.println("The card total is: " + cardTotal);
        System.out.println("It is " + isHit +" that the player has hit ");
        System.out.println("The card total is: " + cardTotal);
        System.out.println("It is " + isBust + " that the hand has busted");
        System.out.println("The hand is: " + hand);
    }

    public void hit(){

    }

    public void stand(){

    }
}
