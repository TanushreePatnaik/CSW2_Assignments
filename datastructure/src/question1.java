import java.util.ArrayList;
public class question1 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.forEach(number -> System.out.println(number));

	}

}
