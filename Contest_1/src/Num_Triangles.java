

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Num_Triangles {
	public static void main(String [] args) throws FileNotFoundException{
		Scanner skener = new Scanner(new File("triangle"));
		//five loop for the number of inputted lines
		for(int i = 0; i < 1; i++) {
			String line = skener.nextLine();
			Scanner in = new Scanner(line);
			int s = in.nextInt();
			int d = in.nextInt();
			int r = in.nextInt();
			String ber = Integer.toString(s);
			int ans = s;
			//digitsum
			while(ans >= 10) {
				for(int q = 0; q < ber.length(); q++) {
					ans += ber.charAt(i)-48;
				}
			}
			int num = ans;
			//digitsum end
			int[] array = new int[r];
			array[0] = num;
			for(int k = 1; k < r; k++) { //filling the array
				for(int j = 0; j < k+1; j++) {// filling the rows
					String berr = Integer.toString(num+d);
					int anss = num+d;
					while(anss >= 10) {
						for(int v = 0; v < berr.length(); v++) {
							anss += berr.charAt(i)-48;
						}
					}
					num = anss;
					array[k]+= num;
				}
			}
			System.out.println(array[r-1]);
		}
		
		

		
	}

}
