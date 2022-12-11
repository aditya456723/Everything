t = int(input())
for x in range(t):
    num = int(input())
    sum = num * (num + 1) / 2
    while sum % 2 != 0:
        sum = num*(num+1)/2
        if sum % 2 != 0:
            num -= 1
    print(num)
