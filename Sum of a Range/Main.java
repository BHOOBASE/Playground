#include<stdio.h>
int main()
{
  int i,j;
  int a = 0;
  scanf("%d%d",&i,&j);
  while(i<=j)
  {
    a = a+i;
    i++;
  }
  printf("%d",a);
  return 0;
}