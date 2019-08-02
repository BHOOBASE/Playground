#include<stdio.h>
int main()
{
  int n,i,b=1;
  scanf("%d",&n);
  for(i=n;i>=1;i--)
  {
  b=b*i;
  }
  printf("%d",b);
 }