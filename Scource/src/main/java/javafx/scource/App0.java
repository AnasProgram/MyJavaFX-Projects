package javafx.scource;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class App0 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Button button = new Button();
        button.setText("Anas Abazid");
        button.setStyle("-fx-background-color: LIGHTGREEN");
        Label label = new Label("My first APP");
        label.setStyle("-fx-background-color: GREY");
        TextField textField = new TextField("text field");
        textField.setStyle("-fx-font-size:24px");
        textField.setStyle("-fx-background-color: #2980b9;");
        RadioButton radioButton = new RadioButton("radio button");
        Hyperlink hyperlink = new Hyperlink("https://github.com/AnasProgram");
        CheckBox checkBox = new CheckBox("check box");
        ProgressBar progressBar = new ProgressBar();
        ScrollBar scrollBar = new ScrollBar();
        Image image = new Image("src/main/java/javafx.scource/aawpwnuou.webp");
        Button button1 = new Button("GitHub",new ImageView(image));

        PasswordField passwordField = new PasswordField();

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(18);
        root.setVgap(40);
        root.setPadding(new Insets(23, 23, 23, 23));

        root.add(button, 0, 0);
        root.add(label, 1 , 1);
        root.add(textField,2, 0);
        root.add(passwordField,0, 3);
        root.add(hyperlink, 1, 1);
        root.add(checkBox, 2 , 1);
        root.add(scrollBar, 0, 1);
        root.add(progressBar, 1, 2);
        root.add(radioButton,0,2);
        root.add(button1, 2, 2);

        Scene scene = new Scene(root, 500, 350);
        stage.setTitle("GUI Controls!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
