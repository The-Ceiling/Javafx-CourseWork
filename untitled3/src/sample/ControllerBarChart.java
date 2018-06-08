package sample;

import com.company.DieRoll;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;



public class ControllerBarChart implements Initializable{



    @FXML
    private GridPane Gridpane;

    @FXML
    private CategoryAxis X;

    @FXML
    private BarChart<?, ?> FrequencyBarChart;

    @FXML
    private NumberAxis Y;

    @Override
    public void initialize(URL url, ResourceBundle rb){
        DieRoll Die = new DieRoll();

        XYChart.Series set1 = new XYChart.Series<>();

        int[][] ArrayBar = Die.freqArray();

        set1.getData().add(new XYChart.Data("2", ArrayBar[1][0]));
        set1.getData().add(new XYChart.Data("3", ArrayBar[1][1]));
        set1.getData().add(new XYChart.Data("4", ArrayBar[1][2]));
        set1.getData().add(new XYChart.Data("5", ArrayBar[1][3]));
        set1.getData().add(new XYChart.Data("6", ArrayBar[1][4]));
        set1.getData().add(new XYChart.Data("7", ArrayBar[1][5]));
        set1.getData().add(new XYChart.Data("8", ArrayBar[1][6]));
        set1.getData().add(new XYChart.Data("9", ArrayBar[1][7]));
        set1.getData().add(new XYChart.Data("10",ArrayBar[1][8]));
        set1.getData().add(new XYChart.Data("11",ArrayBar[1][9]));
        set1.getData().add(new XYChart.Data("12",ArrayBar[1][10]));

        FrequencyBarChart.getData().addAll(set1);
    }
}
