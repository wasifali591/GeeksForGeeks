//Java code to demonstrate Class Loader subsystem

public class TestLoader{
	public static void main(String[] args){
		//String class is loaded by bootstrap loader, and bootstrap loader is not Java object, hence null
		System.out.println(String.class.getClassLoader());
		
		//Test calss is loaded by application loader
		System.out.println(TestLoader.class.getClassLoader());
	}
}