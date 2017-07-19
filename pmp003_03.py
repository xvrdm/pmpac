sentence = input("Please enter sentence: ")

def translate_char(char):
    if char in "aeiou":
        return "ub-" + char
    else:
        return char


print("".join(map(translate_char, sentence)))
#print("".join([translate_char(char) for char in sentence]))
