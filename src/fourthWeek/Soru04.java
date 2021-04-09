package fourthWeek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru04 {



	public static void main(String[] args) {
		/*
		Get numbers from the user and output that number consecutive fibonacci number sequence
		     	e.g : User enters 10
		output : 0 1 1  2  3  5 8 13 21 34
		      	*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi girin");
		int sayi = scan.nextInt();
		
		List <Integer> fibo = new ArrayList<>();
		
		fibo.add(0);
		fibo.add(1);
		System.out.println(fibo);

		for (int i = 0; i < sayi-2; i++) {
			fibo.add(fibo.get(i)+fibo.get(i+1));
		}
		
		for (Integer j : fibo) {
			System.out.print(j +" ");
		}
	}

}
