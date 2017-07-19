import re
word = input("Please enter a word: ")

#if word[0] in 'aeiou':
if re.match('[aeiou]', word):
    print(word + 'way')
else:
    print(word[1:] + word[0] + 'ay')
