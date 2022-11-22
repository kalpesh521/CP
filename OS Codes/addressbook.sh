createbook(){
	echo
	if [ -e Addressbook.txt ]
	then
		echo "Addressbook already exist "
        else
        	touch Addressbook.txt
        	echo "Addressbook created "
        fi
 }
 
insertbook(){
while true
do
echo "Enter your name"
read record
	if [ "$record" == "q" ]
	then 
		break
	fi
	echo $record >> Addressbook.txt
	echo "Rrecord added sussessfuly"
	break
done
}

displaybook()
{
if [ ! -e Addressbook.txt ]
then 
	echo "Addressbook not  exist"
else
	cat Addressbook.txt
fi
}

deletebook()
{
	echo "Enter data for search " 
	read data 
	if [ -f Addressbook.txt ]
	then
	sed -i "/$data/d" Addressbook.txt 
	sed -i "/^[[:space:]]*$/d" Addressbook.txt
	echo "deleted successfully"
	else
	echo "file Not found"
	fi
}
modifybook(){
echo "Enter data to search "
read actual
result=$(grep -i "$actual" Addressbook.txt)
if [ $result ]
then
	echo "Enter you want to modify"
	read modified
	sed -i "s/$actual/$modified/" Addressbook.txt
	echo "record found successfully"
	else 
	echo "record not found"
	fi

}
 while true 
 do
 echo -e "\n"
 echo "============================"
 echo "Welcome to Menu"
 echo "1.Create Book"
 echo "2.insert Book"
 echo "3.Display book"
 echo "4.Search record"
 echo "5.Delete Record"
 echo "6.Modify record"
 echo "============================"
 echo -e "\n"
 echo "Enter Your Choice"
 read ch
 
 	case $ch in 
 	1)createbook;;
 	2)insertbook;;
 	3)displaybook;;
 	4)deletebook;;
 	5)modifybook;;
 	6)exit;;
 	esac
 done
 
