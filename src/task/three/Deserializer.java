package task.three;

import java.io.*;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Deserializer {
    public void Deserializer(String URL) throws IOException {
        try (BufferedReader bufReader = new BufferedReader(new FileReader(URL))) {
            String line = bufReader.readLine();
            Gson carGSON = new GsonBuilder().create();
            Car car2 = carGSON.fromJson(line, Car.class);
            System.out.println(car2);
        } catch (IOException e) {
            throw e;
        }
    }
}