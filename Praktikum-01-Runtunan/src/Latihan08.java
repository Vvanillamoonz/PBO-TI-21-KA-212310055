import java.util.Scanner;

public class Latihan08 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int npm, sm;
		String namLeng, namKel;
		double ipk;
		
		System.out.print("Masukkan Npm Anda : ");
		npm = keyboard.nextInt();
		System.out.print("Masukkan Nama Lengkap Anda : ");
		namLeng = keyboard.next();
		System.out.print("Masukkan Nama Kelas Anda : ");
		namKel = keyboard.next();
		System.out.print("Semester - ");
		sm = keyboard.nextInt();
		System.out.print("Masukkan IPK Anda : ");
		ipk = keyboard.nextDouble();
		
		System.out.println("  ");
		System.out.println("- " + npm);
		System.out.println("- " + namLeng);
		System.out.println("- " + namKel);
		System.out.println("- " + sm);
		System.out.println("- " + ipk);
		
		keyboard.close();
	}
}
