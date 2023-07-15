package task.two;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String [] args) throws InvocationTargetException, IllegalAccessException {
        final Class<?> cls= Container.class;
        Method []methods=cls.getDeclaredMethods();
        for (Method method:methods){
            if(cls.isAnnotationPresent(SaveTo.class)&&method.isAnnotationPresent(Saver.class)) {
                Container container=new Container();
                SaveTo saveTo=cls.getAnnotation(SaveTo.class);
                method.invoke(container,saveTo.path());
            }
        }
    }
}
