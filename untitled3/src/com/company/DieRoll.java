package com.company;


public class DieRoll {
    public int[][] Array2 = {{2,3,4,5,6,7,8,9,10,11,12}, {0,0,0,0,0,0,0,0,0,0,0}}; //second row stores frequency
    public double[] Array3 = {0,0,0,0,0,0,0,0,0,0,0};//array3 after these for loops stores the percentage of frequency of a roll to be used for the pie charts

    private int userInput;
    public int UserNumber; //THE NUMBER OF ROLLS TO BE PERFORMED

    private int roll() {
        int firstDie = (int) (Math.random() * 6) + 1;
        int secondDie = (int) (Math.random() * 6) + 1;
        return firstDie + secondDie;
        /*
        Math.random generates a number between 0 and 1,
        that isn't a whole number, and also isn't 1(0.9999).
        To get a number, for example between 0 and 10, multiply your answer by 10:
        Math.random() * 10
        To get it to be a whole number, i.e. an integer, apply Math.floor,
        which rounds down to the nearest whole number:
        Math.floor(Math.random() * 10)
        To get a whole number between 1 and 10, add 1 to the answer:
        Math.floor(Math.random() * 10 + 1)
         */
    }

    public void start(int pariInput) { //Start Everything and executes the codes in Order!
        userInput = pariInput;
        freq();
        percentagePieChart();


    }

    public void freq() {

//ENTERS ROLLS INTO ARRAY
        int[] Array1 = new int[userInput];//this array stores the rolls tha the user initiates, X-1 because array start from 0

        for (int i = 0; i != userInput; i++) { //this loop stores rolls in Array1 with X being the number of rolls to be done
            Array1[i] = roll();
            //System.out.println("value in Array1 position "+ i + " " + Array1[i]); // prints out the values in Array1
        }

//CALCULATE FREQUENCY
        for (int i = 0; i != userInput; i++) {//this loop looks at the values in Array1 and checks how many times the values in Array2 row 1 appear and increments the cell below the value by 1 if they match
            for (int v = 0; v != 11; v++) {
                if (Array1[i] == Array2[0][v]) {
                    Array2[1][v]++;//increments frequency of number when the if statement is true
                }
            }
        }
    }

    public int[][] freqArray(){
        return Array2;
    }

    public String probWin() { // set this the label!
        //show this in textual representation in scene
        //win percentage formula
        float win = (Array2[1][5]) + (Array2[1][9]);
        win = (win / userInput) * 100;
        System.out.println("win prob = " + win);
        String prob = String.valueOf(win);
        return prob;
    }

    public String probLose() {
        //lose percentage formula
        float lose = (Array2[1][0]) + (Array2[1][1]) + (Array2[1][10]); //first array position is frequency of 2 + second array position is frequency of 3 + third array position is frequency of 12
        lose = (lose / userInput) * 100;
        System.out.println("lose prob = " + lose);
        String prob = String.valueOf(lose);
        return prob;
    }

    public String probRollagain() {
        //roll again percentage formula and returns the prob in string form so the label can read it
        float rollagain = (Array2[1][2]) + (Array2[1][3]) + (Array2[1][4]) + (Array2[1][6]) + (Array2[1][7]) + (Array2[1][8]); //frequency of 4 + 5 + 6 + 8 + 9 + 10
        rollagain = (rollagain / userInput) * 100;
        System.out.println("rollagain prob = " + rollagain);
        String prob = String.valueOf(rollagain);
        System.out.println("rollagain prob after parsing to string " + prob);
        return prob;
    }

    public void percentagePieChart(){ //percentages of frequency for the pie chart
        for (int u=0; u!=11; u++){
            Array3[u]=(Array2[1][u]); //sets the values of freq of a roll stored in Array2 second row to Array3
        }
        for( int w=0; w!=11;w++){
            Array3[w] = ((Array3[w])/userInput);
        }
        for( int w=0; w!=11;w++){
            Array3[w] = ((Array3[w])*100);
            System.out.println(Array3[w]); //Test to show everything works up to Array3
        }

    }

}




