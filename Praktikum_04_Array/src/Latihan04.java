import javax.swing.JOptionPane;
public class Latihan04 {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		String output = "";
		String array = jop.showInputDialog(null,"Masukkan jumlah Array : ", "Input", jop.INFORMATION_MESSAGE);
		int convertArray = Integer.parseInt(array);
		int [] myArray = new int[convertArray];
		for (int i = 0; i < myArray.length; i++) {
			String input = jop.showInputDialog(null,"Masukkan nilai array index ke -" + (i) + " : ", "Input Array",
												jop.QUESTION_MESSAGE);
			int convertInput = Integer.parseInt(input);
			myArray[i] = convertInput;
		}
		int maxValue = myArray[0];
		int minValue = myArray[0];
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] > maxValue) {
				maxValue = myArray[i];
			} else if (myArray[i] < minValue) {
				minValue = myArray[i];
			}
			output += "Array index ke -" + (i) + " : " + myArray[i] + "\n\n";
		}
		output += "Nilai terbesar dalam Array anda adalah : " + maxValue + "\n" 
				+ "Nilai terkecil dalam Array anda adalah : " + minValue;
		jop.showMessageDialog(null, output, "Output Array", jop.INFORMATION_MESSAGE);
	}
}
