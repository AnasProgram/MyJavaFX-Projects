package javafxsimplepiechart.javafxapplication1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Application4 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Image backgroundImage = new Image("file:/E:/Desktop/Daraa.png");

        BackgroundImage background = new BackgroundImage(backgroundImage,
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, false));

        GridPane grid = new GridPane();

        grid.setBackground(new Background(background));



        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setPadding(new Insets(20, 20, 20, 20));
        Scene scene = new Scene(grid,400,500);
        Text text = new Text("login:");
        text.setFont(Font.font("Arial Black", FontWeight.BOLD, 35));
        text.setFill(Color.web("#66ff66"));

        text.setFont(Font.font("Tahoma", FontWeight.LIGHT, 0));
        Label userName = new Label("User Name");
        TextField textField = new TextField("Enter your user name");

        userName.setStyle("-fx-font-weight: bold; -fx-font-family: 'Arial Black'; -fx-font-size: 15px; -fx-text-fill: #ffff00;");

//        scene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());


        Label password = new Label("Password:");
        TextField textField1 = new TextField("Enter your password");
        password.setStyle("-fx-font-weight: bold; -fx-font-family: 'Arial Black'; -fx-font-size: 15px; -fx-text-fill: #ffff00;");

        PasswordField passwordField = new PasswordField();
        grid.add(text, 0, 0, 2, 1);
        grid.add(userName, 0, 1);
        grid.add(textField, 1, 1);
        grid.add(password, 0 , 2);
        grid.add(textField1,1, 2);

        grid.setGridLinesVisible(false);
        Button btn = new Button("Click here!");
        btn.setStyle("-fx-font-weight: bold; -fx-font-family: 'Arial Black'; -fx-font-size: 15px; -fx-text-fill: #000000; -fx-background-color: green");
        HBox hbtn = new HBox(20);
        hbtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbtn.getChildren().add(btn);
        grid.add(hbtn, 1, 3);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        btn.setOnAction(event ->{ actiontarget.setFill(Color.BLUE);
        actiontarget.setText("Submitted");
        });

        primaryStage.setTitle("Login Page");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
