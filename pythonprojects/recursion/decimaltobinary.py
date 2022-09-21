

def binary(n):

    if n > 1:
        binary(n // 2)
    print( n % 2)

    

binary(2)