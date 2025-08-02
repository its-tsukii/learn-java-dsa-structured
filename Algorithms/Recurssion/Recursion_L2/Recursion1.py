#L2
#Recursion1 a**b

def pow(a,b):
    if b == 0:
        return 1
    half = pow(a, b//2)
    if b % 2 == 0:
        return half * half
    else:
        return a * half * half
    
print(pow(2,16))