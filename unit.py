unit = int(input('Enter units used: '))

if unit <= 100:
	print('Free of charge')

elif (unit > 100) and (unit < 200) :
		amount = (unit - 100) * 10
		print('You are to pay ', amount)

elif unit > 200 :
		unit = unit - 100
		unit2 = 100 * 10
		unit3 = (unit - 100) * 20
		print('You are to pay', unit2 + unit3)

else :
	print('Try Again')
	