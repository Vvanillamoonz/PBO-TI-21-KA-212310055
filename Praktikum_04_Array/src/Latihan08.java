import javax.swing.JOptionPane;
public class Latihan08 {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		String field [] = {"Nama Lengkap","Alamat","No. telp"}; 
		String output = "";
		String jmlDat = jop.showInputDialog(null, "Masukkan jumlah data :", "Input Data", jop.INFORMATION_MESSAGE);
		int jmlDatConvert = Integer.parseInt(jmlDat);
		String data[][] = new String[jmlDatConvert][field.length];
		for (int i = 0; i < jmlDatConvert; i++){
			for (int j = 0; j < field.length; j++) {
				data[i][j] = jop.showInputDialog(null, "Masukkan " + field[j], "Data ke - " + (i+1), jop.INFORMATION_MESSAGE);
			}
		}
		for (int i = 0; i < jmlDatConvert; i++) {
			for (int j = 0; j < field.length; j++) {
				output += field[j] + " : " + data[i][j] + "\n";
			}
			output += "\n";
		}
		jop.showMessageDialog(jop, output);
	}
}
