# Javafx-CourseWork
PLEASE READ THE QUESTION AND UNDERSTAND IT OHHH…
Introduction
 In a casino there is a game called Craps. In craps, you as the “roller” bet some money and throw two dice. If you roll a 7 or 11 on your first roll you win. Similarly, if you roll a 2, 3 or 12 on your first roll you lose. If you roll anything else, that value becomes your “point”. You then keep rolling until you either: roll the value of your point again and win, or roll a value of 7 and lose. This game is based on the probabilities for the values of the sum of two dice rolls. We are however not going to play craps but instead do an analysis of the frequency of occurrence of the total value of two dice rolls which may come in handy if you ever do play Craps. 
We are going to generate a graph showing the frequency of occurrence for the sum of two dice rolls. The graph will be displayed using a selection of appropriate statistical graphic of your choice i.e. pie chart or bar graph etc. 
Functional Requirements
 You are required to build a working prototype of a user-friendly means of analyzing the frequency of occurrence for the sum of two dice rolls. 
1. In order to be ‘user-friendly’ the application should make use of a GUI such as can be built using the JavaFx classes. In other words, the functionality should be available to the user by means of forms, interactive dialogues, lists and buttons. 
2. On launch, the application should prompt the user to enter the amount of die rolls that should be performed. 
3. After the user has performed the rolls, they should be shown a textual representation of the following data from the rolls, an example is shown below: a. The “Win”, “Lose”, and “Roll Again” probabilities obtained from the set of rolls b. The total number of times that each face value was hit 
4. The user should then be able to view his/her data in a form of graphical representation such as a bar graph or pie chart. 
5. Additionally, the user should be able to select, from a list of possible options, the specific graphical representation that he/she desires. 
6. The user should have the option to save any of the pictorial graphical representations to a file. 
7. Finally, the user should also be able to restart the application
 
Task 1
Create a class that generates sum of 2 die rolls and returns a value. 
Create code that reads the total number of times face value was hit (Array 2) and outputs it to a window/scene in table form (Javafx).
Create Documentation for the Software we are creating.

Task 2
Create an array that stores X number (also size of the array) of “die roll” results, X is entered by the user. (Array1) these die rolls are the sum of 2 die rolls in part 1.
Create code that reads Array1 and counts how many times each number (2,3,4,5,6,7,8,9,10,11,12) occurs and stores the values in Array2[2][11]
Array2
2	3	4	5	6	7	8	9	10	11
#	#	#	#	#	#	#	#	#	#
# - frequency

Task 3
Create these formulas to read the number of roles in Array2 and calculate
Win- ((Number of times it lands on 7 + Number of times it lands on 11)/X) *100
Lose- ((Number of times it lands on 2 + Number of times it lands on 3 + Number of times it lands on 12)/X) *100
Roll Again- ((Number of times it lands on 4,5,6,8,9,10)/X) *100

Task 4 – javafx graphs
Create a Bar graph and Pie chart of the number of times the values in Array2 appear
o	Scene in which there is an option to choose which one to appear
o	Option to Save graph to a file after viewing it in scene
o	Option to restart the application
Bar graph X-axis first row in Array2 and Y-axis second row in Array2
Pie chart will be percentage of each value in row 1 of Array2 appears


Task 5 – javafx scenes with buttons and outputs of results
Create these scenes
1)	welcome and option to view documentation
2)	Enter Number of rolls to happen which will be stored as X 
3)	create scene which outputs the win, lose, roll again probabilities in Task 3
4)	create scene which outputs the values in Array2 in a table form
5)	connect scene where they choose which graph they want to see in Task 4
6)	button to restart the application
