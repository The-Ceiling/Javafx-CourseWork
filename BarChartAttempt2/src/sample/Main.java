package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.PieChart;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage firstStage) throws Exception {
        Parent root1 = FXMLLoader.load(getClass().getResource("BarChart.fxml"));
        firstStage.setTitle("BarChart");
        firstStage.setScene(new Scene(root1, 600, 325));
        firstStage.show();
    }




    public static void main(String[] args) {
        launch(args);
    }




    }



