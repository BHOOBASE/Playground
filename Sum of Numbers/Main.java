#include<stdio.h>
int main()
{
  int a;
  int b = 0;
  
  do
  {
    scanf("%d",&a);
    if(a>0)
    b = a+b;
  }
  while(a>0);
    printf("%d",b);
}