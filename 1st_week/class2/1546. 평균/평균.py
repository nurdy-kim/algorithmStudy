N = input()
arr = list(map(int, input().split()))

maxN = arr[0]

for i in range(len(arr)):
    if arr[i]  > maxN:
        maxN = arr[i]

#print(maxN)

for j in range(len(arr)):
    temp = (arr[j] / maxN)*100
    arr[j] = round(temp, 2)

#print(arr)

newAvg =  sum(arr) / len(arr)
print(newAvg)