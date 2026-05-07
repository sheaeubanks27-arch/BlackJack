public class Card {
    String suit;
    int value;
    String name;

    //todo: make a constructor that has three parameters, one for each variable
    //todo: set the instance variables according to the parameters

    public Card(String pSuit, int pValue, int pName){
        suit = pSuit;
        value = pValue;
        if(pName == 0){
            name = "Ace";
            value = 11;
        }
        else if(pName == 1){
            name = "two";
            value = 2;
            //todo: make the whole suit
        }
       // name = pName;

    }

    //todo: make a print info that prints the info of the card
    //the ___ of ___ is worth ___ points


    public void printInfo(){
        System.out.println("the " + name +" of " + suit + " is worth " + value + " points.");
    }

}
