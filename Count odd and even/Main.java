#include<stdio.h>
int main()
{
  int n,i,Even,Odd;
  scanf("%d",&n);
  int a[n];
  for(i=1;i<=n;i++)
  {
    scanf("%d",&a[n]);
    for(i=1;i<=n;i++)
    { 
      if(i%2==0)
      {
         Even++;
      }
    else
       Odd++;
    }
  }
  printf("Odd: %d\nEven: %d",Odd,Even);
  return 0;
}