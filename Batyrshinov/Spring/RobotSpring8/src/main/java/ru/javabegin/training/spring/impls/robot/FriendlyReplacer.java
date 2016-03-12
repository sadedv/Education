package ru.javabegin.training.spring.impls.robot;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class FriendlyReplacer implements MethodReplacer {
    public Object reimplement(Object o, Method m, Object[] a)
            throws Throwable {

        System.out.println("Hola");

        return null;
    }
}