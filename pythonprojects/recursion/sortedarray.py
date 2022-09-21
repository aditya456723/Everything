

def sorte(arr):

    n = len(arr)
    if n == 1 or n == 0 :
        return 

    return arr[0] > arr[1] and sorte(arr[1:])

arr = [5,4,3,2,1]
print(sorte(arr))