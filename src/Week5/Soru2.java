package Week5;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {

		/*
		 * Kullanicidan sayilar girmesini isteyin ve girdigi sayilari toplayip yazdirin.
		 * yeni sayi isteyin girilen sayilarin toplami 100 'u gecerse
		 * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
		 *
		 */

		Scanner scan = new Scanner(System.in);
		
		int toplam = 0;
		int count = 0;
		do {
			System.out.println("Lutfen toplamak istediðiniz yeni sayi yazýn");
			toplam += scan.nextInt();
			count++;
		} while (toplam<=100);
		System.out.println(count + " kere girdiniz bu kadar yeter sayýlarýn toplamý: " + toplam);
	}
	

}
