#include <stdio.h>
#define MAX 100
int main()
{
    int arr[MAX],n,i,j;
    int temp;
    scanf("%d",&n);
    for(i=0;i< n;i++)
    {
        
        scanf("%d",&arr[i]);
    }
     
    //sort array
    for(i=0;i< n;i++)
    {
        for(j=i+1;j< n;j++)
        {
            if(arr[i]>arr[j])
            {
                temp    =arr[i];
                arr[i]  =arr[j];
                arr[j]  =temp;
            }
        }
    }
      printf("Sorted array is:\n");
    for(i=0;i< n;i++)
    {  
        printf("%d\n",arr[i]);
    }
    return 0;
}