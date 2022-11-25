t = int(input())
for x in range(t):
    city = int(input())
    prices_list = list(map(int,input().split()))
    c = 0
    for y in prices_list:
        if prices_list.count(y) > 2:
            c = 1
            break
    if c == 1:
        print("NO")
    else:
        print("YES")