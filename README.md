# ProgrammingAssignments
Repository Containing Assignments completed for Software Design Lab

# The following shows the prompts for each assignment to keep track of what we were assigned.

<h3>Programming Assignment # 1</h3>
Install your most preferred Java IDE, and implement textbook (9/E) problem 3.16 in page 101. The problem statement is reproduced next:
3.16  (Target-Heart-Rate Calculator) While exercising, you can use a heart-rate monitor to see that your heart rate stays within a safe range suggested by your trainers and doctors. According to the  American Heart Association (AHA), the formula for calculating your maximum heart rate in beats per minute is 220 minus your age in years. Your target heart rate is a range that's 50-85% of your maximum heart rate.  Note: These formulas are estimates provided by the AHA. Maximum and target heart rates may vary based on the health, fitness and gender of the individual. Always consult a physician or qualified health care professional before beginning or modifying an exercise program.

Create a class called  HeartRates. The class attributes should include the person's first name, last name and date of birth (consisting of separate attributes for the month, day and year of birth). Your class should have a constructor that receives this data as parameters. For each attribute provide set and get methods. The class also should include a method that calculates and returns the person's age (in years), a method that calculates and returns the person's maximum heart rate and a method that calculates and returns the person's target heart rate. Write a Java application that prompts for the person's information, instantiates an object of class  HeartRates and prints the information from that object—including the person's first name, last name and date of birth—then calculates and prints the person's age in (years), maximum heart rate and target-heart-rate range.


<h3>Programming Assignment #2</h3>
Implement textbook (9/E) problem 7.28 in page 303. The problem statement is reproduced next:
7.28 (Simulation: The Tortoise and the Hare) In this problem, you'll re-create the classic race of the tortoise and the hare. You'll use random-number generation to develop a simulation of this memorable event. Our contenders begin the race at square 1 of 70 squares. Each square represents a possible position along the race course. The finish line is at square 70. The first contender to reach or pass square 70 is rewarded with a pail of fresh carrots and lettuce. The course weaves its way up the side of a slippery mountain, so occasionally the contenders lose ground. A clock ticks once per second. With each tick of the clock, your application should adjust the position of the animals according to the rules in Fig. 7.32. Use variables to keep track of the positions of the animals (i. e., position numbers are 1—70). Start each animal at position 1 (the "starting gate"). If an animal slips left before square 1, move it back to square 1.

<center><img src ="https://www-cs.ccny.cuny.edu/~akira/cs221/progs/Fig7.32.png" alt = "animal move unit" /></center>

Generate the percentages in Fig. 7.32 by producing a random integer i in the range 1 ≤ i ≤ 10. For the tortoise, perform a "fast plod" when 1 ≤ i ≤ 5, a "slip" when 6 ≤ i ≤ 7 or a "slow plod" when 8 ≤ i ≤ 10. Use a similar technique to move the hare. Begin the race by displaying
        BANG !!!!! 
        AND THEY'RE OFF !!!!!
Then, for each tick of the clock (i. e., each repetition of a loop), display a 70-position line showing the letter T in the position of the tortoise and the letter H in the position of the hare. Occasionally, the contenders will land on the same square. In this case, the tortoise bites the hare, and your application should display OUCH!!! beginning at that position. All output positions other than the T, the H or the OUCH!!! (in case of a tie) should be blank. After each line is displayed, test for whether either animal has reached or passed square 70. If so, display the winner and terminate the simulation. If the tortoise wins, display TORTOISE WINS!!! YAY!!! If the hare wins, display Hare wins. Yuch. If both animals win on the same tick of the clock, you may want to favor the tortoise (the "underdog"), or you may want to display It's a tie. If neither animal wins, perform the loop again to simulate the next tick of the clock.
When you're ready to run your application, assemble a group of fans to watch the race. You'll be amazed at how involved your audience gets! Later in the book, we introduce a number of Java capabilities, such as graphics, images, animation, sound and multithreading. As you study those features, you might enjoy enhancing your tortoise-and-hare contest simulation.


<h3>Programing Assignment #3</h3>
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
