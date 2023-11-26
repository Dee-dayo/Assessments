total = 0
count = 0

num = int(input("Enter an integer (press 0 to finish): "))
while num != 0:
    total += num
    count += 1

    num = int(input("Enter an integer (press 0 to finish): "))

average = total / count

print(f"Sum of the numbers is: {total}")
print(f"Average of the numbers is : {average}")
