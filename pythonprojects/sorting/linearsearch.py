
def linearsearch(arr,a):

    for x in range(len(arr)):
        if arr[x] == a:
            return True
    return False


arr = [1,4,35,65,74,5]
a = 35

if linearsearch(arr,a):
    print("found")
else:
    print("not found")








