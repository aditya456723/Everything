
def insertionsort(n):
    if n == len(arr):
        return

    key = arr[n]
    y = n -1 
    while y >=0 and key < arr[y]:
        arr[y+1] = arr[y]
        y -=1
    arr[y+1] = key
    insertionsort(n+1)

arr = [9,98,5,6,3,7,4]
n = 0
insertionsort(n)
print(arr)