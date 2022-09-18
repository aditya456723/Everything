

def bubblesort(n):
    if n == len(arr):
        return
    for x in range(0,len(arr)-n-1):
        if arr[x] > arr[x+1]:
            arr[x] , arr[x+1] = arr[x+1], arr[x]
    bubblesort(n+1)

arr = [5,9,8,6,3,4,7,2,1]
n = 0
bubblesort(n)
print(arr)