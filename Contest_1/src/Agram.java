

import java.util.Scanner;

public class Agram {
	public static void main(String [] args) {
		Scanner skener = new Scanner(System.in);
		String line = skener.nextLine();
		line = line.replace(",", "");
		Scanner in = new Scanner(line);
		int nums[] = new int[6];
		String chars[] = new String[6];
		//filling
		for(int i = 0; i < 6; i++) {
			nums[i] = in.nextInt();
			chars[i] = in.next();
		}
		//processing
		String letter = chars[0];
		int num = nums[0];
		//sameletter
		boolean contains = false;
		for(int i = 1; i < 6; i++) {
			if(chars[i].equals(letter)) {
				contains = true;
			}else {
				nums[i] = 0;
			}
		}
		if(contains) {
			boolean yesnum = false;
			int mebbe = 10;
			for(int i = 1; i < 6; i++) {
				if(nums[i] > num && nums[i]< mebbe) {
					mebbe = nums[i];
					yesnum = true;
				}
			}
			if(yesnum) {
				System.out.print(mebbe);
			}else {
				int meebe = 10;
				for(int i = 1; i < 6; i++) {
					if(nums[i] < meebe && nums[i] != 0) {
						meebe = nums[i];
						
					}
				}
				System.out.print(meebe);
				
			}
			System.out.print(", " + letter);
		} else {
			System.out.print("NONE");
		}
	}
}
