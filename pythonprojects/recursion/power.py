

def power(a,b):

    if (b == 0):
        return 1

    if (a == 0):
        return 0

    return a * power(a,b-1)


a = int(input())
b = int(input())

print(power(a,b))
