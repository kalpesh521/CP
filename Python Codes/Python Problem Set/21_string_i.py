def paper_doll(str): 
    k=""
    for i in str:
        k+=i*3
    return k
print(paper_doll('Hello'))

def paper(instr):
    return ".join"([i*3 for i in instr])
print(paper("Hello"))