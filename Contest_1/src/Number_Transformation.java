

import java.util.Scanner;

public class Number_Transformation {
	public static void main(String [] args) {
		Scanner skener = new Scanner(System.in);
		String line = skener.nextLine();
		line = line.replace(",", "");
		Scanner in = new Scanner(line);
		String n = in.next();
		int len = n.length();
		int p = in.nextInt();
		int d = in.nextInt();
		int digit = n.charAt(n.length()-p);
		if(digit >= 48 && digit <= 52) {
			digit = (digit -48 + d)%10;
			n = n.substring(0, len-p) + digit;
			for(int i = len-p+1; i < len; i++) {
				n += "0";
			}
		} else if (n.charAt(n.length()-p) >= 53 && n.charAt(n.length()-p) <= 57){
			digit = Math.abs(digit - 48 - d);
			while(digit >= 10) {
				digit = digit/10;
			}
			n = n.substring(0, len-p) + digit;
			for(int i = len-p+1; i < len; i++) {
				n += "0";
			}
			
		}
		System.out.print(n);
		skener.close();
		in.close();
	}
}
