package thirdWeek;

import java.util.Scanner;

public class Soru6 {

	public static void main(String[] args) {
		/* 
		Kullan�c�dan firstName ve lastName'i girmesini isteyin, ard�ndan ba� harflerini b�y�k harf yap�n ve 
		geri kalan� tamamen kucuk harf olarak konsolda yazdirin.          
		ferhat => Ferhat
		kirac => Kirac
		*/

		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen isminizi giriniz");
		String name = scan.nextLine();
		
		
		char ilkHarf = name.toUpperCase().charAt(0);
		String geriKalan = name.toLowerCase().substring(1, name.length());
		
		System.out.println(ilkHarf + geriKalan);
		

	}

}
