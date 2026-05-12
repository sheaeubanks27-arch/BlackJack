public class BasicGameApp {
    public Card[] deck;
    public Player me;
    public Dealer d;

    public static void main(String[] args) {
        new BasicGameApp();

    }

    public BasicGameApp() {
        System.out.println("welcome to Blackjack");
        deck = new Card[52];
        //todo: fill the array deck with your favorite card

        int counter = 0;
        for (int y = 0; y < 4; y++) {//4 suits per deck
            for (int x = 0; x < 13; x++) {//13 cards per suit
                deck[counter] = new Card(y, 10, x);
                counter++;

                //deck[x].printInfo();
            }

        }
        shuffle();
        printDeck();
        me = new Player();
        d = new Dealer();
    }

    //todo: make a printDeck method that prints the deck with printinfo

    public void printDeck() {
        for (int i = 0; i < deck.length; i++) {
            deck[i].printInfo();
        }
    }

    //todo: make a method that is called shuffle()
    //in that method make a for loop that fors through every card in the deck

    public void shuffle() {
        for (int s = 0; s < deck.length; s++) {
            int randomIndex = (int)(Math.random() * 52);
            Card spencer = deck[randomIndex];
            deck[randomIndex] = deck[s];
            deck[s] = spencer;
        }
    }

    public void compare() {

    }

    public void round() {

    }



}
