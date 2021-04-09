package fourthWeek;

public class Soru05 {

	public static void main(String[] args) {
		/* 
		String name = "Emine";
		charAt yöntemini kullanarak konsolda tüm harfleri yazdýrýn.
		*/

		String name = "Emine";
		
		for (int i = 0; i < name.length(); i++) {
			System.out.print(name.charAt(i) + ", ");
		}
		
		System.out.println("");

		for (int i = 0; i < name.length(); i++) {
			System.out.print(String.valueOf(name.charAt(i))+ ", ");
		}
		
	}

}
