no_of_passed = 0
no_of_failed = 0

score = eval(input('Enter a score: '))

while score >= 0 :
	if score > 100 :
		print("You can't score above 100")
	else : 
		if score >= 45  and score <= 100:
			no_of_passed += 1
		else :
			if score >= 0 and score <= 44:
				no_of_failed += 1
	
	if score <= -1:
		print('Ok thanks')

	score = eval(input('Enter another score (negative value to end): '))

print()
print(f'A total of {no_of_passed} students passed')
print(f'A total of {no_of_failed} students failed')




	