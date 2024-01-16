#Molinos, John Naoise L.
#BC1DC

import os

words = ["apple", "guitar", "mountain", "silhouette", "kaleidoscope"]
vowels = "aeiou"
guessed = []

print("Welcome to guess the word!\neach level has 5 tries\nbeat level 5 to win!")


def clearSc():
    try:
        os.system("cls")
    except:
        os.system("clear")


for i in range(len(words)):
    word = ""
    correct = False
    for letter in words[i]:
        if letter in vowels:
            word += "_"
        else:
            word += letter

    tries = 5
    while tries > 0:
        print(f"{'='*5}< Level {i+1} >{'='*5}")
        print(f" word : {word}\n tries left : {tries}")
        ussr = input(f"guess the word: ")
        print("\n"*5)
        clearSc()
        if words[i] == ussr.lower():
            correct = True
            guessed.append(ussr)
            break
        else:
            if tries > 1:
                print("Incorrect! please try again.")
            tries -= 1

    if correct:
        if i != len(words)-1:
            print("Correct! proceed to next level.")

    else:
        break

if len(guessed) == len(words):
    input(f"{'='*5}< You Win! >{'='*5}\nCongratiolations you guessed all {len(words)} words!\npress enter to continue.")
else:
    print(f"{'='*5}< Game Over! >{'='*5}\nbetter luck next time!\nitems guessed:")
    if len(guessed) == 0:
        guessed.append("None :<")
    for i in guessed:
        print(f"   {i}")
    input("press enter to continue.")
    print("\n"*5)