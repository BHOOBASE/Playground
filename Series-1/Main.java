#include<stdio.h>
int main()
{
int a,b=7,n;
  scanf("%d",&a);
 printf("%d ",b);
 int flag=0;
 int i=0;
 for(i=0;i<a-1;i++)
 {
   if(flag==0)
   {
     b=b-2;
   flag=1;
   printf("%d ",b);
   }
 else if(flag==1)
 {
   b=b+3;
   flag=0;
    printf("%d ",b);    
 }
 }
}