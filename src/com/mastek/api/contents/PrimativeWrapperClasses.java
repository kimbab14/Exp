package com.mastek.api.contents;

/**
 * This is an example of Wrapper class.
 * The wrapper classes are defined in the java.lang package and are used in
 * situations where an object is required but the data is a primitive type. 
 * The primitive type is "wrapped" into an object and can be "unwrapped" 
 * whenever the primitive value is needed. There is a wrapper class in the java.lang 
 * package for each of the eight primitive types:
 * 
 * Byte This type wraps a byte .
 * Short This type wraps a short .
 * Integer This type wraps an int .
 * Long This type wraps a long .
 * Float This type wraps a float .
 * Double This type wraps a double .
 * Character This type wraps a char .
 * Boolean This type wraps a boolean .
 * Wrapper classes have the following properties
 * 
 * 
 * 
 * @author jelica60589
 *
 */
public class PrimativeWrapperClasses {
	
	public static void main(String[] args) {
		
		//Primitive wrapper classes example
		int y = 4;
		Integer x = new Integer(y);
		int j = x.intValue();
		System.out.println(j);
	}

}
