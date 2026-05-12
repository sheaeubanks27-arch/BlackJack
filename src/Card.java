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

        else if(pName == 2){
            name = "three";
            value = 3;
        }

        else if(pName == 3){
            name = "four";
            value = 4;
        }

        else if(pName == 4){
            name = "five";
            value = 5;
        }

        else if(pName == 5){
            name = "six";
            value = 6;
        }

        else if(pName == 6){
            name = "seven";
            value = 7;
        }

        else if(pName == 7){
            name = "eight";
            value = 8;
        }

        else if(pName == 8){
            name = "nine";
            value = 9;
        }


        else if(pName == 11){
            name = "Queen";
            value = 10;
        }

        else if(pName == 10){
            name = "King";
            value = 10;
        }

        else if(pName == 12){
            name = "Jack";
            value = 10;
        }
        else if(pName == 9){
            name = "Ace";
            value = 1;
        }

       // name = pName;

    }

    //todo: make a print info that prints the info of the card
    //the ___ of ___ is worth ___ points


    public void printInfo(){
        System.out.println("the " + name +" of " + suit + " is worth " + value + " points.");
    }

}
