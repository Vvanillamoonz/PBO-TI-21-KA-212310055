import javax.swing.JOptionPane;
public class Latihan05 {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		String field[] = {"Nama Lengkap", "Alamat", "No.Telp"};
		String output = "";
		for (int i = 0; i < field.length; i++) {
			String input = jop.showInputDialog(null, "Masukkan " + field[i], "Data Array ke - " + i
					,jop.INFORMATION_MESSAGE);
		output += "\n" + field[i] + " : "+ input;
		}
		jop.showMessageDialog(jop, output, "Output", jop.INFORMATION_MESSAGE);
	}
}
