def largest(num) :
	largest = 0
	for i in num :
		if i > largest :
			largest = i
	return largest

print(largest ([54, 29, 50, 20, 40, 31, 8723, 592, 98923]))
