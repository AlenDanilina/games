package ru.devray.tutorial.maivendemo;

import org.openqa.selenium.WebDriver;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Games p = new Games ();
        try {
            Method[] methods =
                    p.getClass ().getDeclaredMethods ();
            for (Method method : methods) {
                method.setAccessible (true);
                Annotation[] annotations = method.getDeclaredAnnotations ();
                for (Annotation annotation : annotations) {
                    if (annotation instanceof Marker) {
                        method.invoke (p);
                    }
                }
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace ();
        }
    }
}

