import java.util.Scanner;

public class Latihan07 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Masukkan nama lengkap anda : ");
		String nama = keyboard.nextLine();
		
		nama = nama.replaceAll("a", "X");
		nama = nama.replaceAll("A", "X");
		nama = nama.replaceAll("i", "X");
		nama = nama.replaceAll("I", "X");
		nama = nama.replaceAll("u", "X");
		nama = nama.replaceAll("U", "X");
		nama = nama.replaceAll("e", "X");
		nama = nama.replaceAll("E", "X");
		nama = nama.replaceAll("o", "X");
		nama = nama.replaceAll("O", "X");
		System.out.println(nama);
		
		keyboard.close();
		}
}
