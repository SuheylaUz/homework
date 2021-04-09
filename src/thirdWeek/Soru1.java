package thirdWeek;

import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		
		/* 			
        Kullanýcýnýn girmiþ olduðu A,B,C,D,F notlarýnýn karþýlýðýný yazdýran Switch Case java kodunu yazýnýz.					
        A	Excellent				
        B	Good				
        C	Average				
        D	Deficient				
        F	Failing								
		 */

		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen harf notunuzu giriniz");
		char harfNotu = scan.next().toUpperCase().charAt(0);
		
		switch(harfNotu) {
		case('A'):
			System.out.println("Excellent");
		break;
		case('B'):
			System.out.println("Good");
		break;
		case('C'):
			System.out.println("Average");
		break;
		case('D'):
			System.out.println("Deficient");
		break;
		case('F'):
			System.out.println("Failing");
		break;
		default:
		System.out.println("yanlýs harf notu girdiniz");
		}
		
		scan.close();
		
		
		
		
		

	}

}
