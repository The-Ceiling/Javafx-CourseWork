
package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import java.net.URL;
import java.util.ResourceBundle;



public class ControllerBarChart implements Initializable{

    @FXML
    private CategoryAxis X;

    @FXML
    private BarChart<?, ?> FrequencyBarChart;

    @FXML
    private NumberAxis Y;

    @Override
    public void initialize(URL url, ResourceBundle rb){

        XYChart.Series set1 = new XYChart.Series<>();
//This bar graph relies on the data in Array2, so find a way to let it acces the real one, not this fake test version!!!
        int[][] Array2 = {{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, {633, 342, 649, 223, 771, 222, 918, 121, 563, 298, 827}};

        set1.getData().add(new XYChart.Data("3", Array2[1][0]));
        set1.getData().add(new XYChart.Data("3", Array2[1][1]));
        set1.getData().add(new XYChart.Data("4", Array2[1][2]));
        set1.getData().add(new XYChart.Data("5", Array2[1][3]));
        set1.getData().add(new XYChart.Data("6", Array2[1][4]));
        set1.getData().add(new XYChart.Data("7", Array2[1][5]));
        set1.getData().add(new XYChart.Data("8", Array2[1][6]));
        set1.getData().add(new XYChart.Data("9", Array2[1][7]));
        set1.getData().add(new XYChart.Data("10",Array2[1][8]));
        set1.getData().add(new XYChart.Data("11",Array2[1][9]));
        set1.getData().add(new XYChart.Data("12",Array2[1][10]));

        FrequencyBarChart.getData().addAll(set1);
    }
}
