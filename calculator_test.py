import Calculator

def test_can_add_numbers() :
	num1 = 3
	num2 = 5
	assert Calculator.add() == 8
#	assert Calculator.add(-3, -5) == -8
#	assert Calculator.add(3, -5) == -2
#	assert Calculator.add(-3, 5) == 2

def test_can_subtract_numbers() :
	assert Calculator.subtract(5, 3) == 2
	assert Calculator.subtract(-5, -3) == -2
	assert Calculator.subtract(-3, 5) == -8
	assert Calculator.subtract(3, -5) == 8

def test_can_get_product_of_numbers() :
	assert Calculator.product(5, 3) == 15
	assert Calculator.product(5.5, 3) == 16.5

def test_can_get_divide_numbers() :
	assert Calculator.divide(20, 4) == 5

def test_can_get_square_of_number() :
	assert Calculator.square(5) == 25
	assert Calculator.square(4) == 16
	assert Calculator.square(5.5) == 30.25

def test_can_get_square_root() :
	assert Calculator.square_root(25) == 5
	assert Calculator.square_root(49) == 7

def test_can_get_power() :
	assert Calculator.raise_to_power(5, 8) == 390625
	assert Calculator.raise_to_power(9, 3) == 729