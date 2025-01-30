package pl.pawel.demo.customannotation;

import java.lang.reflect.Method;

public class AnnotationApp {
    public static void main(String[] args) throws Exception {
        Cat myCat = new Cat("Zenek");

        if (myCat.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println("Cat is very important" );
        } else {
            System.out.println("Cat isn't very important");
        }

        for (Method method : myCat.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(RunImmediately.class)) {
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                for (int i = 0; i < annotation.times(); i++) {
                    method.invoke(myCat);
                }
            }
        }
    }
}
