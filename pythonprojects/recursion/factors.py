

def factors(n,i):
    if n ==i:
        return 1

    if n % i == 0:
        print(i)
    factors(n,i+1)


i = 1
n = 50
factors(n,i)