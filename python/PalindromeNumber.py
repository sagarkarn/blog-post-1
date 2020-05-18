num = int(input("Enter number > "))
sum = 0
temp = num
while(num > 0):
    r = int(num % 10)
    sum = (sum * 10) + r
    num = int(num/10)
if(temp == sum):
    print("Palindrome number")
else:
    print("not palindrome number")
        