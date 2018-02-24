def sortNumbers(weights, condition):

    if(condition == "ASC"):
        return sorted(weights)

    return sorted(weights, reverse=True)

def sortData(weight, data, condition):

    if len(weight) != len(data):
        raise ValueError("Invalid input data")

    d = {weight[i]: data[i] for i in range(len(data))}

    ok = []
    if condition == 'ASC':
        for i in range(len(data)):
            ok.append(sorted(d.items(), key=lambda item: item[0])[i][1])
        return ok
    for j in range(len(data)):
        ok.append(sorted(d.items(), key=lambda item: item[0], reverse=True)[j][1])
    return ok




# print(sortNumbers([4,2,3], 'ASC'))
# print(sortNumbers([4,2,3], 'DESC'))



# print(sortData([2,5,6], ['Ford','BMW','Audi'], 'ASC'))
# print(sortData([3,2,4],['Ford','BMW','Audi'], 'DESC'))