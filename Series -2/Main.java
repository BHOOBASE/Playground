#include<stdio.h>
int main()
{
  int a=1,b=2,c,n,i;
  scanf("%d",&n);
  {
    printf("Enter n value\n");
  printf("%d %d ",a,b);
  }
    for(i=1;i<=n-2;i++)
    {
    c=a+b;
      printf("%d ",c);
      a=b;
      b=c;
    }
     return 0; 
  
}