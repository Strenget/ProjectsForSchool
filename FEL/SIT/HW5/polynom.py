def polyEval(a,b):
    return a[b]

def polySum(a,b):
    rezult = []
    if(len(a)<len(b)):
        i = 0

        while(i < len(b)):
            if( i < len(a)):
                rezult.append(a[i]+b[i])
            else:
                rezult.append(b[i])
            i+=1
    else:
        i = 0
        while (i < len(a)):
            if (i < len(b)):
                rezult.append(a[i] + b[i])
            else:
                rezult.append(a[i])
            i+=1
    return rezult

def polyMultiply(a,b):
    i = 0
    polynom = []
    while(i < len(a)+len(b) - 1):
        polynom.append(0)
        i+=1
    i = 0
    while(i < len(a)):
        j = 0
        polynom_X = []
        l = 0
        while (l < len(a) + len(b) - 1):
            polynom_X.append(0)
            l += 1
        while(j < len(b)):
            polynom_X.insert(i+j,a[i]*b[j])
            j+=1
        k = 0
        while(k < len(a)+len(b) - 1):
            polynom[k] = polynom[k] + polynom_X[k]
            k+=1
        i+=1
    return polynom
# print(polyEval([1,5,6],0))
# print(polySum([1,2,5],[2,0,1,-7]))
# print(polyMultiply([1,2,5],[2,0,1,-7]))

