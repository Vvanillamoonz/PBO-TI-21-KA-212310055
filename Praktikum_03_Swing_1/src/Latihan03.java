import javax.swing.JOptionPane;
class Biodata2{
	String Fullname;
	Integer Usia;
	String Alamat;
	public String showMessage() {
		String showMessage = "Nama anda  : " + Fullname + "\n"
							+"Usia anda  : " + Usia + "\n"
							+"Alamat anda  : " + Alamat; 
		
		return showMessage;
	}
	public String getName() {
		Fullname = JOptionPane.showInputDialog(null,
				"Masukkan Nama Lengkap Anda : ",
				"Nama ",
				JOptionPane.QUESTION_MESSAGE);
		if (Fullname.isEmpty()) {
			JOptionPane.showMessageDialog(null,
					"FIELD NAMA TIDAK BOLEH KOSONG !!",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
			return getName();
			}
		return showMessage();
	}
	public String getUsia() {
		String usia = JOptionPane.showInputDialog(null,
				"Usia anda : ",
				"Usia",
				JOptionPane.QUESTION_MESSAGE);
		if (usia.isEmpty()) {
			JOptionPane.showMessageDialog(null, "FIELD USIA TIDAK BOLEH KOSONG !!", "Error",
						JOptionPane.ERROR_MESSAGE);
			return getUsia();
		}
		try {
			Usia = Integer.parseInt(usia);
		} catch (Exception e){
			JOptionPane.showMessageDialog(null,
					"ISIAN HARUS NUMERIK / ANGKA !!!",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
			return getUsia();
		}
		return showMessage();
	}
	public String getAddress() {
		Alamat = JOptionPane.showInputDialog(null,
				"Alamat Lengkap : ",
				"Alamat",
				JOptionPane.QUESTION_MESSAGE);
		if (Alamat.isEmpty()) {
			JOptionPane.showMessageDialog(null, "FIELD ALAMAT TIDAK BOLEH KOSONG !!", "Error",
						JOptionPane.ERROR_MESSAGE);
			return getAddress();
		}
		if (Alamat.length() < 10) {
			JOptionPane.showMessageDialog(null,
					"Masukan untuk Alamat minimum 10 Karakter",
					"Error",
					JOptionPane.ERROR_MESSAGE);
			return getAddress();
		}
		return showMessage();
	}
}
public class Latihan03 {
	public static void main(String[] args) {
		Biodata2 bd = new Biodata2();
		bd.getName();
		bd.getUsia();
		bd.getAddress();
		JOptionPane.showMessageDialog(null,
							bd.showMessage(),
							"Biodata anda",
							JOptionPane.INFORMATION_MESSAGE);
	}
}