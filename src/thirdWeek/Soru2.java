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
		case("mayýs"):
		case("temmuz"):
		case("agustos"):
		case("ekim"):
		case("aralýk"):
			System.out.println("Bu ay 31 gündür");
		break;
		case("nisan"):
		case("haziran"):
		case("eylül"):
		case("kasým"):
			System.out.println("Bu ay 30 gündür");
		break;
		case("subat"):
			System.out.println("Bu ay 28 gündür, 4 yilda bir defa 29 gündür");
		break;
		default:
			System.out.println("Hatalý gün ismi");
			
				
		}

	}

}
