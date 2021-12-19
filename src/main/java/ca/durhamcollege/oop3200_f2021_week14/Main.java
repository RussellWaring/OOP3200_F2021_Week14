package ca.durhamcollege.oop3200_f2021_week14;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

import org.kordamp.bootstrapfx.BootstrapFX;
import org.kordamp.bootstrapfx.scene.layout.Panel;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("main.fxml"));

        /*Label welcomeLabel = new Label("Welcome to Week 14");
        welcomeLabel.getStyleClass().setAll("h1");

        Button clickMeButton = new Button("Click Me!");
        clickMeButton.getStyleClass().setAll("btn", "btn-primary");

        HBox hbox = new HBox(welcomeLabel, clickMeButton);*/

        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        //Scene scene = new Scene(hbox, 640, 480);
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet()); // add stylesheets into scene!!
        stage.setTitle("OOP3200 - F2021 - Week 14");
        stage.setScene(scene);
        stage.setResizable(false); // disables window resizing
        stage.setAlwaysOnTop(true);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}