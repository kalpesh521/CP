def leap(yr):
    if (yr%100 and yr%400 and yr%4)==0:
        print("leap year")
    else:
        print("Not leap Year")
leap(1993)