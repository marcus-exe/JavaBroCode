
public class Main {

	public static void main(String[] args) {
		
		//Bounded Types
		MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(1, 9);
		MyGenericClass<Double, Double> myDouble = new MyGenericClass<>(3.14, 5.18);
		//MyGenericClass<Character, Character> myChar = new MyGenericClass<>('@', '%');
		//MyGenericClass<String, String> myString = new MyGenericClass<>("Hello", "Axis");
		
		System.out.println(myInt.getValue());
		System.out.println(myDouble.getValue());
		//System.out.println(myChar.getValue());
		//System.out.println(myString.getValue());
	}

}
