package test1;

import java.lang.reflect.Method;

class Person{
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class Execute {
	
	public static void main(String[] args) {
		Class clazz = Person.class;
		try {
			Object obj = clazz.newInstance();
			Method[] ms = clazz.getDeclaredMethods();
			for(Method me : ms) {
				if(me.getName().equals("setAge")) {
					me.invoke(obj,10);
				}else {
					Object o = me.invoke(obj);
					System.out.println(o);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
