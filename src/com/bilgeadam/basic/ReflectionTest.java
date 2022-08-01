package com.bilgeadam.basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		Method [] methods = Person.class.getDeclaredMethods();
		Constructor [] constructors = Person.class.getDeclaredConstructors();
		Field [] fields = Person.class.getDeclaredFields();
		
		for (Method method : methods) { //sınıftaki tanımlanmış metotları yazdırabiliyoruz.
			System.out.println(Person.class.getSimpleName() + " defined method for " + method.getName() + "class"); 
			
		}
		
		System.out.println("-----------------------------------------");
		
		for (Method method : Person.class.getMethods()) { //bütün metotları yazdırıyor
			System.out.println(Person.class.getSimpleName() + " all method for " + method.getName() + "class");
		}
		
		System.out.println("-----------------------------------------");
		
		for (@SuppressWarnings("unused") Constructor constructor : constructors) {
			System.out.println(Person.class.getDeclaredConstructors() + " declared constructor methods");
		}
		
		System.out.println("-----------------------------------------");
		
		for (@SuppressWarnings("unused") Constructor constructor : Person.class.getConstructors()) {
			System.out.println(Person.class.getSimpleName()+ " all constructor methods"); 
		}
		
		System.out.println("-----------------------------------------");
		
		for (@SuppressWarnings("unused") Field field : fields) {
			System.out.println(Person.class.getFields());
			
		}
		
		
 
	}

}
