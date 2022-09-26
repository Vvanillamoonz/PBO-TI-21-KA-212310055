import java.util.Scanner;

public class Latihan02 {
	Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		Greetings g = new Greetings();
		Latihan02 l = new Latihan02();
		
		g.hello();
		System.out.print("Masukkan NPM anda : ");
		int npm = l.keyboard.nextInt();
		g.garis();
		if (npm % 2 == 0 ) {
			System.out.println("Bukan termasuk bilangan prima ");
			System.out.println("karena dapat dibagi dengan 2");
		} else {
			System.out.println("Termasuk bilangan PRIMA");
		}
		
		l.keyboard.close();
	}
}

class Greetings{
	void garis() {
		System.out.println("=========================================");
	}
	void hello() {
		System.out.println("=========================================");
		System.out.println("Selamat datang di Program Java Septiawan");
		System.out.println("=========================================");
	}
}