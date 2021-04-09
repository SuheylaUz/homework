package thirdWeek;

import java.util.Scanner;

public class Soru5 {

	public static void main(String[] args) {
		/*
		Kullanýcýdan bir kelime girmesini isteyin. Sözcükte tek sayýda karakter ve 3 veya daha fazla karakter içeriyorsa, 
		kelimenin ortasýndaki karakteri yazdýrýn.
		*/

		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen bir kelime giriniz");
		String kelime = scan.next();
		
		if (kelime.length()%2!=0 && kelime.length()>=3) {
			System.out.println(kelime.charAt((kelime.length()-1)/2));
		}else {
			System.out.println("girdiðiniz kelime cift sayili veya tek harften oluþuyor");
		}

	}

}
