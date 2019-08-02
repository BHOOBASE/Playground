#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n],i,b=0;
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
    b=b+a[i];
  } printf("%d",b);
}
