n = list(input())

n[4:8], n[9:13] = n[9:13], n[4:8]

print("".join(n))