package secondWeek;

import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		/*
        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa “gecerli bir email girin” yazdirin
       @ isaretinden sonra sadece “gmail.com” yaziyorsa “email onaylandi” yazdirin
       @ isaretinden sonra “gmail.com” disinda birsey yaziyorsa “Lutfen gmail hesabinizi girin” yazdirin
       ORNEK:
       INPUT : techproed.com OUTPUT : “gecerli bir email girin”
       INPUT : techproed@gmail.com OUTPUT : “email onaylandi”
       INPUT : techproed@hotmail.com OUTPUT : “Lutfen gmail hesabinizi girin”
       */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen email adresinizi giriniz");
        String email = scan.next();
        
        //int sonMu = email.indexOf("@gmail.com", email.length()-10); @gamil.com sonda mi diye kontrol etmeye çalýþtým
		
		if (!email.contains("@")) {
			System.out.println("gecerli bir email girin");	
		} else if (email.contains("gmail.com") && email.endsWith("@gmail.com")) {
			System.out.println("email onaylandi");
		} else {
			System.out.println("Lutfen gmail hesabinizi girin");
		}
		 
		scan.close();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
