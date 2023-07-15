package task.three;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException,
            InvocationTargetException, IOException {
        final Class<?> cls = Car.class;
        Constructor<?> constructor = cls.getConstructor(String.class, String.class, int.class, int.class, int.class, String.class, String.class);
        Car car1 = (Car) constructor.newInstance("Porsche", "911", 1990, 3600, 360, "rear", "black");

        Serializer.Serializer(car1, "Result.txt");

        Deserializer deselerializer = new Deserializer();
        deselerializer.Deserializer("Result.txt");
    }
}