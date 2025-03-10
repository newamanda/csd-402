/**Amanda New
 * CSD402-A311
 * 03/02/25
 * Module 11: JavaFX Accordion Example
 * Sources listed below:
 * Source: https://jenkov.com/tutorials/javafx/accordion.html
 * Source: https://www.tutorialspoint.com/javafx/javafx_accordion.htm
 * Source: https://www.geeksforgeeks.org/javafx-titledpane-class/
 */

// default package for javafx
package com.example;

//import javafx for accordion (and vbox for the layout)
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */

//extend application
public class Mod11Accordion extends Application {

    //override is necessary for compiler to know that a method is going to be overwritten
    @Override
    //stage method and title for accordion and vbox
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Accordion Example");

        //create accordion
        Accordion accordion = new Accordion();

        //create and get panes
        TitledPane pane1 = new TitledPane("Click Here: 1", new Label("Hello!"));
        TitledPane pane2 = new TitledPane("Click Here: 2", new Label("Surprise!"));
        TitledPane pane3 = new TitledPane("Click Here: 3", new Label("Boo!"));

        accordion.getPanes().addAll(pane1, pane2, pane3);

        //configure layout for accordion
        VBox vbox = new VBox(accordion);
        Scene scene = new Scene(vbox, 250, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}