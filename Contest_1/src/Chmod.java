
import java.util.*;
import java.io.*;

public class Chmod {
	public static void main(String [] args) {
		Scanner skener = new Scanner(System.in);
		String line = skener.nextLine();
		line = line.replace(",", "");
		Scanner in = new Scanner(line);
		String binary = "";
		String permission = "";
		int a = 0;
		for(int i = 0; i < 3; i++) {
			a = in.nextInt();
			int four = a/4;
			a -= four*4;
			int two = a/2;
			a -= two * 2;
			int one = a;
			binary += four;
			binary += two;
			binary += one;
			binary += " ";
			if(four == 1) {
				permission += "r";
			} else {
				permission += "-";
			}
			if(two == 1) {
				permission += "w";
			} else {
				permission += "-";
			}
			if(one == 1) {
				permission += "x";
			} else {
				permission += "-";
			}
			permission += " ";
		}
		System.out.print(binary + "and ");
		System.out.print(permission);
		
	}
}
