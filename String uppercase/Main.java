#include<stdio.h>
int main()
{
  char lower[5],upper[5];
    int i;
  scanf("%s",lower);
 for(i=0;lower[i]!='\0';i++)
 {
   upper[i]=lower[i]-32;
   
 }
  printf("String in uppercase is %s",upper);
  return 0;
  }