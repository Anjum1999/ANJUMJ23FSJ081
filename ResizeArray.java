package closelabBook;
import java.util.ArrayList;
public class ResizeArray {

	public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println("Original ArrayList: " + numbers);
        numbers.remove(2); 
        System.out.println("Resized ArrayList: " + numbers);


	}

}
