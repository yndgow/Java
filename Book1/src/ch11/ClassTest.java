package ch11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		
		Person person = new Person();
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("ch11.Person");
		System.out.println(pClass3.getName());
		
		Class pClass4 = Class.forName("ch11.Person");
		
		Constructor[] cons = pClass4.getConstructors();
		for (Constructor c : cons) {
			System.out.println(c);
		}
		System.out.println();
		
		Method [] methods = pClass4.getMethods();
		for (Method m : methods) {
			System.out.println(m);
		}
		System.out.println("------");
		
		Field [] fields = pClass4.getFields();
		for (Field f : fields) {
			System.out.println(f);
			System.out.println(f.getName());
		}
	}
}
