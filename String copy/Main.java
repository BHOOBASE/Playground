#include <stdio.h>
int main()
{
    char s1[6], s2[6], i;
    scanf("%s",s1);
    for(i = 0; s1[i] != '\0';i++)
    {
        s2[i] = s1[i];
    }
    printf("The copied string is %s.", s2);
    return 0;
}