#include<stdio.h>
int main()
{
  char a[5];
  scanf("%s",a);
  int i,count=0;
  for(i=0;a[i]!='\0';i++)
  {
  count++;
  } 
  printf("The length of Face is %d",count);
  return 0;
}