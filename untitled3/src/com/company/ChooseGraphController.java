package com.company;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.io.IOException;

public class ChooseGraphController {

    @FXML
    private AnchorPane Anchorpane1;

    @FXML
    private Button PieChartButton;

    @FXML
    private Button BarGraphButton;

    @FXML
    void openPieChart(ActionEvent event) throws IOException {
        AnchorPane Anchorpane2= FXMLLoader.load(getClass().getResource("PieChart.fxml"));
        Anchorpane1.getChildren().setAll(Anchorpane2);
    }

    @FXML
    void openBarChart(ActionEvent event) throws IOException {
        GridPane Gridpane = FXMLLoader.load(getClass().getResource("BarChart.fxml"));
        Anchorpane1.getChildren().setAll(Gridpane);
    }

}