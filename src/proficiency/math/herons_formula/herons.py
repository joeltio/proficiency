# Python 3
import sys
import math

def semiperimeter(a, b, c):
    return (a + b + c)/2

def area_of_triangle(a, b, c):
    s = semiperimeter(a, b, c)
    return math.sqrt(s * (s - a) * (s - b) * (s - c))

a, b, c = [int(x) for x in sys.argv[1:]]
print(area_of_triangle(a, b, c))
