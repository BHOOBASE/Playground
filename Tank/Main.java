#include<stdio.h>
int main()
{
  float a,b,c,d;
  scanf("%f%f%f%f",&a,&b,&c,&d);
  float e=3.14*a*a*b;
  float f=c*d;
  if (e<=f)
  {
  printf("The tank can be filled within %.1f hours",d);
  }
  else
   printf("The tank cannot be filled within %.1f hours",d);
}