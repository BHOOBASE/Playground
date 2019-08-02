#include<stdio.h>
int main()
{
 int a,c=0,i;
 scanf("%d",&a);
 printf("Enter n value\n");
 printf("%d ",c);
 for(i=1;i<a;i++)
 {
  c=c+3;
  printf("%d ",c);
   c=c+i;
   c=i+c;
   }
}