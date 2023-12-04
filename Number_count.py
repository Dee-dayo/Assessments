noOfPositive = 0
noOfNegative = 0
noOfZero = 0
	
number = eval(input("Enter a number or 1 to end: "))

while (number != 1) :
	if (number > 0) :
		noOfPositive += 1
	elif (number < 0) :
		noOfNegative += 1
	elif (number == 0) :
		noOfZero += 1
	number = eval(input("Enter a number or -0 to end: "))
		
print()
print(f"The number of positive numbers entered is {noOfPositive}")
print(f"The number of negative numbers entered is {noOfNegative}")
print(f"The number of zero numbers entered is {noOfZero}") 
