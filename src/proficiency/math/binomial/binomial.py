# Python 3
import sys

def factorial(n):
    x = 1
    for i in range(1, n+1):
        x *= i
    return x

def choose(n, k):
    return factorial(n)/(factorial(k) * factorial(n-k))

def binomial(n):
    values = []
    for k in range(n+1):
        coefficient = int(choose(n, k))
        a_exponent = n-k
        b_exponent = k

        value = "{}a^{}b^{}".format(coefficient, a_exponent, b_exponent)
        values.append(value)
    return " + ".join(values)

print(binomial(int(sys.argv[1])))
