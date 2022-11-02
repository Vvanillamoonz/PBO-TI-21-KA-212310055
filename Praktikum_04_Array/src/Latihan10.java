import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Latihan10 {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		ArrayList <String> field = new ArrayList <String>();
		field.add(0, "Nama Lengkap");
		field.add(1, "Alamat");
		field.add(2, "No Telp");
		String output = "";
		for (int i = 0; i < field.size(); i++) {
			String input = jop.showInputDialog(null, "Masukkan " + field.get(i), "Input"
					,jop.INFORMATION_MESSAGE);
		output += field.get(i) + " : "+ input + "\n";
		}
		jop.showMessageDialog(jop, output, "Output", jop.INFORMATION_MESSAGE);
	}
}
