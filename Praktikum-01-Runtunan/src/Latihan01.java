import java.util.Scanner;

public class Latihan01 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Masukkan nilai Celcius = ");
		
		int celcius = keyboard.nextInt();
		Latihan01 suhu = new Latihan01();
		
		System.out.println("Konversi dari "+ celcius + " celcius ke fahrenheit adalah");
		suhu.celciusToFahrenheit(celcius);

		System.out.println("Konversi dari "+ celcius + " celcius ke reamur adalah");
		int reamur = suhu.celciusToReamur(celcius);
		System.out.println(reamur);
		
		System.out.println("Konversi dari "+ celcius + " celcius ke kelvin adalah");
		int kelvin = suhu.celciusToKelvin(celcius);
		System.out.println(kelvin);
		
		keyboard.close();
	}
	
	void celciusToFahrenheit (int celcius) {
		double fahrenheit = ((9/5) * celcius) + 32;
		System.out.println(fahrenheit);
	}
	
	int celciusToReamur (int celcius) {
		int reamur = (celcius * 4 /5);
		
		return reamur;
	}
	
	int celciusToKelvin (int celcius) {
		int kelvin = (celcius + 273);
		
		return kelvin;
	}
	
}