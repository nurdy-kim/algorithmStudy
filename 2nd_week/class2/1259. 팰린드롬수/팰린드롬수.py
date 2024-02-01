while True:    
    n = str(input())
    
    if int(n) == 0:
        break

    inp = int(n)
    rev = int(n[::-1])

    if inp == rev:
        print('yes')
    else:
        print('no')