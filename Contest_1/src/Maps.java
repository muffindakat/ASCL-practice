
import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class Maps {
	public static void main(String [] args) throws FileNotFoundException{
		Scanner skener = new Scanner(new File("maps"));
		String line = skener.nextLine();
		line = line.replace(",", "");
		Scanner inn = new Scanner(line);
		int mileage = inn.nextInt();
		DecimalFormat num = new DecimalFormat("00.00");
		double gasprice = inn.nextDouble();
		int speed = inn.nextInt();
		int[] dist = new int[] {0, 450, 590, 710, 1030, 1280, 1360};
		//going through each line
		for(int i = 0; i < 5; i++) {
			line = skener.nextLine();
			line = line.replace(",", "");
			Scanner in = new Scanner(line);
			char a = in.next().charAt(0);
			char b = in.next().charAt(0);
			a -= 65;
			b -= 65;
			//dist (works!!!)
			int distance = 0;
			distance = dist[b] - dist[a];
			System.out.print(distance + ", ");
			//time
			int hour = distance/speed;
			double dista = distance;
			int min = (int) Math.round((dista/speed)%1*60);
			if(min==0) {
				System.out.print(hour + ":" + min + "0, ");
			} else {
				System.out.print(hour + ":" + min + ", ");				
			}
			//gas
			double money = (dista/mileage)*gasprice;
			String monney = num.format(money);
			System.out.println("$" + monney);
			
		}
	}
}
