package thirdWeek;

import java.util.Scanner;

public class Soru3 {

	public static void main(String[] args) {
		        /*
		        Ternary kullanarak:
				int variable : FIYAT
				string variable : Secim (String Secim=.....)
				price = $10 ise Print “UCUZ”
				price 10-$20 arasi ise Print “UYGUN”
				diger durumlar icin “PAHALI” yazdirin.
				*/
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen aldiginiz urunun fiyatini giriniz");
		int fiyat = scan.nextInt();
		System.out.println("Urunun fiyati: " + "$" + fiyat);
		
		System.out.println(fiyat<=10 ? "Ucuz" : (fiyat>10 && fiyat<=20 ? "Uygun" : "Pahali"));


	}

}
