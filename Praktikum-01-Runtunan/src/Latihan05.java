import java.util.Scanner;

public class Latihan05 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Masukkan string (kata / kalimat) yang akan di UPPERCASE : ");
		String input = keyboard.nextLine();
		
		System.out.println("Perubahan oleh sistem menjadi :");
		System.out.println(input.toUpperCase());
		
		
		keyboard.close();
	}
}
