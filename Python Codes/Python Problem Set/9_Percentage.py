'''
Sample Input 0

3
Krishna 67 68 69
Arjun 70 98 63
Malika 52 56 60
Malika

Sample Output 0

56.00
'''

if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
    query_name = input()
    s=0
    for i in student_marks[query_name]:
        s=s+i
    print("{0:.2f}".format(s/3)) #Format to two decimal
    
    