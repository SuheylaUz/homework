package secondWeek;

import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {
		/* 
		Kullanicidan 3 tane pozitif  tam sayi alalim
		bu uc sayidan ucgen olup olmama durumunu kontrol edelim
		eger ucgen olabiliyor ise, es kenar ucgen mi kontrol edelim.

		* Ucgen olma kosullari.
		b+c>a>b-c  1
		a+c>b>a-c  1
		a+b>c>a-b 1

		* Eskenar ucgen olma kosullari.
		a=b=c 

		Konsolda asagidaki durumlari yazdiralim.
		Eskenar ucgen
		Sadece ucgen
		Ucgen degildir
		         */

		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen 3 tane pozitif tam sayi girin");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
	
		if (a==b && a==c && b==c) { 
			System.out.println("Eskenar Ucgen");
		} else if ((b+c>a && a>b-c) && (a+c>b && b>a-c) && (a+b>c && c>a-b)) {
			System.out.println("Ucgen");
		} else {
            System.out.println("Ucgen Degil");
		}{

		}
		
		
		
		
		
		
		

	}

}
