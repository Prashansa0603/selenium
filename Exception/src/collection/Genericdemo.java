package collection;


import java.util.ArrayList;
import java.util.List;
// generics is used to provide type safety , to resolve type casting problem

/*class  Container<T extends Number>
{
 T value;	

public T getValue() {
	return value;
}

public void setValue(T value) {
	this.value = value;
}

public void show() {
	System.out.println(value.getClass().getName());
}
public void demo(ArrayList< ? extends T>obj)
{
	}
}
public class Genericdemo {

	public static void main(String[] args) {
// generics always supports classes
		Container<Integer> obj =new  Container<>();
		obj.show();
	//	obj.demo(new ArrayList<Number>());
	}

}
*/
public class Genericdemo {
	   // generic method printArray
	   public static < E > void printArray( E[] inputArray ) {
	      // Display array elements
	      for(E element : inputArray) {
	         System.out.printf("%s ", element);
	      }
	      System.out.println();
	   }

	   public static void main(String args[]) {
	      // Create arrays of Integer, Double and Character
	      Integer[] intArray = { 1, 2, 3, 4, 5 };
	      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
	      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

	      System.out.println("Array integerArray contains:");
	      printArray(intArray);   // pass an Integer array

	      System.out.println("\nArray doubleArray contains:");
	      printArray(doubleArray);   // pass a Double array

	      System.out.println("\nArray characterArray contains:");
	      printArray(charArray);   // pass a Character array
	   }
	}
