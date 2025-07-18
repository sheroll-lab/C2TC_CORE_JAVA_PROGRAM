package C2TC_CORE_JAVA_PROGRAM.src.Day21.userdefinedannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SmartPhone {
    String os() default "Android";

    int version() default 1;
}
