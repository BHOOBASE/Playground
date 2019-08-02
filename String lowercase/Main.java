#include<stdio.h>
int main()
{
  char lower[5],upper[5];
    int i;
  scanf("%s",upper);
 for(i=0;upper[i]!='\0';i++)
 {
   lower[i]=upper[i]+32;
   
 }
  printf("String with lowercase is %s",lower);
  return 0;
  }