def print_multiplication_table(number):
    for i in range(1, 13):
        print(f"{number} x {i} = {number * i}", end="\t")

def draw_multiplication_tables():
    for i in range(1, 13):
        for j in range(1, 13):
            print_multiplication_table(j)
            if j != 12:
                print("\t| ", end="")
        print("\n" + "-" * 100)

if __name__ == "__main__":
    draw_multiplication_tables()
