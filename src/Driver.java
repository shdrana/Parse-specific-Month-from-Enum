import java.time.Year;
import java.util.Scanner;



public class Driver {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		String input = scanner.nextLine();
		
		Months month = Months.getMonthsFromEnum(input);

		System.out.println("You selected: "+ month.getTitle());
		System.out.println("Number of Day in "+ month.getTitle()+":" +month.getNumberOfDay());

	}

}
