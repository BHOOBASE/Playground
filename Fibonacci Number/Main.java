#include<stdio.h>
int main()
{
int a,b,c,v;
scanf("%d", &v);
 a=0;b=1;
 c=a+b;
 while(c<v)
 {
   a=b;
   b=c;
   c=a+b;
 }
 if(c==v)
   printf("Fibonacci Number");
 else
   printf("Not Fibonacci Number");

return 0;
}