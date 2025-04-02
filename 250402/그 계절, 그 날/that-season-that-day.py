Y, M, D = map(int, input().split())

# Please write your code here.
def check(Y, M, D):
    cal = {1:31, 3:31, 4:30, 5:31, 6:30, 7:31, 8:31, 9:30, 10:31, 11:30, 12:31}
    
    
    yoon = True

    if (Y % 4 == 0 and Y % 100 != 0) or Y % 400 == 0:
        yoon = True
    else:
        yoon = False

    if Y > 3000 or Y < 1:
        return -1
    if M > 12 or M < 1:
        return -1
    if M == 2:
        if yoon and (D > 29 or D < 1):
            return -1
        if yoon == False and (D > 28 or D < 1):
            return -1
    
    if M != 2 and (D > cal[M] or D < 1):
        return -1
    

    if M >=3 and M<=5:
        return "Spring"
    elif M>=6 and M<=8:
        return "Summer"
    elif M>=9 and M<=11:
        return "Fall"
    else:
        return "Winter"


print(check(Y, M, D))