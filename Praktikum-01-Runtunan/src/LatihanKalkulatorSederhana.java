import java.util.Scanner;

public class LatihanKalkulatorSederhana {
	public static void main(String[] args) {
		
		Operator o = new Operator();
		LatihanKalkulatorSederhana l = new LatihanKalkulatorSederhana();
		Scanner keyboard = new Scanner(System.in);
		char input;
		char op = '\u0000';
		
		o.garis();
		char userMenuChoice = l.getOption();
		o.garis();
		
		while (userMenuChoice == op) {
			System.out.print("Pilihan operasi : ");
			op = keyboard.next().charAt(0);
			switch(op) {
			case '1':
				System.out.println("1. Pertambahan");
				System.out.print("Masukkan Nilai Pertama : ");
				int x = keyboard.nextInt();
				System.out.print("Masukkan Nilai Kedua : ");
				int y = keyboard.nextInt();
				o.tambah(x,y);
				break;
			case '2':
				System.out.print("Masukkan Nilai Pertama : ");
				int xKur = keyboard.nextInt();
				System.out.print("Masukkan Nilai Kedua : ");
				int yKur = keyboard.nextInt();
				o.kurang(xKur,yKur);
				break;
			case '3':
				System.out.print("Masukkan Nilai Pertama : ");
				double xBag = keyboard.nextDouble();
				System.out.print("Masukkan Nilai Kedua : ");
				double yBag = keyboard.nextDouble();
				o.bagi(xBag,yBag);
				break;
			case '4':
				System.out.print("Masukkan Nilai Pertama : ");
				int xKal = keyboard.nextInt();
				System.out.print("Masukkan Nilai Kedua : ");
				int yKal = keyboard.nextInt();
				o.kali(xKal,yKal);
				break;
			case '5':
				System.out.print("Masukkan Nilai yang akan di Faktorial : ");
				int xFak = keyboard.nextInt();
				o.fak(xFak);
		}
		
		System.out.println("  ");
		o.garis();
		System.out.print("Apakah anda ingin melakukan operasi lagi ? (Y/N) : ");
		input = keyboard.next().charAt(0);
		o.garis();
		boolean inputYes = input == 'y' || input == 'Y';
		boolean inputNo = input == 'n' || input =='N';
		
		if(inputYes) {
				userMenuChoice = l.getOption();
				userMenuChoice = op;
			}
		else if (inputNo) {
				System.out.println("Terima Kasih");
				break;
			}
		else {
				break;
			}
		}
		keyboard.close();
	}
	
	char getOption() {
		System.out.println("Selamat datang di Program Kalkulator Sederhana");
		System.out.println(" ");
		System.out.println("Silahkan pilih operasi yang akan anda lakukan");
		System.out.println("1. Tambah (+)");
		System.out.println("2. Kurang (-)");
		System.out.println("3. Bagi (/)");
		System.out.println("4. Kali (X)");
		System.out.println("5. Faktorial");
		return 0;
	}
	
}

class Operator{
	void garis() {
		System.out.println("==============================================");;
	}
	int tambah (int x, int y) {
		int hasil = x + y;
		System.out.println("Hasilnya : " + hasil);
		return hasil;
	}
	int kurang (int x, int y) {
		int hasil = x - y;
		System.out.print("Hasilnya adalah : " + hasil);
		return hasil;
	}
	double bagi (double x, double y) {
		double hasil = x / y;
		System.out.println("Hasilnya adalah : " + hasil);
		return 0;
	}
	int kali (int x, int y) {
		int hasil = x * y;
		System.out.println("Hasilnya adalah : " + hasil);
		return 0;
	}
	int fak (int x) {
		int hasil = 1;
		for (int result = 1; result <= x; result++) {
			hasil *= result;
		}
		System.out.println("Hasilnya adalah : " + hasil);
		return 0;
	}
}
