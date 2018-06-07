package com.company;
import com.sun.javafx.scene.control.skin.LabeledImpl;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {

    Stage window;
    Scene scene1, scene2, scene3, scene4, scene5;



    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;

        Label label1 = new Label("Welcome to the analysis of two roll frequencies");
        Button button1 = new Button("Start");
        button1.setOnAction(event -> window.setScene(scene2));

        Button button2 = new Button("Exit");
        button2.setOnAction(event -> window.setScene(scene1));

        //layout1
        VBox layout1 = new VBox(50);
        layout1.getChildren().addAll(label1,button1,button2);
        scene1 = new Scene(layout1,600,300);

        Label label2 = new Label("Enter number of rolls to be done");

        Button button3 = new Button("next");
        button3.setOnAction(event -> window.setScene(scene3));

        StackPane layout2 = new StackPane();
        StackPane.setAlignment(label2,  Pos.TOP_CENTER);
        layout2.getChildren().add(label2);
        layout2.getChildren().add(button3);
        scene2 = new Scene(layout2, 600,300);



        Label label3 = new Label("Probabilities");

        Button button4 = new Button("back");
        button4.setOnAction(event -> window.setScene(scene2));
        Button button5 = new Button("next");
        button5.setOnAction(event -> window.setScene(scene4));

        VBox layout3 = new VBox(40);
        layout3.getChildren().addAll(label3,button4,button5);
        scene3 = new Scene(layout3, 600,300);

        Label label4 = new Label("Frequency of the values");
        Button button6 = new Button("back");
        button4.setOnAction(event -> window.setScene(scene3));
        Button button7 = new Button("next");
        button5.setOnAction(event -> window.setScene(scene4));

        VBox layout4 = new VBox(40);
        layout4.getChildren().addAll(label4,button6,button7);
        scene4 = new Scene(layout4, 600,300);



        window.setScene(scene1);
        window.setTitle("probality analysis");
        window.show();




    }
}
