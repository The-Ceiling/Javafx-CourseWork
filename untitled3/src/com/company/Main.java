package com.company;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;



public class Main extends Application {

    Stage window;
    public Scene scene1, scene2, scene3, scene4, scene5, scene6, scene7;

    DieRoll Die = new DieRoll();

    @Override
    public void start(Stage primaryStage) throws Exception  {
        window = primaryStage;
        TextField nameInput = new TextField();
        Button button9 = new Button("SUBMIT");
        button9.setOnAction(e -> isInt(nameInput, nameInput.getText()));


        Label label1 = new Label("Welcome to the analysis of two Die roll frequencies");
        Button button1 = new Button("Start");
        button1.setOnAction(event -> window.setScene(scene2));


        AnchorPane layout1 = new AnchorPane();
        layout1.getChildren().addAll(label1,button1);
        AnchorPane.setTopAnchor(label1, 110.0);
        AnchorPane.setLeftAnchor(label1, 30.0);
        AnchorPane.setTopAnchor(button1, 140.0);
        AnchorPane.setLeftAnchor(button1, 140.0);
        scene1 = new Scene(layout1,330,300);



        Button button3 = new Button("Next");
        button3.setOnAction(event -> window.setScene(scene3));



        Label label7 = new Label("Enter The Number Of Rolls That Should Be Performed");
        AnchorPane layout2 = new AnchorPane();
        AnchorPane.setTopAnchor(label7, 75.0);
        AnchorPane.setLeftAnchor(label7, 20.0);
        AnchorPane.setTopAnchor(nameInput, 100.0);
        AnchorPane.setLeftAnchor(nameInput, 90.0);
        AnchorPane.setTopAnchor(button9, 130.0);
        AnchorPane.setLeftAnchor(button9, 135.0);
        AnchorPane.setTopAnchor(button3, 260.0);
        AnchorPane.setLeftAnchor(button3, 145.0);

        layout2.getChildren().addAll(label7, nameInput, button9, button3);
        scene2 = new Scene(layout2, 330,300);



        Label label3 = new Label("Probabilities");

        Button button5 = new Button("Choose Graph");
        button5.setOnAction(event -> window.setScene(scene4));



    /*   StackPane layout3 = new StackPane();
        StackPane.setAlignment(button5,  Pos.BOTTOM_CENTER);
        StackPane.setAlignment(label3,  Pos.TOP_CENTER);
        layout3.getChildren().add(label3);
        layout3.getChildren().add(button5);
        scene3 = new Scene(layout3, 600,300);
*/

        Label label4 = new Label("Choose a Graph type to see a visual representation of your data");

        Button button7 = new Button("Pie Graph");
        button7.setOnAction(event -> window.setScene(scene6));

        StackPane.setAlignment(button7, Pos.BOTTOM_LEFT);

        Button button10 = new Button("Bar Graph");
        button10.setOnAction(event -> window.setScene(scene5));
        StackPane.setAlignment(button10, Pos.BOTTOM_RIGHT);


        StackPane layout4 = new StackPane();
        StackPane.setAlignment(label4, Pos.TOP_CENTER);
        layout4.getChildren().add(label4);
        layout4.getChildren().add(button7);
        layout4.getChildren().add(button10);
        scene4 = new Scene(layout4, 600,300);

        Label label5 = new Label("Choose a Graph");
        Button button8 = new Button("Enter");


        StackPane layout5 = new StackPane();
        scene5 = new Scene(layout5, 600, 300);// this should be the pie chart



        window.setScene(scene1);
        window.setTitle("Probability Analysis");
        window.show();


        //Creating a scene object
       // scene6 = new Scene(root0, 500, 450);
        //Creating a Group object
        //Group root0 = new Group(pieChart);

        Parent root1 = FXMLLoader.load(getClass().getResource("BarChart.fxml"));
        scene5 = new Scene(root1, 500, 450);

        Parent root2 = FXMLLoader.load(getClass().getResource("ProbFreq.fxml"));
        scene3 = new Scene(root2, 750, 550);










    }
    public boolean isInt(TextField input, String message) {
        try {
            Die.UserNumber = Integer.parseInt(input.getText());
            Die.start(Die.UserNumber); //THIS STARTS THE code in dieroll class AFTER USER INPUT HAS BEEN GIVEN
            System.out.println("Users input is : " + Die.UserNumber);
          for(int i =0;i<11;i++) {
                System.out.println("freq in array 2 "+Die.Array2[1][i]); //Test to show everything works up to Array2
            }

            return true;
        } catch (NumberFormatException e) {
            System.out.println("Error!" + message + "... is not an Integer");
            return false;
        }
    }


    public static void main(String[] args){

        launch(args);
        System.out.println("oh frick");

    }
}
