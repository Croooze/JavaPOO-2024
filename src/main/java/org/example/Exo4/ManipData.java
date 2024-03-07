package org.example.Exo4;

import java.io.*;

public class ManipData {
        public static void serialize(Object obj, String filePath) throws IOException {
            try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
                outputStream.writeObject(obj);
            }
        }
        public static void deserialize(String filePath) throws IOException, ClassNotFoundException {
            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath))) {
                inputStream.readObject();
            }
        }
    }


