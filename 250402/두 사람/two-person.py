a = list(input().split(" "))
b = list(input().split(" "))


if (int(a[0]) >= 19 and a[1] == "M") or (int(b[0]) >= 19 and b[1] == "M"):
    print(1)
else: print(0)