N,M = map(int,input().split())
cards = list(map(int,input().split()))

max_sum = 0

for i in range(N):
    for j in range(i+1,N):
        for k in range(j+1,N):
            n_sum = cards[i]+cards[j]+cards[k]

            if ((n_sum >= max_sum) and (n_sum <=M)):
                max_sum = n_sum

print(max_sum)