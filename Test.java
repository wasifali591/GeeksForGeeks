//A Java program to demonstrate working of a Calss type object created by JVM to represent .class file in memory

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//Java code to demonstrate use of Class object created by JVM
public class Test{
	public static void main( String[] args ){
		Student s1= new Student();
		
		//getting hold of Class object created by JVM
		Class c1=s1.getClass();
		
		//Printing type of object using c1
		System.out.println(c1.getName());
		
		//getting all methods in an array
		Method m[]= c1.getDeclaredMethods();
		
		for(Method method:m){
			System.out.println(method.getName());
		}
		
		//getting all fields in an array
		Field f[]=c1.getDeclaredFields();
		
		for(Field field:f){
			System.out.println(field.getName());
		}
		
		Student s2 = new Student();
		// c2 will point to same object where c1 is pointing
		Class c2 = s2.getClass();
		System.out.println(c1==c2); // true
	}
}

//a sample calss whose information is fetched above using Class obejct
class Student{
	private String name;
	private int rollNo;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public int getRollNo(){
		return rollNo;
	}
	public void setRollNo(int rollNo){
		this.rollNo=rollNo;
	}
}	