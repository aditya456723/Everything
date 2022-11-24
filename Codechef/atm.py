
t = int(input())
for x in range(t):
    a,b = map(float,input().split())
    req = a + 0.5
    if (a%5 == 0 and req <= b):
            bal = b - (a+0.5)
            print(bal)
    else:
        print(b)
