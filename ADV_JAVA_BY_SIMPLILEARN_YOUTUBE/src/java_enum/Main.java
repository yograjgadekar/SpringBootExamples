package java_enum;

public class Main {

	public static void main(String[] args) {
		Color c1 =  Color.RED;
		
		System.out.println("Red Enum Name is:" +c1.name());
		System.out.println("Red Enum Value is:" +c1.getValue());
		
		for(Color color : Color.values())
		{
			System.out.println("Enum Values:" +color.name());
		}
	}
}
