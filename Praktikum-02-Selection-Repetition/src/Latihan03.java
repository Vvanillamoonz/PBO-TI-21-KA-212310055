import java.util.Scanner;

public class Latihan03 {
	Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		Greetings g = new Greetings();
		Latihan03 l = new Latihan03();
		g.hello();
		
		System.out.println("Menu Sarapan : ");
		System.out.println("1. Nasi Goreng");
		System.out.println("2. Bubur Ayam");
		System.out.println("3. Soto Ayam");
		g.garis();
		System.out.print("Pilih menu sarapan hari ini : ");
		char userMenuChoice = l.keyboard.next().charAt(0);
		g.garis();
		
		switch (userMenuChoice) {
		case '1' :
			System.out.println("Anda memesan Nasi Goreng dengan harga Rp. 22.000");
			break;
		case '2' :
			System.out.println("Anda memesan Bubur Ayam dengan harga Rp. 15.000");
			break;
		case '3':
			System.out.println("Anda memesan Soto Ayam dengan harga Rp. 25.000");
			break;
		default :
			System.out.println("Maaf menu yang anda masukkan salah");
			break;
		}
		l.keyboard.close();
	}
}
