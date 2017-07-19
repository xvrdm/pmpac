import re
sentence = input("Please enter a sentence: ")


def translate_word(word):
    if re.match('[aeiou]', word):
        return word + 'way'
    else:
        return word[1:] + word[0] + 'ay'


translated = " ".join(
    [translate_word(word) for word in sentence.split(' ')])

print(translated)
