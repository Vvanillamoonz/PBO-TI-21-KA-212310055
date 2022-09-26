import java.util.Scanner;

public class Latihan04 {
	Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		Latihan04 l = new Latihan04();
		Greetings g = new Greetings();
		
		g.hello();
		
		System.out.print("Masukkan bilangan : " );
		int x = l.keyboard.nextInt();
		g.garis();
		if (x < 20) {
			System.out.println("Maaf bilangan " + x + " kurang dari 20");
		} else {
			int n = 0;
			for (int j = 0; j <= x; j++) {
				n++;
				if (x % n == 0) {
					String koma = (n == x ) ? "" : ", ";
					System.out.print(n + koma);
				}
			}
		}
		l.keyboard.close();
	}
}
