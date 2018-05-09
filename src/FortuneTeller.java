import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("What is your first name?");
		String name = input.nextLine();
		System.out.println("Hello " + name);

		System.out.println("What is your last name?");
		String lastname = input.nextLine();

		System.out.println("How old are you," + name + "?");
		int age = input.nextInt();
		input.nextLine();
		
		System.out.println("and what number is your birth month, " + name + "?");
		int month = input.nextInt();
		input.nextLine();
		

		System.out.println("Nice! So " + name + ", what is your favorite ROYGBIV color? If you dont know what ROYGBIV colors are thats no problem, just type help.");
		String color = input.nextLine();
		
		String colorString;
		
		String mot = "";
		
		boolean isTrue = false ;
		
		while (isTrue == false){
			
			
			switch (color) {
			

			case "help":
				System.out.println( "The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.");
				System.out.println("Sweeet, now that you know your ROYGBIV colors, whats your favorite?");
				
				
				break;
			case "red":
				System.out.println("Red is an awesome color!");
				 mot = "Ferrari";
				 isTrue = true;
				break;
			case "blue":
				System.out.println("I love the color blue!");
				 mot = "bike";
				 isTrue = true;
				break;
			case "orange":
				System.out.println("A great color and a tasty fruit.");
				mot = "lamborghini";
				isTrue = true;
				break;
			case "yellow":
				System.out.println("Yellow is such a great choice.");
				mot = "your feet";
				isTrue = true;
				break;
			case "green":
				System.out.println("Yes!!! Green is my favorite color as well.");
				mot = "dragon";
				isTrue = true;
				break;
			case "indigo":
				System.out.println("Ah indigo, it makes me think of the ocean");
				mot = "pogo stick";
				isTrue = true;
				break;
			case "violet":
				System.out.println("Violet, a pretty color and a pretty name.");
				mot = "pony";
				isTrue = true;
				break;
			default:
				System.out.println("Tsk tsk, thats not a ROYGBIV color my friend.");
				break;
				
				
			}
			
			if (isTrue == false){
			System.out.println("Type ROYGBIV or help");
			color = input.nextLine();
			}
			
		}
		
		
		System.out.println(
				"So I have one final question for you " + name + ", how many siblings do you have?");
		
		int sib = input.nextInt();
		System.out.println("Thank you, and now the mist's of time part for my third eye and I can see what the future holds for you my child");
		
		
		int numYears;
		
		if ( age % 2 == 0) { numYears = 10;
			 }
			
			else { 
					numYears = 100;
				
		}
		
		String vaHome = "";
		
		if ( sib > 3) { vaHome = "Miami";}
		
		if ( sib < 0) { vaHome = "New Jersey"; }
		
		if ( sib == 0) { vaHome = "Miami"; }
		
		if ( sib == 1) { vaHome = "Portland"; }
		
		if ( sib == 2) { vaHome = "Chicago"; }
		
		
		
		String bankAccount;
		
		
		
		
		if ( month >= 1 && month <= 4) { bankAccount = "$120.00"; }
		
		if ( month >= 5 && month <= 8) { bankAccount = "$450.00"; }
		
		if ( month >= 9 && month <= 12) { bankAccount = "$3.50";   }
		
		else { bankAccount = "$0.00"; }
		
		
		System.out.println(name +" " + lastname + " will retire in " + numYears + " years, with " + bankAccount + " in the bank, and a vacation home in " +  vaHome +", " + "and travel by " + mot +".");  
				
				
			
			
		
		

	}

}
