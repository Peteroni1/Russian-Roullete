package Clfw;
import java.util.Scanner;
import java.util.Random;

class RussianRoulette {
	public static void main(String[] args)throws InterruptedException {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		boolean play = true;
		while (play) {  
		System.out.println("wanna play? ");
		String yn = scanner.nextLine().toLowerCase();
		if (yn.equals("yes")) {
		play = false;
		} else if (yn.equals("no"))  {
			System.out.println("not gonna happen we will play");
		} else {
			System.out.println("Enter only yes or no");
		}
		
		
		int bulletlocation = random.nextInt(6) + 1;
		int chamber = 1;
		boolean playing = true;
		
		while (playing) {
		System.out.println("roll?");
		String roll = scanner.nextLine().toLowerCase();
		System.out.println("rolling");
		
		System.out.println("Trigger?");
		String trigger = scanner.nextLine().toLowerCase();
		if (bulletlocation == chamber ) {
			System.out.println("You died ");
			playing = false;
			
		}
		
		else {
			System.out.println("Tangina buhay kapa");
			chamber++;
		}
		
			
		}
		}
		
		}
		}
	