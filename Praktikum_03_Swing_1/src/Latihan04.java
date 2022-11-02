import javax.swing.JOptionPane;

class Biodata3{
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
		if (Fullname == null) {
			int choice = JOptionPane.showConfirmDialog(null,
					"Apakah anda ingin keluar ?",
					"Exit",
					JOptionPane.YES_NO_OPTION);
			if (choice == 0) {
				System.exit(0);
			} else {
				return getName();
			}
		}
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
		if (usia == null) {
			int choice = JOptionPane.showConfirmDialog(null,
					"Apakah anda ingin keluar ?",
					"Exit",
					JOptionPane.YES_NO_OPTION);
			if (choice == 0) {
				System.exit(0);
			} else {
				return getUsia();
			}
		}
		if (usia.isEmpty()) {
			JOptionPane.showMessageDialog(null,
					"FIELD USIA TIDAK BOLEH KOSONG !!!",
					"Error",
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
		if (Alamat == null) {
			int choice = JOptionPane.showConfirmDialog(null,
					"Apakah anda ingin keluar ?",
					"Exit",
					JOptionPane.YES_NO_OPTION);
			if (choice == 0) {
				System.exit(0);
			} else {
				return getAddress();
			}
		}
		if (Alamat.isEmpty()) {
			JOptionPane.showMessageDialog(null,
					"FIELD ALAMAT TIDAK BOLEH KOSONG !!!",
					"Error",
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
	public void getBiodata() {
		getName();
		getUsia();
		getAddress();
		JOptionPane.showMessageDialog(null,
							showMessage(),
							"Biodata anda",
							JOptionPane.INFORMATION_MESSAGE);
		int repeat = JOptionPane.showConfirmDialog(null,
				"Apakah anda ingin mengulanginya lagi ?",
				"Exit",
				JOptionPane.YES_NO_OPTION);
		if (repeat == 0) {
			getBiodata();
		} else {
			System.exit(0);
		}
	}
}
public class Latihan04 {
	public static void main(String[] args) {
		Biodata3 bd = new Biodata3();
		bd.getBiodata();
	}
}