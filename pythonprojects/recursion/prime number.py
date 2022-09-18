
def primenumber(n,i = 2):
    if i ==1: return True
    if  n % i == 0: return False
    primenumber(n,i+1)

n = 2
if primenumber(n):
    print("prime number")
else:
    print("NOT prime number ")




