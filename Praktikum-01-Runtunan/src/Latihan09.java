import java.util.Scanner;

public class Latihan09 {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Students myBio = new Students();
		
		System.out.println("Selamat datang di pemrograman java");
		
		System.out.print("Masukkan NPM : ");
		myBio.getNpm(keyboard.nextInt());
		
		System.out.print("Masukkan Nama : ");
		myBio.getFullname(keyboard.next());
		
		System.out.print("Masukkan Kelas : ");
		myBio.getClassname(keyboard.next());
		
		System.out.print("Semester ke - ");
		myBio.getSm(keyboard.nextInt());
		
		System.out.print("Masukkan nilai akhir : ");
		myBio.getGpa(keyboard.nextFloat());
				
		keyboard.close();
		
	}
}

class Students {
	Scanner keyboard = new Scanner(System.in);

	int getNpm(int npm) {
//		System.out.println(npm);
		return npm;
	}
	
	int getSm(int sm) {
		return sm;
	}
	
	String getFullname(String Fullname) {
		return Fullname;
	}
	
	String getClassname(String Classname) {
		return Classname;
	}
	
	float getGpa(float gpa) {
		return gpa;
	}
	
	
}


