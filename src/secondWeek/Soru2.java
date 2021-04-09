package secondWeek;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		/*
        Print "Lütfen iþ unvanýnýzý girin” 
        “jobTitle” isimli bir degisken olusturun ve kullanicidan isteyin.
        Doðru jobTitle yazdýrmak için aþaðýdaki test datalarini kullanýn. Example :
        Eger jobTitle  qa ise print “Ýþ unvanýnýz Quality Analyst” 
        test data: qa ise print Quality Analyst 
        dev ise print Developer 
        ba ise print Business Analyst 
        pm ise print Project Manager
       */
    
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen iþ unvanýnýzý girin");
		String jobTitle = scan.next();		
		
		if (jobTitle.equalsIgnoreCase("qa")) {
			System.out.println("Is unvanýnýz :" + "Quality Analyst");
		} else if (jobTitle.equalsIgnoreCase("dev")) {
			System.out.println("Is unvanýnýz :" + "Developer");
		} else if (jobTitle.equalsIgnoreCase("ba")) {
			System.out.println("Is unvanýnýz :" + "Business Analyst");
		} else if (jobTitle.equalsIgnoreCase("pm")) {
			System.out.println("Is unvanýnýz :" + "Project Manager");
		} else {
            System.out.println("Lutfen gecerli kýsaltma giriniz");
		}
		scan.close();

}
}