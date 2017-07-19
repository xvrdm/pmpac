import random
number = random.randint(0, 100) # random btw 0 and 99
guess = 0
while guess != number:
    guess = int(input("Enter your guess?"))
    if guess > number:
        print("Lower!")
    else:
        print("Higher!")
print("Well done!")
