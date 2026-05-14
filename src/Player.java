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
        hand = new Card[2];
    }

    public void printInfo(){
        System.out.println("The card total is: " + cardTotal);
        System.out.println("It is " + isHit +" that the player has hit ");
        System.out.println("The player's name is: " + name);
        System.out.println("It is " + isBust + " that the hand has busted");
        for(int s = 0; s < hand.length; s++){
            hand[s].printInfo();
        }
    }

    //todo: make a method called calculate total(){}

    public void calculateTotal(){
        cardTotal = 0;
        for(int f = 0; f< hand.length; f++){
            cardTotal += hand[f].value;

        }
    }
    public void hit(){

    }

    public void stand(){

    }
}
