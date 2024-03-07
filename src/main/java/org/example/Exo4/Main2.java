package org.example.Exo4;

import javafx.application.Application;
import javafx.stage.Stage;
import java.io.IOException;

    public class Main2 extends Application {

        public static void main(String[] args) throws IOException, ClassNotFoundException {
            Singleton singletonInstance = Singleton.getInstance();
            System.out.println("Adresse mémoire de l'instance : " + System.identityHashCode(singletonInstance));

            ManipData.serialize(singletonInstance, "fichier.txt");
            ManipData.deserialize("fichier.txt");

            Interface.start(new Stage());
            launch(args);
        }

        @Override
        public void start(Stage stage) {

        }
    }

