'''
Input:
1  x
1  y
1  z
2  n

Output: 
[0,0,0],[0,0,1],[1,0,0],[0,1,0],[1,1,1]
'''


if __name__ == '__main__':
    x = int(input())
    y = int(input())
    z = int(input())
    n = int(input())
    l=list()
    for i in range(x+1):
        for j in range(y+1):
            for k in range(z+1):
                if (i+j+k != n):
                    l.append([i,j,k])
    print(l)