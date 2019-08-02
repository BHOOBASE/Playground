#include<stdio.h>
int main()
{
  int a=10,b=5,n,i,flag=0;
 scanf("%d",&n);
  printf("Enter n value\n");
  for(i=0;i<n;i++)
  {
   if(flag==0)
   {
     printf("%d ",a);
     a+=50;
     flag=1;
   }
    else if(flag==1)
    {
      printf("%d ",b);
        b+=10;
      flag=0;
    }
    
  }
  return 0;

}