package task.one;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        final Class<?> cls=Bank.class;
        Bank bank=new Bank();

        Method[] methods=cls.getDeclaredMethods();
        for (Method method:methods){
            if (method.isAnnotationPresent(SuperAnnotation.class)){
                System.out.println("Method \""+method.getName()+"\" has annotation. And the output of this method is as follows:");
                SuperAnnotation sa=method.getAnnotation(SuperAnnotation.class);
                System.out.println(bank.infoPrinter(sa.creditAmount(), sa.interestRate(), sa.creditInstitution()));
            }
            if (!method.isAnnotationPresent(SuperAnnotation.class)){
                System.out.println("Method \""+method.getName()+"\" does't have annotation and it will not be performed this time.");
            }
        }
    }
}