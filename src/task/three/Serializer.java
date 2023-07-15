package task.three;

import java.io.*;
import java.lang.reflect.*;

public class Serializer {
    public static void Serializer(Car car, String URL) throws IOException, IllegalAccessException {
        final Class<?> cls = Car.class;

        String dataToSerialize = "{";
        Field[] fields = cls.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            if (fields[i].isAnnotationPresent(Save.class)) {
                fields[i].setAccessible(true);
                dataToSerialize += "\"" + fields[i].getName() + "\":\"" + fields[i].get(car) + "\",";
            }
            if (i == fields.length - 1 && dataToSerialize.endsWith(",")) {
                dataToSerialize = dataToSerialize.substring(0, dataToSerialize.length() - 1);
                dataToSerialize += "}";
            }
        }
        if (dataToSerialize.length() == 1) {
            dataToSerialize += "}";
        }
        System.out.println(dataToSerialize);

        try (Writer writer = new FileWriter(URL)) {
            writer.write(dataToSerialize);
        } catch (IOException e) {
            throw e;
        }
    }
}
