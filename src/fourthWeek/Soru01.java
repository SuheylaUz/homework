package fourthWeek;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/*
		Kullanýcýdan bir isim ve karakter girmesini isteyin, sonra karakterin kaç kez tekrarlandýðýný kontrol edin.
		e.g:
		char ch1= 'a' ;
		String name =“John came late" 
        => Tekrar Sayisi = 2
		*/

        Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle girin");
		String cumle = scan.nextLine();
		
		System.out.println("Lutfen bir karakter girin");
		String ch = scan.next();
		
		int count = 0;
		for (int i = 0; i < cumle.length(); i++) {
			if (cumle.charAt(i)==ch.charAt(0)) {
				count++;
			}
		}System.out.println(ch + " cumlede " + count + " defa var" );
	}

}

