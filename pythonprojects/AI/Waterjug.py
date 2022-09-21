
def waterjug(a,b):
     print("Give intial capacities of jugs")
     if a > 4 and b > 3:
         print("a should not be greater than 4 or b should not be greater than 2")
     else:
         while a != 2:
             a = int(input())
             b = int(input())
             print("values are :",a ,b)
             if a > 4 and b > 3 :
                 print("enter correct input")
             else:
                print("water quantity in jugs in gallons " "(",a,b,")")


waterjug(4,3)

