import math
def addition(a,b):
    return a+b
def subtraction(a,b):
    return a-b
def multiplication(a,b):
    return a*b
def division(a,b):
    if b == 0:
        raise ValueError("This operation is not supported for given input parameters")
    # try:
    #     k = a/b
    # except ZeroDivisionError:
    #     k = "This operation is not supported for given input parameters"
    return a/b
def modulo(a,b):
    return a%b
def secondPower(a):
    return a*a
def power(a,b):
    return float(a**b)
def secondRadix(a):
    if(a > 0):
        return math.sqrt(a)
    else:
        return "Chyba"
def magic(x,y,z,k):
    l = x + k
    m = y + z
    if m == 0:
        raise ValueError("This operation is not supported for given input parameters")
    # try:
    #     k = l/m
    # except ZeroDivisionError:
    #     k = "This operation is not supported for given input parameters"
    #     return k
    z = ((l/m) + 1)
    return z
def control(a,x,y,z,k):
    if(a == "ADDITION"):
        return addition(x,y)
    if(a == "SUBTRACTION"):
        return subtraction(x,y)
    if(a == "MULTIPLICATION"):
        return multiplication(x,y)
    if(a == "DIVISION"):
        return division(x,y)
    if(a == "MOD"):
        return modulo(x,y)
    if(a == "POWER"):
        return power(x,y)
    if(a == "SECONDRADIX"):
        return secondRadix(x)
    if(a == "MAGIC"):
        return magic(x,y,z,k)
    return "This operation is not supported for given input parameters"


# print(addition(2,5))
# print(subtraction(7,5))
# print(multiplication(5,6))
# print(division(7,5))
# print(modulo(7,5))
# print(secondPower(5))
# print(power(2,6))
# print(secondRadix(7))
# print(magic(1,2,3,4))
#
# print("FDF")
# print(control("ADDITION",2,3,4,5))
# print(control("SUBTRACTION",2,3,4,5))
# print(control("DIVISION", 1,1,4,5))