passed = 0
failed = 0

for student in range (10) :
	result = int(input('Enter result (1=pass, 2=fail): '))

	if result == 1:
		passed += 1
	else:
		failed += 1

print (f'No of people that passed: {passed}')
print(f'No of people that failed: {failed}')

if passed > 8:
	print('Bonus to instructor')
else:
	print('Please teach them again')