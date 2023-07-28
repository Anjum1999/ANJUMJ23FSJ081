package closelabBook;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
        byte byteVar = 10;
        short shortVar = 1000;
        int intVar = 450;
        long longVar = 1000000000L; 
        float floatVar = 3.14f; 
        double doubleVar = 2.71828;
        char charVar = 'A';
        boolean booleanVar = true;

        // Implicit type casting
        intVar = byteVar; 
        doubleVar = floatVar; 

        // Explicit type casting
        shortVar = (short) intVar; 
        longVar = (long) doubleVar; 
        
        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("charVar: " + charVar);
        System.out.println("booleanVar: " + booleanVar);




	}

}
