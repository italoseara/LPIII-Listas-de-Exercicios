from random import randint


def main() -> None:
    dice1: int = randint(1, 6)
    dice2: int = randint(1, 6)
    points: int = dice1 + dice2

    print(f"Dice 1: {dice1}, Dice 2: {dice2}")
    print(f"Points: {points}")

    if points in [7, 11]:
        print("You won!")
        return

    if points in [2, 3, 12]:
        print("You lost.")
        return

    print("Next stage!")

    count: int = 0
    while True:
        count += 1

        dice1 = randint(1, 6)
        dice2 = randint(1, 6)
        sum_: int = dice1 + dice2 # "sum" is the name of a built-in function

        print(f"Dice 1: {dice1}, Dice 2: {dice2}")
        print(f"Play {count}: {sum_}")

        if sum_ == 7:
            print("You lost.")
            return

        if sum_ == points:
            print("You won!")
            return
            

if __name__ == "__main__":
    main()