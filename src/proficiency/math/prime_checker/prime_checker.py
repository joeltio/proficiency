import sys
import math

def prime_checker(n):
    if n < 2:
        return False
    elif n == 2:
        return True
    elif n % 2 == 0:
        return False
    else:
        for i in range(3, int(math.sqrt(n)), 2):
            if n % i == 0:
                return False
        else:
            return True

print(prime_checker(int(sys.argv[1])))
