#include<stdio.h>
#include<math.h>
int main()
{
 int n,a=1,i;
  scanf("%d",&n);
  printf("Enter n value%d ",a);
  for(i=2;i<=n;i++)
  {
      if (i%2==0)
    {
      int x=i*i;
      printf ("%d",x);
      printf(" ");
    }
    else
    {
      int y=i*i*i;
      printf("%d",y);
      printf(" ");
    }
  } 
  return 0;
}