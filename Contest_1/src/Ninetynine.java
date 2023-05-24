

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ninetynine {
	public static void main(String [] args) throws FileNotFoundException{
		Scanner skener = new Scanner(new File("ninetynine"));
		String line = skener.nextLine();
		line = line.replace(",", "");
		Scanner in = new Scanner(line);
		int sum = in.nextInt();
		int player[] = new int[7];
		int dealer[] = new int[4];
		//fill array
		for(int i = 0; i < 3; i++) {
			player[i] = in.nextInt();
		}
		player[3] = in.nextInt();
		for(int i = 1; i < 4; i++) {
			player[i+3] = in.nextInt();
			dealer[i] = in.nextInt();
		} //dun filling
		boolean playerr = true;
		//number stuff
		for(int i = 0; i < 5; i++) {
			//player
			if(player[i] == 4) {
				sum -= 10;
			} else if (player[i] == 0) {
				if(sum + 11 < 99) {
					sum += 11;
				} else {
					sum += 1;
				}
			} else if (player[i] == 9) {
				sum += 0;
			} else {
				sum += player[i];
			}
			if (sum > 99) {
				playerr = true;
				break;
			}
			//dealer
			if(dealer[i] == 4) {
				sum -= 10;
			} else if (dealer[i] == 0) {
				if(sum + 11 < 99) {
					sum += 11;
				} else {
					sum += 1;
				}
			} else if (dealer[i] == 9) {
				sum += 0;
			} else {
				sum += dealer[i];
			}
			if (sum > 99) {
				playerr = false;
				break;
			}
		}
		//printing
		System.out.print(sum + ", ");
		//player or dealer
		System.out.print(playerr);
		
		
	}
}
