package JavaFXsimplepiechart;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    ObservableList<PieChart.Data> pieChartData;
    @FXML
    private PieChart dia;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Jan", 1),
                new PieChart.Data("Feb", 2),
                new PieChart.Data("Mrz", 3),
                new PieChart.Data("Apr", 4),
                new PieChart.Data("Okt", 10)
        );
        welcomeText.setText("Welcome to JavaFX Application!");
        dia.getData().addAll(pieChartData);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
