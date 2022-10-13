import javax.swing.JOptionPane;
public class Latihan10{
	public static void main(String[] args) {
		ATM a = new ATM();
		a.getPin();
	}
}

class ATM {
	int pin = 212310055;
	long saldo = 50000;
	long sisa;
	public int getPin() {
		boolean isWrong = false;
		do {
			String Pin = JOptionPane.showInputDialog(null,
					"Masukkan PIN anda :",
					"SELAMAT DATANG DI ATM BERSAMA",
					JOptionPane.QUESTION_MESSAGE);
				if (Pin == null) {
					int isExit = JOptionPane.showConfirmDialog(null,
							"Apakah anda sudah selesai dengan transaksi :",
							"Konfirmasi keluar",
							JOptionPane.YES_OPTION);
					if (isExit == 0) {
						System.exit(0);
						} else if (isExit == 1){
							return getPin();
							}
					}
				if(Pin.isEmpty()) {
					JOptionPane.showMessageDialog(null,
								"Mohon masukkan pin anda !!",
								"PIN SALAH",
								JOptionPane.ERROR_MESSAGE);
					continue;
				}
				if (isNumber(Pin)) {
					int convertPin = Integer.parseInt(Pin);
					if(convertPin == pin) {
						menu();
					} else { JOptionPane.showMessageDialog(null,
							"PIN yang anda masukkan salah, silahkan ulangi",
						 	"PIN SALAH !!!",
							JOptionPane.ERROR_MESSAGE);
					isWrong = false;
					}
				}
			} while (!isWrong);
		return pin;
	}
	public String menu() {
		String	menu = "1. Lihat Saldo\n";
		menu += "2. Setor Tunai\n";
		menu += "3. Tarik Tunai\n";
		menu += "4. Keluar";
		String choice = JOptionPane.showInputDialog(null,
								menu,
								"ATM BERSAMA",
								JOptionPane.QUESTION_MESSAGE);
		if (choice == null) {
			int isExit = JOptionPane.showConfirmDialog(null,
						"Apakah anda sudah selesai dengan transaksi :",
						"Konfirmasi keluar",
						JOptionPane.YES_OPTION);
			if (isExit == 0) {
				System.exit(0);
				} else {
					return menu();
					}	
		}
		if (choice.isEmpty()) {
			JOptionPane.showMessageDialog(null,
						"Mohon masukkan pilihan Anda !!",
						"ERROR",
						JOptionPane.ERROR_MESSAGE);
			return menu();
			} try {
				int convertChoice = Integer.parseInt(choice);
				switch(convertChoice) {
				case 1 : showSaldo(saldo);
						int isExit = JOptionPane.showConfirmDialog(null,
									"Apakah anda sudah selesai dengan transaksi :",
									"Konfirmasi keluar",
									JOptionPane.YES_OPTION);
						if (isExit == 0) {
							System.exit(0);
							} else {
								return menu();
								}
						break;
				case 2 : deposit();
						int isExit1 = JOptionPane.showConfirmDialog(null,
									"Apakah anda sudah selesai dengan transaksi :",
									"Konfirmasi keluar",
									JOptionPane.YES_OPTION);
						if (isExit1 == 0) {
							System.exit(0);
							} else {
								return menu();
								}
						break;
				case 3 : withdraw();
						int isExit2 = JOptionPane.showConfirmDialog(null,
									"Apakah anda sudah selesai dengan transaksi :",
									"Konfirmasi keluar",
									JOptionPane.YES_OPTION);
						if (isExit2 == 0) {
							System.exit(0);
							} else {
								return menu();
								}
						 break;
				case 4 : int isExit3 = JOptionPane.showConfirmDialog(null,
									"Apakah anda sudah selesai dengan transaksi :",
									"Konfirmasi keluar",
									JOptionPane.YES_OPTION);
						if (isExit3 == 0) {
							System.exit(0);
							} else{
								return menu();
								}
						}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,
							"Masukkan nilai numerik",
							"Error",
							JOptionPane.WARNING_MESSAGE);
			return menu();
		}
		return menu;
	}
   	public long showSaldo(long saldo) {
		JOptionPane.showMessageDialog(null,
					"Saldo anda : " + saldo + ",-",
					"Saldo",
					JOptionPane.INFORMATION_MESSAGE);
		return saldo;
	}
	public String deposit() {
		long deposit = 0;
		String reqDepo = JOptionPane.showInputDialog(null,
						"Masukkan nominal setor tunai :",
						"Setor Tunai",
						JOptionPane.QUESTION_MESSAGE);
		if (reqDepo == null) {
			int exit = JOptionPane.showConfirmDialog(null,
						"Apakah anda ingin membatalkannya ?",
						"Exit",
						JOptionPane.YES_NO_OPTION);
			if (exit == 0) {
				return menu();
			} else {
				return deposit();
			}
		}
		if (reqDepo.isEmpty()) {
			JOptionPane.showMessageDialog(null,
					"Nilai setor tunai tidak boleh kosong",
					"Error",
					JOptionPane.ERROR_MESSAGE);
			return deposit();
		}
		try {
			deposit = Long.parseLong(reqDepo);
			String tampil = "Saldo anda  : "  + saldo + "\nNominal Setor Tunai : " + deposit;
			JOptionPane.showMessageDialog(null,
					tampil,
					"Alert",
					JOptionPane.INFORMATION_MESSAGE);
			deposit += saldo;
			JOptionPane.showMessageDialog(null,
					"Jumlah saldo anda setelah setor tunai adalah : Rp." + deposit +",-",
					"Tarik Tunai",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Masukkan Nilai Numerik !!!",
					"Error",
					JOptionPane.ERROR_MESSAGE);
			return deposit();
		}
		return menu();
	}
	public String withdraw() {
		long wd = 0;
		String tarTun = JOptionPane.showInputDialog(null,
						"Masukkan nominal tarik tunai : ",
						"Tarik Tunai",
						JOptionPane.QUESTION_MESSAGE);
		if (tarTun == null) {
			int exit = JOptionPane.showConfirmDialog(null,
					"Apakah anda ingin membatalkannya ?",
					"Exit",
					JOptionPane.YES_NO_OPTION);
			if (exit == 0) {
				return menu();
				} else {
					return withdraw();
					}
			}
		if (tarTun.isEmpty()) {
			JOptionPane.showMessageDialog(null,
					"Nilai tarik tunai tidak boleh kosong",
					"Error",
					JOptionPane.ERROR_MESSAGE);
			return withdraw();
		}
		try {
			wd = Long.parseLong(tarTun);
			sisa = saldo - wd;
			String tampil = "Saldo anda  : "  + saldo + "\nNominal Tarik Tunai : " + wd;
			if (wd <= saldo) {
				JOptionPane.showMessageDialog(null,
							tampil,
							"Alert",
							JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,
							"Sisa saldo anda setelah tarik tunai : Rp." + sisa +",-",
							"Tarik Tunai",
							JOptionPane.INFORMATION_MESSAGE);
			} else if (wd > saldo) {
				JOptionPane.showMessageDialog(null,
							"Saldo anda tidak mencukupi.",
							"Tarik Tunai",
							JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null,
							tampil,
							"Alert",
							JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Masukkan Nilai Numerik !!!",
					"Error",
					JOptionPane.ERROR_MESSAGE);
			return withdraw();
		}
		return menu();
	}
	public boolean isNumber(String number) {
		try {
			Integer.parseInt(number);
			return true;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
						"Masukkan nilai numerik",
						"Error",
						JOptionPane.WARNING_MESSAGE);
			return false;
		}
	}
}
