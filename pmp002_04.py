hex_number = input(
    "Please enter an hex number? ")

print('hex {} is {}'.format(
    hex_number, int('0x{}'.format(hex_number), 0)))
