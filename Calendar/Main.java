#include<stdio.h>
int main()
{
  int a,b;
  scanf("%d%d",&a,&b);
  if(b%2==0)
  {
  switch(a)
  {
      case(1):
      case(3):
      case(5):
      case(7):
      case(8):
      case(10):
      case(12):printf("Number of days is 31");break;
      case(4):
      case(6):
      case(9):
      case(11):printf("Number of days is 30");break;
      case(2):printf("Number of days is 29");break; 
  }
  }
      else 
      switch(a)
  {
      case(1):
      case(3):
      case(5):
      case(7):
      case(8):
      case(10):
      case(12):printf("Number of days is 31");break;
      case(4):
      case(6):
      case(9):
      case(11):printf("Number of days is 30");break;
      case(2):printf("Number of days is 28");break; 
          return 0;
  }
  
}