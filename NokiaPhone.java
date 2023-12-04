import java.util.Scanner ;

public class NokiaPhone {
	public static void main (String[] args) {

		Scanner input = new Scanner (System.in) ;

		System.out.println ("Welcome to NOKIA") ;
		System.out.print("\n1. Phone Book \n2. Messages\n3. Chat\n4. Call Register\n5. Tones\n6. Settings\n7. Call Divert\n8. Games\n9. Calclator\n10. Reminders\n11. Clock\n12. Profiles\n13. SIM Services\n\nor press'0' to end app: ");

		int menu = input.nextInt() ;
		
		while (menu != 0) { 

			while (menu == 1) {
			System.out.println("\nPHONEBOOK") ;
			System.out.print("1. Search\n2. Service Nos\n3. Add Name\n4. Erase\n5. Edit\n6. Assign Tone\n7. Send b'card\n8. Options\n9. Speed Dials\n10. Voice Tags\n") ;

			int phonebook = input.nextInt() ;
			
				if (phonebook == 1) {
					System.out.print("\nOutput") ;	
				} else
				if (phonebook == 2) {
					System.out.print("\nThis are service numbers\n777 or 112") ;	
				} else
				if (phonebook == 3) {
					System.out.print("\nType full name and phone number") ;
				} else
				if (phonebook == 4) {
					System.out.print("\nWhich contact do you want to erase?") ;
				} else
				if (phonebook == 5) {
					System.out.print("\nEdit a contact") ;
				} else
				if (phonebook == 6) {
					System.out.print("\nAssign a tone to a contact") ;
				} else
				if (phonebook == 7) {
					System.out.print("\nSelect contact you want to send business card") ;
				} else
				if (phonebook == 8) {
					System.out.print("\nOptions\n1. Type of view\n2. Memory status") ;
				} else
				if (phonebook == 9) {
					System.out.print("\nCreate speed dials for favourite contacts") ;
				} else
				if (phonebook == 10) {
					System.out.print("\nAdd voice tags to contacts") ;
				}
				System.out.print("\n\nPress any number to go to previous menu: ") ;
				phonebook = input.nextInt() ;
			}

			while (menu == 2) {
			System.out.println("\nMESSAGES") ;
			System.out.print("1. Write messages\n2. Inbox\n3. Outbox\n4. Picture messages\n5. Templates\n6. Smiles\n7. Messasge settings\n8. Info service\n9. Voice mailbox number\n10. Service command editor\n") ;

			int messages = input.nextInt() ;
			
				if (messages == 1) {
					System.out.print("\nOya start writing your message") ;	
				} else
				if (messages == 2) {
					System.out.print("\nYou have 50 unread messages but none is credit alert") ;	
				} else
				if (messages == 3) {
					System.out.print("\nThis are outgoing messages but it's empty") ;
				} else
				if (messages == 4) {
					System.out.print("\nNa this small phone u wan use send picture message?") ;
				} else
				if (messages == 5) {
					System.out.print("\nNo template here, getout abeg") ;
				} else
				if (messages == 6) {
					System.out.print("\nSmile Jesus love's you") ;
				} else
				if (messages == 7) {
					System.out.print("\nMESSAGE SETTINGS\n1. Set\n2. Common\n") ;
					int messageSettings = input.nextInt() ;
					
					if (messageSettings == 1) {
						System.out.print("\nMESSAGE SETTINGS/SET\n1. Message centre number\n2. Messages sent as\n3. Message validity") ;
					} else
					if (messageSettings == 2) {
						System.out.print("\nMESSAGE SETTINGS/COMMON\n1. Delivery reports\n2. Reply via same centre\n3. Character support") ;
					}
				} else
				if (messages == 8) {
					System.out.print("\nMessage Centre number\n878934610982690934") ;
				} else
				if (messages == 9) {
					System.out.print("\nVoice mail number 398712876132-4238712") ;
				} else
				if (messages == 10) {
					System.out.print("\nWhich service u wn edit, abegiii") ;
				}
				System.out.print("\n\nPress any number to go to previous menu: ") ;
				messages = input.nextInt() ;
			}

			if (menu == 3) {
			System.out.println("CHAT") ;
			System.out.print("This phone is too small na, no Chat app, thank you.") ;
			}

			while (menu == 4) {
			System.out.println("\nCALL REGISTER") ;
			System.out.print("1. Missed calls\n2. Received calls\n3. Dialed numbers\n4. Erase recent call lists\n5. Show call duration\n6. Show call costs\n7. Call cost settings\n8. Prepaid credit\n") ;

			int callRegister = input.nextInt() ;
			
				if (callRegister == 1) {
					System.out.print("\nYou missed 1,734 calls from Palmpay") ;	
				} else
				if (callRegister == 2) {
					System.out.print("\nYou dy pick call?? You wey dy owe debt") ;	
				} else
				if (callRegister == 3) {
					System.out.print("\nYou tried to call your babe, but sorry, u dnt have one") ;
				} else
				if (callRegister == 4) {
					System.out.print("\nYou wan erase call lists? You dy cheat??") ;
				} else
				if (callRegister == 5) {
					System.out.print("\nCALL DURATION\n1. Last call duration\n2. All calls'duration\n3. Received calls' duration\n4. Dialed calls' duration\n5. Clear timers") ;
				} else
				if (callRegister == 6) {
					System.out.print("\nCALL COST\n1. Last call cost\n2. All calls's cost\n3. Clear counters") ;
				} else
				if (callRegister == 7) {
					System.out.print("\nCOST SETTINGS\n1. Call cost limit\n2. Show caosts in") ;
				} else
				if (callRegister == 8) {
					System.out.print("\nI don't understand what this mean actually") ;
				}
				System.out.print("\n\nPress any number to go to previous menu: ") ;
				callRegister = input.nextInt() ;
			}

			if (menu == 5) {
			System.out.println("\nTONES") ;
			System.out.print("1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tone\n6. Keypad tones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver") ;
			}

			while (menu == 6 ) {
			System.out.println("\nSETTINGS") ;
			System.out.print("1. Call settings\n2. Phone settings\n3. Security settings\n4. Restore factory settings\n") ;

			int settings = input.nextInt() ;
			
				if (settings == 1) {
					System.out.print("\nCALL SETTINGS\n1. Automobile redial\n2. Speed dialing\n3. Call waiting options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer") ;	
				} else
				if (settings == 2) {
					System.out.print("\nPHONE SETTINGS\n1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service actions") ;	
				} else
				if (settings == 3) {
					System.out.print("\nSECURITY SETTINGS\n1. PIN code request\n2. Call barring service\n3. Fixed dialling\n4. Closed user group\n5. Phone security\n6. Change access codes") ;
				} else
				if (settings == 4) {
					System.out.print("You wan restore phone wey u no get anything inside???") ;
				}
				System.out.print("\n\nPress any number to go to previous menu: ") ;
				settings = input.nextInt() ;
			}

			if (menu == 7) {
			System.out.println("\nCALL DIVERT") ;
			System.out.print("Because you are owing Palmpay, you wan dy divert call abi??? Debtor") ;
			}

			if (menu == 8) {
			System.out.println("\nGAMES") ;
			System.out.print("You are supposed to be learning a skill or find something to fetch money, not playing game") ;
			}

			if (menu == 9) {
			System.out.println("\nCALCULATOR") ;
			System.out.print("The calculator is not function yet, please come back later") ;
			}
	
			if (menu == 10) {
			System.out.println("\nREMINDERS") ;
			System.out.print("Here is to remind you that you are still owing Palmpay, you can't run forever") ;
			}

			if (menu == 11) {
			System.out.println("\nCLOCK") ;
			System.out.print("1. Alarm Cloc\n2. Clock settings\n3. Date setting\n4. Stopwatch\n5. Countdown timer\n6. Auto update of date and time") ;
			}

			if (menu == 12) {
			System.out.println("\nPROFILES") ;
			System.out.print("No profile available now, try again later") ;
			}

			if (menu == 13) {
			System.out.println("\nSIM SERVICES") ;
			System.out.print("'No sim detected'") ;
			}
			
			System.out.print("\n\nPress 0 to end the app: ") ;
			menu = input.nextInt() ;
		}
	}
}