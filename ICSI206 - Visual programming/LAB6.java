package com.example.demo;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LAB6 extends Application {
    private static final double WIDTH = 500;
    private static final double HEIGHT = 500;

    @Override
    public void start(Stage primaryStage) {
        Polyline polyline = new Polyline();
        ObservableList<Double> list = polyline.getPoints();
        Group group = new Group();

        double scaleFactor = 0.0125;
        for (int x = -100; x <= 100; x++) {
            list.add(x + 200.0);
            list.add(200 - scaleFactor * x * x);
        }
        group.getChildren().add(polyline);

        Line line1 = new Line(10, 200, 390, 200);
        group.getChildren().add(line1);

        Line line2 = new Line(200, 30, 200, 390);
        group.getChildren().add(line2);

        Line line3 = new Line(390, 200, 370, 190);
        group.getChildren().add(line3);
        Line line4 = new Line(390, 200, 370, 210);
        group.getChildren().add(line4);

        Line line5 = new Line(200, 30, 190, 50);
        group.getChildren().add(line5);
        Line line6 = new Line(200, 30, 210, 50);
        group.getChildren().add(line6);

        Text text1 = new Text(380, 170, "X");
        Text text2 = new Text(220, 40, "Y");
        group.getChildren().addAll(text1, text2);

        Scene scene = new Scene(new BorderPane(group), WIDTH, HEIGHT);
        primaryStage.setTitle(getClass().getName());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}