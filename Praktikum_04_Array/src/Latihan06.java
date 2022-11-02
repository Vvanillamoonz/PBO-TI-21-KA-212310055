import javax.swing.JOptionPane;
import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;
public class Latihan06 {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		int [][] a = new int [2][2];
		int [][] b = new int [2][2];
		String output = "Matriks a : \n";
		for(int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				String x = jop.showInputDialog(null, "Masukkan angka : ", "Masukkan Matriks A[" + i + "][" + j + "]", 
						jop.QUESTION_MESSAGE);
				int convertX = Integer.parseInt(x);
				a[i][j] = convertX;
			}
		}
		output += a[0][0] +" " + a[0][1] + "\n" + a[1][0] + " " + a[1][1];
		for(int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				String x = jop.showInputDialog(null, "Masukkan angka : ", "Masukkan Matriks B[" + i + "][" + j + "]", 
						jop.QUESTION_MESSAGE);
				int convertY = Integer.parseInt(x);
				b[i][j] = convertY;
			}
		}
		output += "\n\n Matriks B : \n" + 
				b[0][0] + " " + b[0][1] + "\n" +
				b[1][0] + " " + b[1][1];
		jop.showMessageDialog(null, output, "Hasil Matriks", jop.INFORMATION_MESSAGE);
	}
}
