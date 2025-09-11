size = int(input("Enter the size of array : "))
for i in range(size):
    exec(f"Arrays_{i} = input('Enter Element {i}: ')")
    
print("Array = [", end="")
for i in range(size):
    exec(f"print(Arrays_{i}, end=',')")

print("]")


# not an actual program just something i did for fun 
# my goal was to simulate how an array would work in actual setting but this way far this is more like a visualization of it would work but in actuality an array internally is lot more complex