# AlgoUniveristy session dated : 24.07.2025 by manas kumar verma
# L1
# paradigm1
def f(i, n):
    if i > n:
        return
    print(i)
    f(i + 1, n)
   
f(1,5)