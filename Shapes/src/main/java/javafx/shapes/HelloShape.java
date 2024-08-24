package javafx.shapes;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloShape extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Line line = new Line(0, 0, 100, 200);
        line.setStroke(Color.BLUE);
        Line line1 = new Line(0, 0, 300, 100);
        line1.setStroke(Color.BLACK);

        Rectangle rectangle = new Rectangle(20, 25, 100, 140);
        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(Color.YELLOW);
        rectangle.setStrokeWidth(3);

        Rectangle rectangle1 = new Rectangle(250, 25, 100, 140);
        rectangle1.setStroke(Color.BISQUE);
        rectangle1.setFill(Color.YELLOWGREEN);
        rectangle1.setStrokeWidth(3);
        rectangle1.setArcHeight(25);
        rectangle1.setWidth(25);

        Circle circle = new Circle(100, 300, 75);
        circle.setStroke(Color.BLUEVIOLET);
        circle.setFill(Color.GAINSBORO);
        circle.setStrokeWidth(3);

        Ellipse ellipse = new Ellipse(300, 300, 75, 40);
        ellipse.setStroke(Color.BLACK);
        ellipse.setFill(Color.DARKGREEN);
        ellipse.setStrokeWidth(3);

        Arc arc = new Arc(150, 550, 100, 100, 90, 90);
        arc.setType(ArcType.OPEN);
        arc.setStroke(Color.BLACK);
        arc.setFill(null);
        arc.setStrokeWidth(3);

        Arc arc1 = new Arc(300, 550, 100, 100, 45, 90);
        arc1.setType(ArcType.CHORD);
        arc1.setStroke(Color.GAINSBORO);
        arc1.setFill(Color.CADETBLUE);
        arc1.setStrokeWidth(3);

        Arc arc2 = new Arc(500, 550, 100, 100, 45, 90);
        arc2.setType(ArcType.ROUND);
        arc2.setStroke(Color.BLUE);
        arc2.setFill(Color.AQUA);
        arc2.setStrokeWidth(3);

        root.getChildren().addAll(line, line1, rectangle, rectangle1, circle, ellipse, arc, arc1, arc2);

        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("New Shape!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}