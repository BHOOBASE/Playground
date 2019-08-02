#include<stdio.h>
int main()
{
  int n,i,a=5,b=1;
  scanf("%d",&n);
  printf("Enter n value\n");
  while(i<n)
  {
    a=a+b;
    printf("%d ",a);i++;
    b=b+2;
  }
 }