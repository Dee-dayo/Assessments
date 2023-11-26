dogName = input("Enter Dog Name: ")
dogAge = int(input("Enter Dog Age: "))

if dogAge <= 2:
    dogYears = dog_age * 10.5
else:
    firstCalDogAge = dogAge - 2
    dogYears = 2 * 10.5 + firstCalDogAge * 4

print(dogName, "age in dog years is", dogYears)
