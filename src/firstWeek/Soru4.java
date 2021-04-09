package firstWeek;

import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {
		
		/*
		Kullanicidan 3 basamakli bir sayi isteyin ve bu sayinin basamaklari toplamini konsolda yazdiran programi yaziniz.
		*/

        Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen 3 basamakli bir sayi girin :");
		
		int sayi = scan.nextInt();
		
		int birlerBas = sayi % 10; // birler bas
		
		System.out.println(birlerBas);
		
		sayi = sayi/10;
		
		int onlarBas = sayi % 10; // onlar bas
		
		System.out.println(onlarBas);
		
		sayi = sayi/10;
		
		int yuzlerBas= sayi % 10; // yuzler bas
		
		System.out.println(yuzlerBas);
		
		System.out.println("sayinin basamaklari toplami :" + (birlerBas + onlarBas + yuzlerBas));
		
		scan.close();
		
	}

}
