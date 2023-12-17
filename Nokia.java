import java.util.Scanner ;

public class Nokia {

	public static void main (String [] args) {

	menuPage() ;
	int menu = new Scanner (System.in).nextInt() ;
	System.out.println() ;
	
	switch (menu) {
		case 1 : 	phonebook() ;
				int phonebook = new Scanner (System.in).nextInt() ;
					if (phonebook == 1) {
						System.out.print("No contact saved on this small phone jare") ;
					} else
					if (phonebook == 2) {
						System.out.print("Emergency service lines\n767 or 112") ;
					} else
					if (phonebook == 3) {
						System.out.print("You can't add a name yet, na small phone") ;
					} else
					if (phonebook == 4) {
						System.out.print("You can't erase palmpay number oo, debtor") ;
					} else
					if (phonebook == 5) {
						System.out.print("You wan't to edit what? Contact dey here?") ;
					} else
					if (phonebook == 6) {
						System.out.print("We already assigned d debtor song for you, no wori") ;
					} else
					if (phonebook == 7) {
						System.out.print("So you have a business card? wow!!!") ;
					} else
					if (phonebook == 8) {
						phonebookOptions() ;
					} else
					if (phonebook == 9) {
						System.out.print("Who are you speed dialing? Dy play my fans") ;
					}
					if (phonebook == 10) {
						System.out.print("I don't even understand what voice tags mean!!!") ;
					}else
					if (phonebook == 0) menuPage() ;
					
				break ;
		case 2 :	messages () ;
				break ;
		case 3 :	chat () ;
				break ;
		case 4 :	 callRegister () ;
				break ;
		case 5 :	tones () ;
				break ;
		case 6 :	settings () ;
				break ;
		case 7 :	callDivert () ;
				break ;
		case 8 :	games () ;
				break ;
		case 9 :	calculator () ;
				break ;
		case 10 :	reminders () ;
				break ;
		case 11 :	clock () ;
				break ;
		case 12 :	profiles () ;
				break ;
		case 13 :	simServices () ;
				break ;
		default :	System.out.print("You entered an invalid number") ;
	}
	
	}

public static void menuPage () {
	System.out.println("\nNOKIA CONNECTING PEOPLE\n1. Phone book\n2. Messages\n3. Chat\n4. Call Register\n5. Tones\n6. Settings\n7. Call Divert\n8. Games\n9. Calculator\n10. Reminders\n11. Clock\n12. Profiles\n13. SIM Services") ;
}

public static void phonebook () {
	System.out.println("\nPHONEBOOK\n1. Search\n2. Service Nos.\n3. Add name\n4. Erase\n5. Edit\n6. Assign tone\n7. Send b'card\n8. Options\n9. Speed dials\n10. Voice tags\n\npress '0' to go to main menu") ;
}

public static void messages () {
	System.out.println("MESSAGES\n1. Write messages\n2. Inbox\n3. Outbox\n4. Picture messages\n5. Templates\n6. Smileys\n7. Message settings\n8. Info service\n9. Voice mailbox number\n10. Service command editor") ;
}

public static void chat () {
	System.out.println("CHAT\nNa this small phone you wan use dy chat? U no fear God???") ;
}

public static void callRegister () {
	System.out.println("CALL REGISTER\n1. Missed calls\n2. Received calls\n3. Dialled numbers\n4. Erase recent call lists\n5. Show call duration\n6. Show call costs\n7. Call cost settings\n8. Prepaid credit") ;
}

public static void tones () {
	System.out.println("TONES\n1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tone\n6. Keypad tones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver") ;
}

public static void settings () {
	System.out.println("SETTINGS\n1. Call settings\n2. Phone settings\n3. Security settings\n4. Restore factory settings") ;
}

public static void callDivert () {
	System.out.println("CALL DIVERT\nWhy you wn divert call? You dey owe palmpay???") ;
}

public static void games () {
	System.out.println("GAMES\nPerson wey dy owe wan play game? LMAO!!!") ;
}

public static void calculator () {
	System.out.println("CALCULATOR\nYou wan calculate money wey you dy owe? LOL") ;
}

public static void reminders () {
	System.out.println("REMINDERS\nThe only reminder you need is that you are owing") ;
}

public static void clock () {
	System.out.println("CLOCK\n1. Alarm clock\n2. Clock settings\n3. Date setting\n4. Stopwatch\n5. Countdown timer\n6. Auto update of date and time") ;
}

public static void profiles () {
	System.out.println("PROFILES\nNothing to display") ;
}

public static void simServices () {
	System.out.println("SIM Services\nNa dis small phone u wn put sim???") ;
}


public static void phonebookOptions () {
	System.out.println("\nPHONEBOOK/OPTIONS\n1. Type of view\n2. Memory Status\n\npress '0' to go back to Phonebook menu") ;
	int phonebookOptions = new Scanner (System.in).nextInt() ;
		if (phonebookOptions == 0) phonebook() ;
}


}