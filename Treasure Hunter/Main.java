#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  int d=(a*b)/100;
  int e=a-d;
  int f=(e*c)/100;
  int g=e-f;
  int h=g/3;
  printf("%d\n%d\n%d",d,f,h);
}