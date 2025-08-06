#Paradigm2   
def f1(i, n): 
    if i > n:
        return
    f1(i + 1, n)
    print(i)

f1(1,5)