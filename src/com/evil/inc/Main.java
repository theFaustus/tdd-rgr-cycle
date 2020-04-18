package com.evil.inc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    public static final int HEIGHT = 510;
    public static final int WIDTH = 360;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("TDD with R.C.Martin");
        primaryStage.setScene(new Scene(root, WIDTH, HEIGHT));
        primaryStage.setAlwaysOnTop(true);
        primaryStage.setMaxHeight(HEIGHT);
        primaryStage.setMaxWidth(WIDTH);
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image("/resources/icon.png"));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
