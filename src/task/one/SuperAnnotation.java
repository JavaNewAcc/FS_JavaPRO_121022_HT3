package task.one;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SuperAnnotation {
    int creditAmount();
    double interestRate() default 10.5;
    String creditInstitution();
}
