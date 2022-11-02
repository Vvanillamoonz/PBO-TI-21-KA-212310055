import java.util.Scanner;
public class Latihan02 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int [] myArray = new int [7];
		System.out.println("== Selamat datang di program menampilkan array ==");
		System.out.println("== Program array ini memiliki 7 ruang (index) ==");
		System.out.println();
		for (int i = 0; i < myArray.length; i++) {
			System.out.print("Masukkan nilai array ke -" + (i+1) + " : " );
			myArray[i] = keyboard.nextInt();
		}
		System.out.println();
		System.out.println("Nilai array yang anda input adalah : ");
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("Index ke -" + (i+1) + " : " + myArray[i]);
		}
	}
}
