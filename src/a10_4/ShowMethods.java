package a10_4;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import reflectDemo.ToyTest;


public class ShowMethods {
public static void main(String[] args) {
	Class<?> c=ToyTest.class;
//	Method[] methods=c.getMethods();
//	for (Method method : methods) {
//		System.out.println(method.toString());
//	}
//	Annotation[] anns=c.getAnnotations();
//	for (Annotation annotation : anns) {
//		System.out.println(annotation.toString());
//	}
	Field[] fields=c.getFields();
	for (Field field : fields) {
		System.out.println(field.toString());
	}
	Constructor[] constructors=c.getConstructors();
	for (Constructor constructor : constructors) {
		System.out.println(constructor.toString());
	}
}
}
