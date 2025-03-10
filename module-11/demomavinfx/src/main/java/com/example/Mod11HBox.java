/**Amanda New
 * CSD402-A311
 * 03/02/25
 * Module 11: JavaFX HBox Example
 * Sources listed below:
 * Source: https://jenkov.com/tutorials/javafx/hbox.html
 * Source: https://www.youtube.com/watch?v=NYGHL8N6Kc8
 * Source: https://www.geeksforgeeks.org/javafx-hbox-class/
 */

// default package for javafx
package com.example;

//JavaFX imports for HBox 
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

//extend application
public class Mod11HBox extends Application {

    //override is necessary for compiler to know that a method is going to be overwritten
    @Override

    //stage method and title for hbox
    public void start(Stage primaryStage) {
        primaryStage.setTitle("HBox Mod 11");

        //create buttons
        Button button1 = new Button("WOW!");
        Button button2 = new Button("JavaFX Rocks!");

        //create hbox and set style guidelines (margins, spacing, etc)
        HBox hbox = new HBox(15);
        hbox.getChildren().addAll(button1, button2);
        HBox.setMargin(button1, new Insets(10, 10, 10, 10));
        HBox.setMargin(button2, new Insets(10, 10, 10, 10));
        hbox.setSpacing(10);

        //create scene to add hbox into
        Scene scene = new Scene(hbox, 200, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //main method
    public static void main(String[] args) {
        launch(args);
    }

}