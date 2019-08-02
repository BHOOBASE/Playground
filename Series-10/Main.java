#include<stdio.h>
int main()
{
  int n,i,a=2,b=0;
  scanf("%d",&n);
  printf("Enter n value\n");
  printf("0 ");
  for (i=1;i<n;i++)
  {
    b=a+b;
    printf("%d ",b);
    b=b+i;
    b=i+b;
  } 
}