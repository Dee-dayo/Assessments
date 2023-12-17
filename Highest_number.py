def highest_number(a, b, c) :
	if a > b or a > c:
		highest = a
	if b > a or b > c:
		highest = b
	if c > a or c > b:
		highest = c
	return f"The highest number is {highest}"

print(highest_number(23, 49, 4))


def product(a, b) :
	return a * b

print(product(3, 4))