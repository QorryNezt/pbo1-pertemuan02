import java.util.Scanner;

public class InputOutput{
	public static void main(String [] args){
	Scanner scanner = new Scanner(System.in)	;
	String nama;
	int jumlahSks;
	double IPK;
	
	System.out.print("Masukkan nama Anda: ");
	nama = scanner.nextLine();
	System.out.print("Hai, "+nama);
	System.out.println();
	
	System.out.print("Masukkan Jumlah SKS yang sudah ditempuh : ");
	jumlahSks = scanner.nextInt();
	
	System.out.print("Masukkan IPK Sementara : ");
	IPK = scanner.nextDouble();
	
	double jumlah = IPK * jumlahSks;
	System.out.print("Total Nilai = "+jumlah);
	}
}