package thirdWeek;

import java.util.Scanner;

public class Soru5 {

	public static void main(String[] args) {
		/*
		Kullan�c�dan bir kelime girmesini isteyin. S�zc�kte tek say�da karakter ve 3 veya daha fazla karakter i�eriyorsa, 
		kelimenin ortas�ndaki karakteri yazd�r�n.
		*/

		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen bir kelime giriniz");
		String kelime = scan.next();
		
		if (kelime.length()%2!=0 && kelime.length()>=3) {
			System.out.println(kelime.charAt((kelime.length()-1)/2));
		}else {
			System.out.println("girdi�iniz kelime cift sayili veya tek harften olu�uyor");
		}

	}

}
