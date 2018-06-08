package com.company;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.Initializable;
import java.util.ResourceBundle;

import java.net.URL;



public class PieChartController {
    @FXML
    private AnchorPane Anchorpane2;

    @FXML
    private Button Re;

    @FXML
    private PieChart pieChart;

    @FXML
    private Button Sa;

    @FXML
    void RestartApp(ActionEvent event) {

    }

    @FXML
    void SaveToFile(ActionEvent event) {

    }

    public void initialize(URL url, ResourceBundle rb) {
        DieRoll Die = new DieRoll();

        //The pie chart! IT STORES THE VALUES FROM ARRAY3 BEFORE ARRAY3 IS EVEN ASSIGNED VALUES?!
        ObservableList<PieChart.Data> pieChartData
                = FXCollections.observableArrayList(
 /*
                new PieChart.Data("2",40),
                new PieChart.Data("3",30),
                new PieChart.Data("4",10),
                new PieChart.Data("5",20)
*/

                new PieChart.Data("2",Die.Array3[0]),
                new PieChart.Data("3",Die.Array3[1]),
                new PieChart.Data("4",Die.Array3[2]),
                new PieChart.Data("5",Die.Array3[3]),
                new PieChart.Data("6",Die.Array3[4]),
                new PieChart.Data("7",Die.Array3[5]),
                new PieChart.Data("8",Die.Array3[6]),
                new PieChart.Data("9",Die.Array3[7]),
                new PieChart.Data("10",Die.Array3[8]),
                new PieChart.Data("11",Die.Array3[9]),
                new PieChart.Data("12",Die.Array3[10])

        );


      pieChart.setData(pieChartData);



    }
}