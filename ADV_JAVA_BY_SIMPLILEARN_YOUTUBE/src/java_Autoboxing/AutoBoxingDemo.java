package java_Autoboxing;

public class AutoBoxingDemo {

	public static void main(String[] args) {
		int i = 10;
		
		//AutoBox
		
		Integer iObj = Integer.valueOf(i);
		System.out.println("Value of Integer obj: "+ iObj);
		
		//Auto-UnBox
		int i1 = iObj;
		System.out.println("Value of i1: "+ i1);
		
		//AutoBox
		Character cObj = 'a';
		
		//Auto-UnBox
		char ch = cObj;
		System.out.println("Value of ch: "+ ch);
		System.out.println("Value of Character Obj: " + cObj);

	}

}
