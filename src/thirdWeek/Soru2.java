package thirdWeek;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		  
		/*  
		Kullanicinin girmis oldugu ay icin kac gun oldugunu yazdiran Switch Case java kodunu yaziniz.
		*/

		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen bir ay giriniz");
		String ay = scan.next();
		
		switch(ay) {
		case("ocak"):
		case("mart"):
		case("may�s"):
		case("temmuz"):
		case("agustos"):
		case("ekim"):
		case("aral�k"):
			System.out.println("Bu ay 31 g�nd�r");
		break;
		case("nisan"):
		case("haziran"):
		case("eyl�l"):
		case("kas�m"):
			System.out.println("Bu ay 30 g�nd�r");
		break;
		case("subat"):
			System.out.println("Bu ay 28 g�nd�r, 4 yilda bir defa 29 g�nd�r");
		break;
		default:
			System.out.println("Hatal� g�n ismi");
			
				
		}

	}

}
