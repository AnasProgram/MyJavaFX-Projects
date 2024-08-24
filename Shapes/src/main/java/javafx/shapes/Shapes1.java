package javafx.shapes;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.BlendMode;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

import java.io.IOException;

public class Shapes1 extends HelloShape
{
    @Override
    public void start(Stage stage) throws IOException {
        Group group = new Group();

        Rectangle rectangle = new Rectangle();
        rectangle.setX(50);
        rectangle.setY(50);
        rectangle.setWidth(50);
        rectangle.setHeight(50);
        rectangle.setFill(Color.CHOCOLATE);

        Circle circle = new Circle();
        circle.setFill(Color.CYAN);
        circle.setCenterX(50);
        circle.setCenterY(50);
        circle.setRadius(25);
        circle.setBlendMode(BlendMode.DIFFERENCE);

        group.getChildren().add(rectangle);
        group.getChildren().add(circle);


        Scene scene = new Scene(group, 550, 250, Color.web("0x0000FF", 1.0));
        stage.setTitle("Anas Abazid!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
