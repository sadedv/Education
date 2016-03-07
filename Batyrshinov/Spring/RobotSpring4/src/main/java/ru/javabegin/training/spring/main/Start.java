package ru.javabegin.training.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.javabegin.training.spring.impls.robot.ModelT1000;

public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
		t1000.action();

		ModelT1000 t1000empty = (ModelT1000) context.getBean("t1000Empty");
		t1000empty.action();

		ModelT1000 t1000empty3 = (ModelT1000) context.getBean("t1000Empty3");
		t1000empty3.dance();
	}
}
