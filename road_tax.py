amount = int(input('Enter the price of your car: '))

if amount < 1_000_000 :
	print(f'You are to pay #{amount * 0.1} road tax')

elif (amount >= 1_000_000) and (amount < 3_000_000) :
	print(f'You are to pay #{amount * 0.15} road tax')

elif (amount >= 3_000_000) and (amount < 5_000_000) :
	print(f'You are to pay #{amount * 0.2} road tax')

else:
	amount >= 5_000_000 
	print(f'You are pay #{amount * 0.25} road tax') 