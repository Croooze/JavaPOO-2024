package org.example.Exo4;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Interface {

public static void start(Stage primaryStage) {
    primaryStage.setTitle("Exemple d'interface graphique");

    Button btn = new Button("Cliquez-moi !");
    btn.setOnAction(e -> System.out.println("Hello World!"));

    StackPane root = new StackPane();
    root.getChildren().add(btn);

    primaryStage.setScene(new Scene(root, 300, 250));
    primaryStage.show();
    }
}