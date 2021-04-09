package thirdWeek;

import java.util.Scanner;

public class Soru6 {

	public static void main(String[] args) {
		/* 
		Kullanýcýdan firstName ve lastName'i girmesini isteyin, ardýndan baþ harflerini büyük harf yapýn ve 
		geri kalaný tamamen kucuk harf olarak konsolda yazdirin.          
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
