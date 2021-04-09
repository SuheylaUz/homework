package firstWeek;

public class Soru5 {

	public static void main(String[] args) {
		
		/*
		Iki degisken atayin : 
		num1=1,
		num2=1 
		‘increment’ yontemini kullanarak Carpim Tablosunu yazdirin.
		Note: ++ increment isareti 1 arttirir. 
		Asagidaki sekilde Carpim Tablosunu yazdirin:
		1 X 1 = 1
		1 X 2 = 2  
		1 X 3 = 3
		...
		1 X 10 =10
		*/

		int n1 = 8;
		int n2 = 1;
		
		System.out.println(n1 + "x" + n2 + "=" + (n1*n2)); 
		System.out.println(n1 + "x" + ++n2 + "=" + (n1*n2));
		System.out.println(n1 + "x" + ++n2 + "=" + (n1*n2));
		System.out.println(n1 + "x" + ++n2 + "=" + (n1*n2));
		System.out.println(n1 + "x" + ++n2 + "=" + (n1*n2));
		System.out.println(n1 + "x" + ++n2 + "=" + (n1*n2));
		System.out.println(n1 + "x" + ++n2 + "=" + (n1*n2));
		System.out.println(n1 + "x" + ++n2 + "=" + (n1*n2));
		System.out.println(n1 + "x" + ++n2 + "=" + (n1*n2));
		System.out.println(n1 + "x" + ++n2 + "=" + (n1*n2));

	}

}
