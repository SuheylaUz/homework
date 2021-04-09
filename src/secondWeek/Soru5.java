package secondWeek;

import java.util.Scanner;

public class Soru5 {

	public static void main(String[] args) {
		/* 
		Kullanýcýný 1 ile 7 arasýnda bir sayý girdiðinde haftanýn hangi günü olduðunu yazdýran switch case java kodunu yazinýz.
				 */

		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen 1 ile 7 arasýnda bir rakam girin");
		int gun = scan.nextInt();
		
		switch(gun) {
		case 1:
			System.out.println("pazartesi");
			break;
		case 2:
			System.out.println("sali");
			break;
		case 3:
			System.out.println("carsamba");
			break;
		case 4:
			System.out.println("persembe");
			break;
		case 5:
			System.out.println("cuma");
			break;
		case 6:
			System.out.println("cumartesi");
			break;
		case 7:
			System.out.println("pazar");
			break;
			default:
				System.out.println("bu rakami karsilayan bir gun yok");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	private static void Switch(int i) {
		// TODO Auto-generated method stub
		
	}

}
