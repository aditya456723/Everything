
def binary(arr,x,low,high):

    if low > high:
        return

    else:
        mid = (low + high) // 2

        if x == arr[mid]:
            return mid
        elif x > arr[mid]:
                return binary(arr,x,mid+1,high)
        elif x < arr[mid]:
                return binary(arr,x,low,mid)


arr = [1,2,3,4,5]
print(binary(arr,4,0,4))
