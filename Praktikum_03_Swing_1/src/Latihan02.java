import javax.swing.JOptionPane;
class Biodata{
	String Fullname;
	Integer Usia;
	String Alamat;
	public String showMessage() {
		String showMessage = "Nama anda  : " + Fullname + "\n"
							+"Usia anda  : " + Usia + "\n"
							+"Alamat anda  : " + Alamat; 
		
		return showMessage;
	}
}
public class Latihan02 {
	public static void main(String[] args) {
		Biodata bd = new Biodata();
		bd.Fullname = JOptionPane.showInputDialog(null,
							"Masukkan Nama Lengkap Anda : ",
							"Nama ",
							JOptionPane.QUESTION_MESSAGE);
		String usia = JOptionPane.showInputDialog(null,
							"Usia anda : ",
							"Usia",
							JOptionPane.QUESTION_MESSAGE);
		bd.Usia = Integer.parseInt(usia);
		bd.Alamat = JOptionPane.showInputDialog(null,
							"Alamat Lengkap : ",
							"Alamat",
							JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null,
							bd.showMessage(),
							"Biodata anda",
							JOptionPane.INFORMATION_MESSAGE);
	}
}
