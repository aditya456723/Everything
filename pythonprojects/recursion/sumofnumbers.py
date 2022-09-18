
def sumofnumbers(n):
    if n <=1:
        print("Base case")
        return n
    return n + sumofnumbers(n-1)


n = int(input())
print(sumofnumbers(n))