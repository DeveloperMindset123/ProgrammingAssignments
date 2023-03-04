import java.util.Random;

public class TortoiseAndHareRace {
    //Note to self: right means moving "forward" and left means moving "backward"  --> refferring to fig 7.32
    public static void main(String[] args) {
        int tortoise = 1;  //starting position of the tortoise
        int hare = 1; //starting position of the hare

        Random rand = new Random(); //initialize a random number generator object

        System.out.println("BANG !!!!!");
        System.out.println("AND THEY'RE OFF!!!!!");

        //loop until either tortoise or hare wins the race
        while (tortoise < 70 && hare < 70) {   //loop will continue until one or the other reaches 70
            int tortoiseMove = rand.nextInt(10) + 1;  //tortoise moves randomly between 1 to 10 squares, note, you want the tortoise to mvoe slower. may wnat to remove the "+ 1"
            int hareMove = rand.nextInt(10) + 1;   //hare moves randomly between 1 to 10 as well, hare should be faster than tortoise
            
            //adjust the position of the tortoise according to the rules ashown in figure 7.32
            if (tortoiseMove >= 1 && tortoiseMove <= 5) {  //meaning if the random number generator generated a number between 1 and 5
                tortoise += 3;
            }

            else if (tortoiseMove >= 6 && tortoiseMove <= 7) { //meaning if the random number generator generated a number between 6 and 7, which indicates the tortoise slipped, return it back to 0
                tortoise -= 6;
            }
            else {   //slow pod
                tortoise += 1;  //otherwise, move the torioise by 1 position each tick
            }


            //adjust the position of the hare according to the rules in figure 7.32
            if (hareMove >= 1 && hareMove <= 2)   {  //if the random number generator generates values between 1 and 2, the hare should sleep
                hare += 0; //meaning the hare doesn't move at all
            }   
            else if (hareMove >= 3 && hareMove <= 4) {  //big hop, meaning if random number generator generates a value between 3 and 4, the hare should move 9 units
                hare += 9;
            }
            else if (hareMove == 5)  {  //if the random number generator were to generate a value of 5, the hare will be moved back
                hare -= 12;
            }
            else if (hareMove >= 6 && hareMove <= 8)  { //if the random number generator were to generate a value between 6 and 8, the hare should move only one unit
                hare += 1;
            }
            else {   //otherwise, if the random number generator were to generate a value between 9 and 10 (inclusive), the hare will be moved back 2 units
                hare -= 2;
            }

            //adjust the positions for tortoise and hare if they slipped left before square one
            if (tortoise < 1) {
                tortoise = 1;
            }
            if (hare < 1) {
                hare = 1;
            }

            //now we will check whether the tortoise or hare won the race, if the match is a draw, implement recursion
            if (tortoise >= 70) {   //tortoise wins the race
                System.out.println("TORTOISE WINS!! YAY!!!");
            }
            else if (hare >= 70) {   //hare wins the race
                System.out.println("Hare wins. Yuch");
            }
            else {
                //print current position of tortoise and hare
                for (int i = 1; i < tortoise; i++) {
                    System.out.println(" ");
                }
                System.out.println("T");  //prints out T each time
                for (int i = tortoise + 1; i < hare; i++) {
                    System.out.println(" ");
                }
                System.out.println("H");
            }
            System.out.println("H");
            
        }

    }
}