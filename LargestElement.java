import java.util.Scanner;

public class LargestElement{
	public static void main (String[] args) {

		LargestElement newArr = new LargestElement () ;
		System.out.print(newArr.largestElement()) ;
	
	}

	public int largestElement() {
		int[] myArr = new int[] {245, 123, 4593, 582, 381, 2918} ;

		int largest = 0 ;

		for (int i = 0; i <= myArr.length -1; i++) {
			if (myArr[i] > largest) {
				largest = myArr[i] ;
			}
		}
		return largest;
	}
	}