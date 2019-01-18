package coinFlip;
import java.util.*;

public class CoinFlip {

	public static void main(String[] args) {
		Integer answer = 0;
		Integer randomNum = 0;
		boolean goodAnswer = false;
		
		//Get user input, heads or tails.
		while (goodAnswer == false) {
			Scanner input = new Scanner(System.in);
			System.out.println("Heads or tails? ");
			String hort = input.next();
			
			if ((hort.equals("Heads")) || (hort.equals("heads"))){
				System.out.println("You chose 'heads'.");
				answer = 2;
				goodAnswer = true;
				input.close();
			}
			else if ((hort.equals("Tails")) || (hort.equals("tails"))) {
				System.out.println("You chose 'tails'.");
				answer = 1;
				goodAnswer = true;
				input.close();
			}
			else {
				System.out.println("Please enter 'heads' or 'tails'. ");
				
			}
			
		}
		
		//System.out.println(answer);
		
		//Generate heads or tails.
		for (int i=0; i<1; i++) {
			randomNum = (int) (Math.random()*3);
			
			if ((randomNum >= 1) && (randomNum %2 ==0)) {
				System.out.println("The coin landed heads up.");
			}
			else if ((randomNum >= 1) &&(randomNum %2 !=0)){
				System.out.println("The coin landed tails up.");
			}
			else {
				i--;
			}
		}
		
		//Check assumption. 
		if (Integer.valueOf(answer).equals(Integer.valueOf(randomNum))) {
			System.out.println("You guessed right!");
		}
		else {
			System.out.println("You guessed wrong!");
		}
		
	}

}
