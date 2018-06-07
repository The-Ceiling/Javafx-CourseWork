package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;



public class ControllerPieChart implements Initializable {

        @FXML
        private PieChart pieChart;

    @Override
    public void initialize(URL url, ResourceBundle rb){

        double[] Array3 = {5,10,10,10,10,10,10,10,10,10,5};

        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
            new PieChart.Data("stese",32),
       /*     new PieChart.Data("3",Array3[1]),
            new PieChart.Data("4",Array3[2]),
            new PieChart.Data("5",Array3[3]),
            new PieChart.Data("6",Array3[4]),
            new PieChart.Data("7",Array3[5]),
            new PieChart.Data("8",Array3[6]),
            new PieChart.Data("9",Array3[7]),
            new PieChart.Data("10",Array3[8]),
            new PieChart.Data("11",Array3[9]),  */
            new PieChart.Data("back",68));

        pieChart.setData(pieChartData);
        }

    }


