
import java.util.Scanner;

public class Latihan06 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Masukkan usia anda : ");
		String usia = keyboard.nextLine();
		
		System.out.print("Masukkan nama depan anda : ");
		String namaDepan = keyboard.nextLine();
		
		System.out.print("Masukkan nama belakang anda : ");
		String namaBelakang = keyboard.nextLine();
		
		System.out.print("Masukkan NPM anda : ");
		String npm = keyboard.nextLine();
		
		String str = usia.concat(namaDepan).concat(namaBelakang).concat(npm);
		System.out.println(str);
		keyboard.close();
	}
}
