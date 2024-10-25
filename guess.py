import random as r

print("Welcome, To the Guessing game with none other your friend computer")
print("Pick any value from 0 to 10")
comp = r.randint(0,10)
user = int(input("Enter your Guessing value: "))
print(f"\nComputer picked value: {comp}\nYour picked value: {user}")

if(comp == user):
    print("You win!!!!!! :)")
else:
    print("You lose :(")