
t = int(input())
for x in range(t):
    n = input().lower()
    if n == "b":
        print("BattleShip")
    elif n == "c":
        print("Cruiser")
    elif n == "d":
        print("Destroyer")
    elif n == "f":
        print("Frigate")
