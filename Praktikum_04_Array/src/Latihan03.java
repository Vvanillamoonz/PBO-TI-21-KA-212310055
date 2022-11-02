import javax.swing.JOptionPane;
public class Latihan03 {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		String output = "";
		String array = jop.showInputDialog(null,"Masukkan jumlah Array : ", "Input", jop.INFORMATION_MESSAGE);
		int convertArray = Integer.parseInt(array);
		int [] myArray = new int[convertArray];
		for (int i = 0; i < myArray.length; i++) {
			String input = jop.showInputDialog(null,"Masukkan nilai array index ke -" + (i+1) + " : ", "Input Array",
												jop.QUESTION_MESSAGE);
			int convertInput = Integer.parseInt(input);
			myArray[i] = convertInput;
		}
		for (int i = 0; i < myArray.length; i++) {
			
			output += "Array index ke -" + (i+1) + " : " + myArray[i] + "\n";
		}
		jop.showMessageDialog(null, output, "Output Array", jop.INFORMATION_MESSAGE);
	}
}
