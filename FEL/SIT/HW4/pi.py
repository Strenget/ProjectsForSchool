import math
def leibnizPi(a):
    k = 1
    p = 0
    znak = 1
    i=0
    while(i<a):
        if znak == 0:
            p = p - 4/k
            k+=2
            znak = 1
        else:
            p = p + 4/k
            k+=2
            znak = 0

        i+=1
    return p

def nilakanthaPi(a):
    p = 3
    if a > 1:
        i = 0
        e = 2
        b = 3
        c = 4
        znak = 1
        while(i < a-1):
            if znak == 1:
                p+= 4 / (e*b*c)
                znak = 0
            else:
                p -= 4 / (e * b * c)
                znak = 1
            e+=2
            b+=2
            c+=2
            i+=1
        return p
    return 3.0

def newtonPi(a):
    i = 1
    a1 = 0
    while(a1!=a):
        a1 = a
        a = a - math.sin(a)/math.cos(a)
        if(a1 == a):
            break
    return a
#
# print(leibnizPi(66666))
# print(nilakanthaPi(66666))
# print(newtonPi(3))