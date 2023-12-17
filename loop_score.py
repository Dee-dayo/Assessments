total = 0
count = 0
print('Enter -1 to stop top the loop')
score = int(input('Enter scores: '))

while score != -1 :
	total += score
	count += 1
	score = int(input('Enter scores: '))

average = total / count
print(f'The average score is {average:.2f}') 