public class BasicGameApp {
    public Card[] deck;
    public Player me;
    public Dealer d;

    public static void main(String[] args) {
        new BasicGameApp();

    }

    public BasicGameApp(){
        System.out.println("welcome to Blackjack");
        deck = new Card[52];
        //todo: fill the array deck with your favorite card

        for(int x= 0; x<13; x++){
            deck[x] = new Card("hearts",10,x);
            deck[x].printInfo();
        }
    }

    //todo: make a printDeck method that prints the deck with printinfo

    public void compare(){

    }

    public void round(){

    }

    public void shuffle(){

    }

}
