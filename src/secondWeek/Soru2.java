package secondWeek;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		/*
        Print "L�tfen i� unvan�n�z� girin� 
        �jobTitle� isimli bir degisken olusturun ve kullanicidan isteyin.
        Do�ru jobTitle yazd�rmak i�in a�a��daki test datalarini kullan�n. Example :
        Eger jobTitle  qa ise print ��� unvan�n�z Quality Analyst� 
        test data: qa ise print Quality Analyst 
        dev ise print Developer 
        ba ise print Business Analyst 
        pm ise print Project Manager
       */
    
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen i� unvan�n�z� girin");
		String jobTitle = scan.next();		
		
		if (jobTitle.equalsIgnoreCase("qa")) {
			System.out.println("Is unvan�n�z :" + "Quality Analyst");
		} else if (jobTitle.equalsIgnoreCase("dev")) {
			System.out.println("Is unvan�n�z :" + "Developer");
		} else if (jobTitle.equalsIgnoreCase("ba")) {
			System.out.println("Is unvan�n�z :" + "Business Analyst");
		} else if (jobTitle.equalsIgnoreCase("pm")) {
			System.out.println("Is unvan�n�z :" + "Project Manager");
		} else {
            System.out.println("Lutfen gecerli k�saltma giriniz");
		}
		scan.close();

}
}