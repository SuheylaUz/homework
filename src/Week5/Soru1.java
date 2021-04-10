package Week5;

import java.util.Scanner;

public class Soru1 {

	 @SuppressWarnings("resource")
	public static void main(String[] args) {
		 /*
		 Kendin çözmeyi dene
	     * Stringi ters çevirmek için bir Java Programý yazýn 
	     * 1.Yol: StringBuilder() kullanarak
	     * 2.Yol: String Classini kullanarak 
	     * 3.Yol: Bir method oluþturun, ardýndan methodu main method dan çaðýrýn
	     */
	    
	       
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Lutfen ters cevirmek istediginiz String'i giriniz: ");
	        String str = scan.nextLine();
	        
	        System.out.println("======= StringBuilder() ile =======");
	        StringBuilder sb1= new StringBuilder(str);
	        StringBuilder sb1Ters= new StringBuilder();
	        
	        for (int i = sb1.length(); i >0; i--) {
	            sb1Ters.append(sb1, i-1, i);
	        }
	        System.out.println(sb1Ters);
	        
	        
	        System.out.println("======= String Class'i ile =======");
	        String sonuc = "";
	        for (int i = str.length()-1; i >= 0; i--) {
	            sonuc += str.charAt(i);
	        }
	        System.out.println(sonuc);
	        
	        
	        System.out.println("======= Method call ile =======");
	        System.out.println(stringReverse(str));
	        
	    }
	    public static String stringReverse(String str) {
	        String reverse = "";
	        for (int i = str.length()-1; i >= 0; i--) {
	            reverse += str.substring(i, i+1);
	        }
	        return reverse;
		
	}

}
