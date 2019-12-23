import java.util.Scanner; // import appropriate classes
import javax.swing.JOptionPane;
import java.util.Random;
public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner console = new Scanner(System.in);
		Random rand = new Random();
		int guess = 0; // initialize both numbers ( the one inputed by the user and the random guess)
		int number = 0;
		int upper_limit = 0;
		
		
		JOptionPane.showMessageDialog(null, "Welcome to Emmanuel's guessing game !");
		
		System.out.println("Please enter an upper limit : "); // The message prompt the user to enter an upper limit
		
		upper_limit = console.nextInt(); // the value inputed by the user is stored into the integer variable upper_limit
		
		number = rand.nextInt(upper_limit); // a random number is generated a stored into the integer variable number

		do {
			
			 System.out.println("Please enter a number between 0 and " + upper_limit + ":"); // this message prompts the user to enter a value between 0 and the limit determined by the user (the guess)
			 
			 guess = console.nextInt(); // the guessed number is stored into the integer variable guess
			
			 System.out.println("Your guess is : " + guess); // the number guessed by the user is printed
			 
			 if(guess > number) 
				 
			 {
				 System.out.println("Your guess is higher than the number !" + "\n"); //  this message is displayed, if the guess is higher than the number randomly generated
			 }
			 
			 if(guess < number)
			 {
				 System.out.println("Your guess is lower than the number "+ "\n"); // this message is printed if the guess is lower than the number randomly generated
			 }
			 

			}while(number != guess); // the preceding statements are executed as the user is trying to find the correct number, i.e, as long as the guess is not equal to the random number
		
		
		if(guess == number)
		{
			System.out.println("You guessed the correct number ! Hooray!" + "\n"); // this message is displayed if the user guess the correct number
		}
		

		console.close();
	}

}
