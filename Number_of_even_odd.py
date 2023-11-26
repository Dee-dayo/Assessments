even_number = 0
odd_number = 0

for num in range(1, 101) :
	if num % 2 == 0:
		even_number += 1
	else :
		odd_number += 1

print ('The number of even numbers is: ', even_number)
print('The number of odd numbers is: ', odd_number)