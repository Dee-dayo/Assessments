print('Welcome to NOKIA')
print ("1. Phone Book \n2. Messages\n3. Chat\n4. Call Register\n5. Tones\n6. Settings\n7. Call Divert\n8. Games\n9. Calclator\n10. Reminders\n11. Clock\n12. Profiles\n13. SIM Services\n\nor press'0' to end app: ")
menu = int(input())

while (menu != 0) :
	while (menu == 1) :
		print("\nPHONEBOOK")
		print("1. Search\n2. Service Nos\n3. Add Name\n4. Erase\n5. Edit\n6. Assign Tone\n7. Send b'card\n8. Options\n9. Speed Dials\n10. Voice Tag")
		phonebook = int(input())
			
		if (phonebook == 1) :
			print("\nOutput") 	
		elif (phonebook == 2) :
			print("\nThis are service numbers\n777 or 112")
		elif (phonebook == 3) :
			print("\nType full name and phone number") 
		elif (phonebook == 4) :
			print("\nWhich contact do you want to erase?")
		elif (phonebook == 5) :
			print("\nEdit a contact") 
		elif (phonebook == 6) :
			print("\nAssign a tone to a contact") 
		elif (phonebook == 7) :
			print("\nSelect contact you want to send business card") 
		elif (phonebook == 8) :
			print("\nOptions\n1. Type of view\n2. Memory status")
		elif (phonebook == 9) :
			print("\nCreate speed dials for favourite contacts") 
		elif (phonebook == 10) :
			print("\nAdd voice tags to contacts")
		
		print("\nPress any number to go to previous menu: ")
		phonebook = int(input())
		
	if (menu == 2) :
		print("\nMESSAGES")
		print("1. Write messages\n2. Inbox\n3. Outbox\n4. Picture messages\n5. Templates\n6. Smiles\n7. Messasge settings\n8. Info service\n9. Voice mailbox number\n10. Service command editor\n")
		messages = int(input())
			
		if (messages == 1) :
			print("\nOya start writing your message")	
		elif (messages == 2) :
			print("\nYou have 50 unread messages but none is credit alert")
		elif (messages == 3) :
			print("\nThis are outgoing messages but it's empty") 
		elif (messages == 4) :
			print("\nNa this small phone u wan use send picture message?") 
		elif (messages == 5) :
			print("\nNo template here, getout abeg") 
		elif (messages == 6) :
			print("\nSmile Jesus love's you")
		elif (messages == 7) :
			print("\nMESSAGE SETTINGS\n1. Set\n2. Common\n")
			messageSettings = int(input())
			if (messageSettings == 1) :
				print("\nMESSAGE SETTINGS/SET\n1. Message centre number\n2. Messages sent as\n3. Message validity")
			elif (messageSettings == 2) :
				print("\nMESSAGE SETTINGS/COMMON\n1. Delivery reports\n2. Reply via same centre\n3. Character support")
		elif (messages == 8) :
			print("\nMessage Centre number\n878934610982690934")
		elif (messages == 9) :
			print("\nVoice mail number 398712876132-4238712")
		elif (messages == 10) :
			print("\nWhich service u wn edit, abegiii")

		print("\nPress any number to go to previous menu: ")
		messages =int(input())
		
	if (menu == 3) :
		print("\nCHAT")
		print("This phone is too small na, no Chat app, thank you.")

	if (menu == 4) :
		print("\nCALL REGISTER")
		print("1. Missed calls\n2. Received calls\n3. Dialed numbers\n4. Erase recent call lists\n5. Show call duration\n6. Show call costs\n7. Call cost settings\n8. Prepaid credit\n")
		callRegister = int(input()) 
			
		if (callRegister == 1) :
			print("\nYou missed 1,734 calls from Palmpay") 
		elif (callRegister == 2) :
			print("\nYou dy pick call?? You wey dy owe debt") 
		elif (callRegister == 3) :
			print("\nYou tried to call your babe, but sorry, u dnt have one") 
		elif (callRegister == 4) :
			print("\nYou wan erase call lists? You dy cheat??") 
		elif (callRegister == 5) :
			print("\nCALL DURATION\n1. Last call duration\n2. All calls'duration\n3. Received calls' duration\n4. Dialed calls' duration\n5. Clear timers") 
		elif (callRegister == 6) :
			print("\nCALL COST\n1. Last call cost\n2. All calls's cost\n3. Clear counters") 
		elif (callRegister == 7) :
			print("\nCOST SETTINGS\n1. Call cost limit\n2. Show caosts in") 
		elif (callRegister == 8) :
			print("\nI don't understand what this mean actually")

		print("\nPress any number to go to previous menu: ")
		callRegister = int(input())

	if (menu == 5) :
		print("\nTONES")
		print("1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tone\n6. Keypad tones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver")

	if (menu == 6 ) :
		print("\nSETTINGS")
		print("1. Call settings\n2. Phone settings\n3. Security settings\n4. Restore factory settings\n")
		settings = int(input())
			
		if (settings == 1) :
			print("\nCALL SETTINGS\n1. Automobile redial\n2. Speed dialing\n3. Call waiting options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer") 
		elif (settings == 2) :
			print("\nPHONE SETTINGS\n1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service actions") 	
		elif (settings == 3) :
			print("\nSECURITY SETTINGS\n1. PIN code request\n2. Call barring service\n3. Fixed dialling\n4. Closed user group\n5. Phone security\n6. Change access codes") 
		elif (settings == 4) :
			print("You wan restore phone wey u no get anything inside???")

		print("\nPress any number to go to previous menu: ")
		settings = int(input()) ;
		

	if (menu == 7) :
		print("\nCALL DIVERT")
		print("Because you are owing Palmpay, you wan dy divert call abi??? Debtor")

	if (menu == 8) :
		print("\nGAMES")
		print("You are supposed to be learning a skill or find something to fetch money, not playing game")

	if (menu == 9) :
		print("\nCALCULATOR")
		print("The calculator is not function yet, please come back later")
	
	if (menu == 10) :
		print("\nREMINDERS")
		print("Here is to remind you that you are still owing Palmpay, you can't run forever")

	if (menu == 11) :
		print("\nCLOCK")
		print("1. Alarm Cloc\n2. Clock settings\n3. Date setting\n4. Stopwatch\n5. Countdown timer\n6. Auto update of date and time")

	if (menu == 12) :
		print("\nPROFILES")
		print("No profile available now, try again later")

	if (menu == 13) :
		print("\nSIM SERVICES") 
		print("'No sim detected'") 
	
	print("\n\nPress 0 to end the app: ")
	menu = int(input())

	