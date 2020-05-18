num = int(input(("Enter four digit number: ")))
if(num >999 & num < 10000):
    first = int(num / 1000)
    num = int(num % 1000)
    second = int(num / 100)
    num = int(num % 100)
    third = int(num / 10)
    num = int(num % 10)
    fourth = num
    if(first + fourth == second + third):
        print("Sum of first and fourth and sum of second and third is same")
    
    else:
        print("Sum of first and fourth and sum of second and third is not same")
    
else:
    print("Enter number greather than 999 and less than 10000")
