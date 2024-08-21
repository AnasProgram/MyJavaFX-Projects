package javafxsimplepiechart.javafxapplication1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class Application3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button btn =new Button();
        btn.setText("Print a saying");
        btn.setMaxSize(200, 100);

        Button btn1 = new Button();
        btn1.setText("Print my best saying");

        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("^_^");
            }
        });
        btn1.setOnAction(actionEvent -> System.out.println("Think of your mind but don't think of your heart!"));
        btn.setOnAction(actionEvent -> System.out.println("Gib niemals auf, denn der Erfolg ist oft nur einen letzten Anlauf entfernt!"));
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        root.getChildren().add(btn1);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Anas Abazid");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
