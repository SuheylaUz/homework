package fourthWeek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru03 {

	public static void main(String[] args) {
		/*
		Verilen String array icerisindeki tekrar eden karakterleri yazdiran Java kodunu yaziniz. 
		String str=“ilovejavatoo” 
		Output: o v a
		 */

		String str = "ilovejavatoo";
		String arr[]=str.split("");
		System.out.println(Arrays.asList(arr));
		List <String> list = new ArrayList<>();
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					if (!list.contains(arr[i])) {
						list.add(arr[i]);
					}
				}
			}
		}System.out.println(list);
	
	

	}
}