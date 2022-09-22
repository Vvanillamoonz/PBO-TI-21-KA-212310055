import java.util.Scanner;

public class Latihan03 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double pi = 3.14;		
		Latihan03 l = new Latihan03();
		
		System.out.println("Bangunan apa yang hendak anda hitung luas dan keliling nya ?");
		System.out.println("1. Segitiga");
		System.out.println("2. Tabung");
		System.out.println("input in just number ");
		int input = keyboard.nextInt();
		
		if (input == 1) {
			System.out.print("Masukkan nilai jari - jari alas : ");
			int alasKer = keyboard.nextInt();
	
			System.out.print("Masukkan Tinggi : ");
			int tinggiKer = keyboard.nextInt();
			
			keyboard.close();
			
			System.out.println("  ");
			System.out.print("Luas Segitiga kerucut adalah = ");
			l.luasSegitiga(alasKer, tinggiKer, pi);
			
			System.out.println("  ");
			System.out.print("Keliling Segitiga Kerucut adalah = ");
			l.kelSegitiga(alasKer, pi);
			}
			else if (input == 2){
				System.out.print("Masukkan nilai jari - jari alas : ");
				int alasTab = keyboard.nextInt();
		
				System.out.println("  ");
				System.out.print("Luas tabung adalah : ");
				l.luasTabung(alasTab, pi);
				
				System.out.println("  ");
				System.out.print("Keliling tabung adalah : ");
				l.kelilingTabung(alasTab, pi);
			}
			else {
				System.out.println("Kode yang anda masukkan salah");
			}
		keyboard.close();
		}
	
//	menghitung bangun ruang segitiga
	void luasSegitiga(int alasKer, int tinggiKer, double pi){
		double luasKer = alasKer * tinggiKer * pi;
		
		System.out.println(luasKer);
	}
	
	void kelSegitiga(int alasKer, double pi) {
		double kelilingKer = 2 * pi * alasKer;
		
		System.out.println(kelilingKer);
	}
	
//	menghitung bangun ruang tabung
	void luasTabung(int alasTab, double pi) {
		double luasTab = 2 * pi * alasTab * alasTab;
		
		System.out.println(luasTab);
	}
	
	void kelilingTabung(int alasTab, double pi) {
		double kelTab = 2 * pi * alasTab;
		
		System.out.println(kelTab);
	}
}