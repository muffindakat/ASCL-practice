
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Stigid {
	public static void main(String [] args) throws FileNotFoundException{
		Scanner skener = new Scanner(new File("stigid"));
		String line = skener.nextLine();
		//one
		System.out.println(line.length());
		//two
		String two = skener.nextLine();
		int ans = 0;
		for(int i = 0; i < two.length(); i++) {
			ans += (two.charAt(i)-48);
		}
		System.out.println(ans);
		//three
		ans = 0;
		String three = skener.nextLine();
		for(int i = 0; i < three.length(); i+=2) {
			ans += (three.charAt(i)-48);
		}
		System.out.println(ans);
		//four
		String four = skener.nextLine();
		int count = 0;
		for(int i = 0; i < four.length(); i++) {
			if(four.charAt(i)==('4')) {
				count++;
			}
		}
		System.out.println(count);
		//five
		String five = skener.nextLine();
		int len = five.length();
		if(len %2 == 0) {
			System.out.print(five.charAt(len/2-1));
		} else {
			System.out.print(five.charAt(len/2));
		}	
		skener.close();
	}
}
