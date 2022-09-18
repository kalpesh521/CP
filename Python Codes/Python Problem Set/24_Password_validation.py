import  re
def password():
    passw = "Kalp@123"
    reg = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!#%*?&]{6,20}$"
    
    pat=re.compile(reg)
    res =re.search(pat,passw)

    if res:
        print("Password is valid")
    else:
        print("Password is invalid")

        
password()