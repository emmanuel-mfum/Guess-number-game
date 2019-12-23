import java.util.Scanner; // import appropriate classes
import javax.swing.JOptionPane;
import java.util.Random;
public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner console = new Scanner(System.in);
		Random rand = new Random();
		int guess = 0; // initialize both numbers
		int number = 0;
		int upper_limit = 0;
		
		
		JOptionPane.showMessageDialog(null, "Welcome to Emmanuel's guessing game !");
		
		System.out.println("Please enter an upper limit : ");
		
		upper_limit = console.nextInt();
		
		number = rand.nextInt(upper_limit);

		do {
			
			 System.out.println("Please enter a number between 0 and " + upper_limit + ":");
			 
			 guess = console.nextInt();
			 
			 if(guess > number)
				 
			 {
				 System.out.println("Your guess is higher than the number !" + "\n");
			 }
			 
			 if(guess < number)
			 {
				 System.out.println("Your guess is lower than the number "+ "\n");
			 }
			 

			}while(number != guess);
		
		
		if(guess == number)
		{
			System.out.println("You guessed the correct number ! Hooray!" + "\n");
		}
		

		console.close();
	}

}
