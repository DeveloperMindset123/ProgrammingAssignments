import java.util.Scanner;

/*The following is the prompt of the assignment:
Write a complete Java program including comments to do the following:

 

   Outline:

     The program will compute baseball statistics.  The program will read in the id number and the won‑lost record of a baseball team.  It will compute various things about the team, and it will print everything out.  Then it will repeat the process for a new team, over and over again, until the entire set of data has been taken care of.  At the end, it will print the number of teams.

 

 

   Here are the details:

 

1.  The program will read in the id number of a team (see step 5 below).  The program will read in the number of wins this team has and the number of losses.  For example, the program could read in the following three pieces of data--and it will print everything read in:

 

1234   5  7     [this says team 1234 has 5 wins, 7 losses]

 

 

2.  The program will compute (and print) the total number of games played, which is simply the number of wins plus the number of losses.   The program will also print the number of games remaining in the season, which is 25 minus the total number of games played.

 

If the total number of games played is exactly 25, the program will print a message saying the season is finished.  If the total is less than 25, the program will print how many games are remaining in the season.  You can assume that no team has played more than 25 games (see optional 3 below).

 

     For example, for the team shown above, the total number of games played is 12, and there are 13 games remaining (25 – 12 = 13).

 

 

3.  The program will compute the team's winning average, which is a decimal value between 0 and 1.  The winning average is defined to be the number of games won divided by the total number of games played.  For the team shown above, the winning average is 5  / 12 = 0.4167.  The program should print this out as shown above, with exactly 4 decimal places.

 

 

4.  The program will compare the number of games remaining to both the number of games won and the number of games lost, printing two separate messages--one for each comparison.  (Each question below must have a single message printed for it.)

First, the program will determine whether or not the number of games remaining is greater than or equal to the number won.  Print an appropriate message in either case.

 

Then the program will determine whether or not the number of games remaining is greater than the number lost; it will print an appropriate message in either case.

 

Note that these two questions are not the same.  And note carefully the phrasing of the two questions—if possible, use my phrasing.  You must test all of the four possible combinations of yes/no answers to these questions – see below.

 

 

5.  Then the program should skip a few lines of output and repeat the entire series of steps for the next team, and so on, until the last team has been processed.  You must decide how to recognize that the last team has been processed. 

 

6.  At that point, print the total number of teams in the league, then stop.

 

 

DATA:  Read in data for at least 8-10 teams.  Make sure that at least three teams have completed their season, and at least five have not.  Have at least three teams with more wins than losses, at least two with an even record, and at least three with more losses than wins.  Have a team with the number of wins equal to the number remaining, and have a team with the number of losses equal to the number remaining.  Have a team with all wins, and have a team with all losses. (You may read data interactively or from a file. If you use an external file, print and hand in a copy of the data.)

Make sure that every possible path is covered by a set of data. 

 

    Here is a complete set of output for a typical team:

 

team 9867

4 wins   12 losses

total number of games played is 16              9 games remaining

the winning average is 0.2500

number of games remaining is greater than or equal to number won

number of games remaining is not greater than number lost

 

 

OPTIONALS:  1. For each team that has not completed the season, compute the team's record if it wins all of the remaining games (give the won-lost record and the winning average), and the record if it loses all of the remaining games.

 

2.  Keep track of the team with the best winning average that is not exactly 1.  Print this out at the end.  Do the same just for those teams that have completed their season.

 

3.  If a team has completed more than 25 games, print an error message, ask the user to type in new data (repeat if necessary).  Do NOT process the original set of data.
 */

public class BaseballStats {
    public static void main(String[] args) {
        //initialize variables 
        int numTeams = 0;
        int bestTeamID = 0;
        double bestWinningAverage = 0;

        Scanner scanner = new Scanner(System.in);

        //loop through teams
        while (true) {
            //read in team data
            System.out.print("Enter team ID number (or -1 to quit): ");
            int teamID = scanner.nextInt();   //this is how we read an integer input

            //check for the end of input
            if (teamID == -1) {
                break;
            }

            System.out.print("Enter number of wins: ");
            int numWins = scanner.nextInt();  //state the number of wins the team has had

            System.out.print("Enter number of losses: ");
            int numLosses = scanner.nextint();  //state the number of losses the team has had

            //calculate total number of games played
            int numGamesPlayed = numWins + numLosses;

            //print team data 
            System.out.println("\nTeam " + teamID + "\n" + numWins + " wins\t" + numLosses + " losses");
            System.out.println("Total number of games played is " + numGamesPlayed + "\t" + (25 - numGamesPlayed + " games remaining."));  //purpose of \t: insert a tab in the text at this point

            //conditional statement that will check if season is finished
            if (numGamesPlayed == 25) {
                System.out.println("The season is finished.");
            }
            else {
                System.out.println("The season is not finished.");
            }

            //calculate winning average
            double winningAverage = (double) numWins / numGamesPlayed;
            System.out.printf("The winning average is %.4f\n", winningAverage);     //System.out.printf() function allows user to print formatted data

            //check if the remaining games is greater than or equal to the number of wins
            if ((25 - numGamesPlayed) >= numWins) {
                System.out.println("Number of games remaining is greater than or equal to number won.");
            }
            else {
                System.out.println("Number of games remaining is not greater than number won.");
            }

            //check if the remaining games is greater than or equal to the number of losses
            if ((25 - numGamesPlayed >= numLosses)) {
                System.out.println("Number of games remaining is greater than or equal to number lost.");
            }
            else {
                System.out.println("Number of games remaining is not greater than number lost.");
            }

            //check for the end of input--> indicating we have collected all the information pertainning to one team, now we will print out the neccessary information
            numTeams++;
            if (numTeams == 1) {  //we will use this to keep track of the best team
                bestTeamID = teamID;
                bestWinningAverage = winningAverage;
            }
            else {
                if (winningAverage > bestWinningAverage && winningAverage < 1.0) {
                    bestTeamID = teamID;
                    bestWinningAverage = winningAverage;
                }
            }

        }

        //print total number of teams
        System.out.println("Total number of teams: " + numTeams);  //this will print out the total number of teams
        scanner.close();
    }
}

