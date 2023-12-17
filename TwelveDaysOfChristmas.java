import java.util.Scanner;

public class TwelveDaysOfChristmas {
	public static void main (String [] args) {
	
		Scanner input = new Scanner (System.in) ;

		System.out.print ("Enter the day of Christmas you want: ") ;

		while (input.hasNext()) {
			
			int day = input.nextInt() ;

			switch (day) {
				case 1:	System.out.println("On the first day of Christmas my true love sent to me\nA partridge in a pear tree") ;
						break ;
				case 2:	System.out.println("On the second day of Christmas my true love sent to me\nTwo turtle doves\nAnd a partridge in a pear tree.") ;
						break ; c 
				case 3:	System.out.println("On the third day of Christmas my true love sent to me\nThree French hens\nTwo turtle doves,\nAnd a partridge in a pear tree.") ;
						break ;
				case 4:	System.out.println("On the fourth day of Christmas my true love sent to me\nFour calling birds\nThree French hens,\nTwo turtle doves,\nAnd a partridge in a pear tree.") ;
						break ;
				case 5:	System.out.println("On the fifth day of Christmas my true love sent to me\nFive Gold rings\nFour calling birds\nThree French hens,\nTwo turtle doves,\nAnd a partridge in a pear tree.") ;
						break ;
				case 6:	System.out.println("On the sixth day of Christmas my true love sent to me\nSix Geese a-laying\nFive Gold rings\nFour calling birds\nThree French hens,\nTwo turtle doves,\nAnd a partridge in a pear tree.") ;
						break ;
				case 7:	System.out.println("On the seventh day of Christmas my true love sent to me\nSeven Swans a-swimming\nSix Geese a-laying\nFive Gold rings\nFour calling birds\nThree French hens,\nTwo turtle doves,\nAnd a partridge in a pear tree.") ;
						break ;
				case 8:	System.out.println("On the eight day of Christmas my true love sent to me\nEight Maids a-milking\nSeven Swans a-swimming\nSix Geese a-laying\nFive Gold rings\nFour calling birds\nThree French hens,\nTwo turtle doves,\nAnd a partridge in a pear tree.") ;
						break ;
				case 9:	System.out.println("On the ninth day of Christmas my true love sent to me\nNine Ladis dancing\nEight Maids a-milking\nSeven Swans a-swimming\nSix Geese a-laying\nFive Gold rings\nFour calling birds\nThree French hens,\nTwo turtle doves,\nAnd a partridge in a pear tree.") ;
						break ;
				case 10:	System.out.println("On the tenth day of Christmas my true love sent to me\nTen Lords a-leaping\nNine Ladis dancing\nEight Maids a-milking\nSeven Swans a-swimming\nSix Geese a-laying\nFive Gold rings\nFour calling birds\nThree French hens,\nTwo turtle doves,\nAnd a partridge in a pear tree.") ;
						break ;
				case 11:	System.out.println("On the eleventh day of Christmas my true love sent to me\nEleven Pipers piping\nTen Lords a-leaping\nNine Ladis dancing\nEight Maids a-milking\nSeven Swans a-swimming\nSix Geese a-laying\nFive Gold rings\nFour calling birds\nThree French hens,\nTwo turtle doves,\nAnd a partridge in a pear tree.") ;
						break ;
				case 12:	System.out.println("On the twelfth day of Christmas my true love sent to me\nTwelve Drummers drumming\nEleven Pipers piping\nTen Lords a-leaping\nNine Ladis dancing\nEight Maids a-milking\nSeven Swans a-swimming\nSix Geese a-laying\nFive Gold rings\nFour calling birds\nThree French hens,\nTwo turtle doves,\nAnd a partridge in a pear tree.") ;
						break ;
				default:	System.out.println("Invalid number, enter a valid day") ;
	
			}
		System.out.print ("\nEnter the day of Christmas you want (ctrl + z to end): ") ;
		}

	}
}
