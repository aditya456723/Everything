def mergesort(arr):
    if len(arr) > 1:
        mid = len(arr) // 2

        left = arr[:mid]
        right = arr[mid:]

        mergesort(left)
        mergesort(right)

        leftindex = rightindex = sortedarray = 0
        while leftindex < len(left) and rightindex < len(right):
            if left[leftindex] <= right[rightindex]:
                arr[sortedarray] = left[leftindex]
                leftindex += 1
            else:
                arr[sortedarray] = right[rightindex]
                rightindex += 1
            sortedarray += 1

        while leftindex < len(left):
            arr[sortedarray] = left[leftindex]
            leftindex += 1
            sortedarray += 1

        while rightindex < len(right):
            arr[sortedarray] = right[rightindex]
            rightindex += 1
            sortedarray += 1


arr = [5, 4, 3, 2, 1]
mergesort(arr)
print(arr)

