T = int(input())
while T > 0:
    N = int(input())
    a = list(map(str, input().split()))
    x = 0
    y = 0
    for i in a:
        if i == "LTIME108":
            x += 1
        else:
            y += 1
    print(y, x)
    T -= 1
