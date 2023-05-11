'''Mapping the value of between three element by group 11
    Member :
    1. Mr.xaisana
    2. Mr.thiladeth
    3. Mr.Peter
'''

array = [40, 12, 15]

print("Before swapping:")
print("a[0] =", array[0])
print("a[1] =", array[1])
print("a[2] =", array[2])

temp = array[0]  
array[0] = array[2] 
array[2] = array[1]  
array[1] = temp  

print("After swapping:")
print("a[0] =", array[0])
print("a[1] =", array[1])
print("a[2] =", array[2])