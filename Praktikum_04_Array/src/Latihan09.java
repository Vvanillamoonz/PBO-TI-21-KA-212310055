import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Latihan09 {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		String output = "";
		String array = jop.showInputDialog(null,"Masukkan jumlah Array : ", "Input", jop.INFORMATION_MESSAGE);
		int convertArray = Integer.parseInt(array);
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		for (int i = 0; i < convertArray; i++) {
			String input = jop.showInputDialog(null,"Masukkan nilai array index ke -" + (i) + " : ", "Input Array",
												jop.QUESTION_MESSAGE);
			int convertInput = Integer.parseInt(input);
			myArray.add(convertInput);
		}
		int maxValue = myArray.get(0);
		int minValue = myArray.get(0);
		for (int i = 0; i < convertArray; i++) {
			if (myArray.get(i) > maxValue) {
				maxValue = myArray.get(i);
			} else if (myArray.get(i) < minValue) {
				minValue = myArray.get(i);			}
			output += "Array index ke -" + i + " : " + myArray.get(i) + "\n\n";
		}
		output += "Nilai terbesar dalam Array anda adalah : " + maxValue + "\n" 
				+ "Nilai terkecil dalam Array anda adalah : " + minValue;
		jop.showMessageDialog(null, output, "Output Array", jop.INFORMATION_MESSAGE);
	}
}
