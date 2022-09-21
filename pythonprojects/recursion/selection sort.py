
def selectionsort(x):
    if x == len(arr):
        return 
    mein  =  x 
    for y in range(mein + 1, len(arr)):
        if arr[mein] > arr[y]:
            mein = y
    arr[mein], arr[x] = arr[x] , arr[mein]
    selectionsort(x+1)

arr = [5,4,3,2,1]
x = 0
selectionsort(x)
print(arr)