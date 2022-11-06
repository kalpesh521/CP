#include <stdio.h>
#include <fcntl.h>
#include <stdlib.h>
#include <string.h>
#include <fcntl.h>  // for open
#include <unistd.h> // for close
#include <sys/types.h>
#include <string.h>
#include <sys/stat.h>
// sender

int main()
{

    int res, n;
    char buffer[100];
    res = mkfifo("fifo1", 0666);
    char str1[100];
    printf("fifo1 created\n");
    printf("Enter string to write :");
    fgets(str1, 100, stdin);
    res = open("fifo1", O_RDWR);
    write(res, str1, 100);

    res = open("fifo2", O_RDWR);
    read(res, buffer, 100);
    printf("printing data received from fifo2 %s\n", buffer);

    return 0;
}

#include <stdio.h>
#include <fcntl.h>
#include <stdlib.h>
#include <string.h>
#include <fcntl.h>  // for open
#include <unistd.h> // for close
#include <sys/types.h>
#include <sys/stat.h>
#include <string.h>
// sender

int count_char(char *str)
{
    int i = 0, space = 0;
    while (str[i] != '\0')
    {
        if (str[i] != ' ' && str[i] != '\n')
        {
            space++;
        }
        i++;
    }
    return space;
}

int count_word(char *str)
{
    int i, wrd;
    i = 0;
    wrd = 0;
    while (str[i] != '\0')
    {
        if (str[i] == ' ' || str[i] == '\n' || str[i] == 't')
        {
            wrd++;
        }
        i++;
    }
    return (wrd);
}

int count_lines(char *str)
{
    int i = 0, lines = 0;
    while (str[i] != '\0')
    {
        if (str[i] == '\n')
        {
            lines++;
        }
        i++;
    }
    return lines;
}

char *int_to_string(int num)
{
    char *str = (char *)malloc(10);
    sprintf(str, "%d", num);
    return str;
}

int main()
{

    int res, n, ct1, ct2, res2, ct3;
    char buffer[100];
    char str[100];
    FILE *file;
    char *tt1, *tt2, *tt3;
    char cha[50] = "character are: ";
    char words[50] = " and words are ";
    char lines[50] = " lines are :";
    res = mkfifo("fifo2", 0666);
    printf("fifo2 created\n");
    res = open("fifo1", O_RDWR);
    read(res, buffer, 100);
    ct1 = count_char(buffer);
    ct2 = count_word(buffer);
    ct3 = count_lines(buffer);

    res2 = open("fifo2", O_RDWR);
    // write(res2,"KILLO",20);

    // strcat(cha,words);
    tt1 = int_to_string(ct1);
    tt2 = int_to_string(ct2);
    tt3 = int_to_string(ct3);
    strcat(cha, tt1);
    strcat(cha, words);
    strcat(cha, tt2);
    strcat(cha, lines);
    strcat(cha, tt3);
    write(res2, cha, 100);
    // write(res2,tt2,100);
    return 0;
}
