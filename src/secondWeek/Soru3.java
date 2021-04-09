package secondWeek;

import java.util.Scanner;

public class Soru3 {

	public static void main(String[] args) {
		/*
		 * “NestedIfStatements” class olusturun.
		 * 
		 * Kullanicidan 2 kisi icin dogum gunu girmesini isteyin.
		 * 
		 * Yýlý, ayi ve günü tamsayý olarak alýn e NestedIf kullanarak kimin yas olarak
		 * daha buyuk oldugunu ekrana yazdirin. Examples: int birthYearOfYusuf=2000,
		 * birthMonthOfYusuf=12, birthDayOfYusuf=12, int
		 * birthYearOfMehmet=2000,birthMonthOfMehmet=12, birthDayOfMehmet=21; Yusuf is
		 * Older
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen isminizi girin");
		String name = scan.next();
		System.out.println("Lutfen dogdugunuz yili girin");
		int year = scan.nextInt();
		System.out.println("Lutfen dogdugunuz ayi girin");
		int mounth = scan.nextInt();
		System.out.println("Lutfen dogdugunuz gunu girin");
		int day = scan.nextInt();
		System.out.println("Lutfen isminizi girin");
		String name1 = scan.next();
		System.out.println("Lutfen dogdugunuz yili girin");
		int year1 = scan.nextInt();
		System.out.println("Lutfen dogdugunuz ayi girin");
		int mounth1 = scan.nextInt();
		System.out.println("Lutfen dogdugunuz gunu girin");
		int day1 = scan.nextInt();

		

		if (mounth < 1 || mounth > 12 || mounth1 < 1 || mounth1 > 12) {

			System.out.println("lutfen gecerli bir ay giriniz");

		} else if (day < 1 || day > 31 || day1 < 1 || day1 > 31) {
			System.out.println("lutfen gecerli bir gün giriniz");

		} else if (year == year1) {
			if (mounth < mounth1) {
				System.out.println(name + " daha buyuk");
			} else if (mounth == mounth1 && day < day1) {
				System.out.println(name + " daha buyuk");
			}
		} else if (year > year1) {
			System.out.println(name1 + " daha buyuk");
		} else {
			System.out.println(name + " daha buyuk");
		}
 
		scan.close();
	}

}