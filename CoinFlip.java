import java.util.Scanner;
public class CoinFlip {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many times will the coin be flipped?");
		int numFlips = in.nextInt();
		double num = Math.random();
		int numHeads = 0;
		int numTails = 0;
		System.out.println("Here is the sequence of coin flips: ");
		for (int i = 1; i <= numFlips; i++){
			num = Math.random();
			if (num <= 0.5){
				System.out.print("H");
				numHeads++;
			}
			else if (num > 0.5){
				System.out.print("T");	
				numTails++;
			}
		}
		System.out.println("\nThere were " + numHeads + " heads and " + numTails + " tails.");
	}
}
