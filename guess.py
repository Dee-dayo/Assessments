from random import randint

counter = 1
guess = randint(1, 10)

while counter <= 3 :
	number = int(input("Enter a number: "))

	if number == guess:
		print ("YOU WIN")
		break
	elif number != guess:
		print("Try Again")

	counter += 1
if counter == 3:
	print("YOU LOOSE")

	