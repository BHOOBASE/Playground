#include<stdio.h>
int main()
{
  int n,i,j;
  scanf("%d",&n);
  int m=n;
  int a[n][m];
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
    scanf("%d",&a[i][j]);
    }
  }
    for(i=0;i<n;i++)
    {
      for(j=0;j<m;j++)
      {
        printf("%d ",a[i][j]);
      }printf("\n");
    } 
  printf("Transpose matrix is :\n");
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
   {
        printf("%d ",a[j][i]);
      }printf("\n");
  }
}