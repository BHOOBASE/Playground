#include<stdio.h>
int main()
{
  int n,m;
  scanf("%d%d",&n,&m);
  int a[n],b[m],i,c=0,d=0 ;
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
    c=c+a[i];
  }
    for(i=0;i<m;i++)
    { 
      scanf("%d",&b[i]);
      d=d+b[i];
    }
   if(c==d)
   {
     printf("Same");
   }
  else
    printf("Not Same");
}