package thirdWeek;

public class Soru7 {

	public static void main(String[] args) {
		/*
		StringMethods:
		�ift uzunlukta bir degiskenin ilk yar�s�n� konsolda yazdirmak i�in bir Java program� yaz�niz.
	    ORNEK:
		INPUT  :  Python
		OUTPUT :  Pyt
		*/
		
		String str = "Python";
		ilkYari(str);


	}

	public static void ilkYari(String str) {
		if (str.length()%2==0) {
			System.out.println(str.substring(0, str.length()/2));
		}
		
			
		

		
		
		
	}

}
