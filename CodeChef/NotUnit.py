import math

no_of_testcases = int(input())

for i in range(no_of_testcases):
    a,b = [int(s) for s in input().split(" ")]

    if(a%2 == 0 and a+2<=b):
        print(a, a+2)
        continue
    
    elif(a%2 == 1):
        if(a+3 <=b):
            if(math.gcd(a, a+3) > 1):
                print(a, a+3)
                continue

            else:
                print(a+1, a+3)
                continue
    
    print(-1)
            



