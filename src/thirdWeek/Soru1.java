package thirdWeek;

import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		
		/* 			
        Kullan�c�n�n girmi� oldu�u A,B,C,D,F notlar�n�n kar��l���n� yazd�ran Switch Case java kodunu yaz�n�z.					
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
		System.out.println("yanl�s harf notu girdiniz");
		}
		
		scan.close();
		
		
		
		
		

	}

}
