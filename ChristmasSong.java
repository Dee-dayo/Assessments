public class ChristmasSong {

	public static void main (String[] args) {

		int day = 1;
		int gift = 1;

		for (day = 1; day <= 12; day ++) {
			System.out.println("On the " + getDay(day) + " of christmas, my true love gave to me") ;
			
			for (gift = day; gift >=1; gift -- ) {
				System.out.println(getGift(gift));
			}
			System.out.println();
		}
		
		
	}

	public static String getDay (int day) {

		switch (day) {
			case 1: return "First" ;
			case 2: return "Second" ;
			case 3: return "Third" ;
			case 4: return "Fourth" ;
			case 5: return "Fifth" ;
			case 6: return "Sixth" ;
			case 7: return "Seventh" ;
			case 8: return "Eight" ;
			case 9: return "Ninth" ;
			case 10: return "Tenth" ;
			case 11: return "Eleven" ;
			case 12: return "Twelve" ;
			default: return "Invalid day" ;
		}
	}

	public static String getGift (int gift) {
	
		switch (gift) {
			case 1: return "A partridge in a pear tree" ;
			case 2: return "Two turtle doves" ;
			case 3: return "Three French hens";
			case 4: return "Four calling birds" ;
			case 5: return "Five gold rings";
			case 6: return "Six geese a-laying";
			case 7: return "Seven swans a-swimming";
			case 8: return "Eight maids a-milking";
			case 9: return "Nine ladies dancing";
			case 10: return "Ten lords a-leaping";
			case 11: return "Elven pipers piping";
			case 12: return "Twelve drummers drumming";
			default: return "No gift" ;
		}
	}

}