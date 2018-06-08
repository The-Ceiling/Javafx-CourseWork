package com.company;

import com.company.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class ProbFreqController implements Initializable{
    DieRoll Die = new DieRoll();



   @FXML
   private Label Llose;

    @FXML
    private Pane rootPane;

    @FXML
    private Label L2;

    @FXML
    private Label L3;

    @FXML
    private Label L4;

    @FXML
    private Label L5;

    @FXML
    private Button update;

    @FXML
    private Label Lrollagain;

    @FXML
    private Label L6;

    @FXML
    private Label L10;

    @FXML
    private Label L7;

    @FXML
    private Label L8;

    @FXML
    private Label L12;

    @FXML
    private Label L9;

    @FXML
    private Label L11;

    @FXML
    private Label Lwin;

    @FXML
    private Button Next;

    @FXML
    void LoadGraph(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("ChooseGraph.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    @FXML
    void Refresh(ActionEvent event) {
    // Die.start(Die.UserNumber);


      String t2= String.valueOf(Die.Array2[1][0])
             ,t3= String.valueOf(Die.Array2[1][1])
             ,t4= String.valueOf(Die.Array2[1][2])
             ,t5= String.valueOf(Die.Array2[1][3])
             ,t6= String.valueOf(Die.Array2[1][4])
             ,t7= String.valueOf(Die.Array2[1][5])
             ,t8= String.valueOf(Die.Array2[1][6])
             ,t9= String.valueOf(Die.Array2[1][7])
             ,t10= String.valueOf(Die.Array2[1][8])
             ,t11= String.valueOf(Die.Array2[1][9])
             ,t12= String.valueOf(Die.Array2[1][10])
             ;


     L2.setText(String.valueOf(t2));
             L3.setText(String.valueOf(t3));
             L4.setText(t4);
             L5.setText(t5);
             L6.setText(t6);
             L7.setText(t7);
             L8.setText(t8);
             L9.setText(t9);
             L10.setText(t10);
             L11.setText(t11);
             L12.setText(t12);

             Lwin.setText (Die.probWin());
             Llose.setText(Die.probLose());
             Lrollagain.setText(Die.probRollagain());


    }

    @Override
    public void initialize(URL url, ResourceBundle resource){





    }


}
