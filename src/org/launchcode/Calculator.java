package org.launchcode;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Calculator extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        stage.setTitle("Calculator");
        stage.setWidth(250);
        stage.setHeight(250);

        GridPane root = new GridPane();

        Button getal1 = new Button("1");
        Button getal2 = new Button("2");
        Button getal3 = new Button("3");
        Button getal4 = new Button("4");
        Button getal5 = new Button("5");
        Button getal6 = new Button("6");
        Button getal7 = new Button("7");
        Button getal8 = new Button("8");
        Button getal9 = new Button("9");
        Button getal0 = new Button("0");

        Button is = new Button("=");
        Button plus = new Button("+");
        Button min = new Button("-");
        Button keer = new Button("*");
        Button delen = new Button("/");


        Button antwoord = new Button();
        getal1.setPrefSize(50, 50);
        getal2.setPrefSize(50, 50);
        getal3.setPrefSize(50, 50);
        getal4.setPrefSize(50, 50);
        getal5.setPrefSize(50, 50);
        getal6.setPrefSize(50, 50);
        getal7.setPrefSize(50, 50);
        getal8.setPrefSize(50, 50);
        getal9.setPrefSize(50, 50);
        getal0.setPrefSize(50, 50);

        is.setPrefSize(50, 50);
        plus.setPrefSize(50, 50);
        min.setPrefSize(50, 50);
        keer.setPrefSize(50, 50);
        delen.setPrefSize(50, 50);

        root.add(getal1, 0, 0 );
        root.add(getal2, 1, 0);
        root.add(getal3, 2, 0);
        root.add(getal4, 0, 1);
        root.add(getal5, 1, 1);
        root.add(getal6, 2, 1);
        root.add(getal7, 0, 2);
        root.add(getal8, 1, 2);
        root.add(getal9, 2, 2);
        root.add(getal0, 1, 3);
        root.add(is, 2, 3);
        root.add(plus, 3, 3);
        root.add(min, 3, 2);
        root.add(keer, 3, 1);
        root.add(delen, 3, 0);

        root.setVgap(10);
        root.setHgap(10);
        root.setPadding(new Insets(50));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();











        stage.show();
    }
}
