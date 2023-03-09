package Chapter6AnnotationAndEnums;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface myAnnotation
{

    String name() default "sanny";

    String city() default "Surat";


    int value() default 100;
}