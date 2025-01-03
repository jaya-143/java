package java_programing_topics;
import java.util.Scanner;

public class Getting_input3 {
		public static void main(String [] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter your name : ");
			String name = scanner.nextLine();
			
			System.out.println("Enter your password : ");
			int password = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Enter your mail");
			String email = scanner.nextLine();
			
			System.out.println("Your name is : " +name);
			System.out.println("Your password is : " + password);
			System.out.println("Your mail id is : " + email);
			
/* ************** Exercise ********* */
			System.out.println("enter any number : ");
			int number = scanner.nextInt();
			System.out.println("   "+number);
			System.out.println("  "+number+" "+number );
			System.out.println(" "+number+" "+number+" "+number);
			System.out.println(number+" "+number+" "+number+" "+number);
			
			
		}
}
