#include<stdio.h>
int main()
{
  int n,i;
  scanf("%d",&n);
   printf("Enter n value\n");
  for (i=1;i<=n;i++)
  {
    int a=pow(i,i);
    printf("%d",a);
      printf(" ");
  }
  return 0;
}