package secondWeek;

import java.util.Scanner;

public class Soru5 {

	public static void main(String[] args) {
		/* 
		Kullan�c�n� 1 ile 7 aras�nda bir say� girdi�inde haftan�n hangi g�n� oldu�unu yazd�ran switch case java kodunu yazin�z.
				 */

		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen 1 ile 7 aras�nda bir rakam girin");
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
