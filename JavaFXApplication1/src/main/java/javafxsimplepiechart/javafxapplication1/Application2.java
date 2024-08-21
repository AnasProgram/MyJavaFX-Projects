package javafxsimplepiechart.javafxapplication1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class Application2 extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        StackPane root = new StackPane();
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Circle circle1 = new Circle(300, 300, 100);
        circle1.setFill(Color.CADETBLUE);
        root.getChildren().add(circle1);
        Scene scene = new Scene(root, 600, 600);
//        stage.setTitle("Anas Abazid!");
//        stage.setScene(scene);
//        stage.show();
        stage.setTitle("Anas Abazid");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
