# paradigm3
def recursion(i, j):
    if i <= j:
        print(i, j)
        recursion(i+1, j-1)
    
recursion(1,6)