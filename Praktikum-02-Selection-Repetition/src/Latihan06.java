import java.util.Scanner;

public class Latihan06 {
	Scanner keyboard = new Scanner (System.in);
	public static void main(String[] args) {
		Latihan06 l = new Latihan06();
		Greetings g = new Greetings();
		
		char choice = '\u0000';
		char input;
		
		g.hello();
		char userMenuChoice = l.getOption();
		g.garis();
		
		while (userMenuChoice == choice) {
			System.out.print("Pilih menu sarapan hari ini : ");
			choice = l.keyboard.next().charAt(0);
			switch (choice) {
			case '1' :
				System.out.println("Anda memesan Nasi Goreng dengan harga Rp. 22.000");
				break;
			case '2' :
				System.out.println("Anda memesan Bubur Ayam dengan harga Rp. 15.000");
				break;
			case '3' :
				System.out.println("Anda memesan Soto Ayam dengan harga Rp. 25.000");
				break;
			default :
				System.out.println("Maaf menu yang anda masukkan salah, silahkan ulang (input y/Y)");
			}
//			System.out.println();
			g.garis();
			System.out.print("Apakah anda akan memesan kembali ? (Y/N) : ");
			input = l.keyboard.next().charAt(0);
			System.out.println(" ");
			boolean inputYes = input == 'y' || input == 'Y';
			boolean inputNo = input == 'n' || input =='N';
			
			if (inputYes) {
					userMenuChoice = l.getOption();
					userMenuChoice = choice;
				} else if (inputNo) {
					System.out.println("Terima Kasih");
					break;
				} else {
					System.out.println("Inputan anda salah, program berakhir");
					System.out.println("untuk mengulang program tekan F11");
				}
		}
	}
	
	char getOption() {
		System.out.println("Menu Sarapan : ");
		System.out.println("1. Nasi Goreng");
		System.out.println("2. Bubur Ayam");
		System.out.println("3. Soto Ayam");
		return 0;
	}
}
