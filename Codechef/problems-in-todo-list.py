t = int(input())
for x in range(t):
    count = 0
    length = int(input())
    ratings = list(map(int, input().split()))
    for rating in ratings:
        if rating >= 1000:
            count += 1

    print(count)