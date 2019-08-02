#include<stdio.h>
int top=-1;
int n,i;
int a[5];
  void push();
  void pop();
  void display();
int main()
{ 
 
  printf("Enter the maximum size of the stack\n");
  scanf("%d",&n);
 //a[n]=a[5];
  int choice=1;
  while(choice==1 || choice==2 || choice==3)
  {
    printf("Choice 1 : Push\n");
  printf("Choice 2 : Pop\n");
  printf("Choice 3 : Display\n");
  printf("Any other choice : Exit\n");
    printf("Enter your choice\n");
  scanf("%d",&choice);
    
    switch(choice)
    {
      case 1 : push();break;
      case 2 : pop();break;
      case 3 : display();
      
    }
  }}
  void push()
  {
  int b ;
    scanf("%d",&b);
    printf("Enter the element to be pushed\n");
    
    if(top>=n-1)
    {
    printf("Stack is full\n");
    }
    else
    {
    top++;
      a[top]=b;
    }
  }

  void display()
  { printf("The contents of the stack are ");
   if(top==-1){
   printf("{}\n");
   }
   else{
    for(i=0;i<=top;i++)
     {
     
    printf("%d ",a[i]);
    }
   printf("\n");}
}
void pop()
{ 
  if(top==-1)
{
printf ("Stack is empty\n");
}
 
  else
  {
    printf("The popped element is %d\n",a[top]);
    top--;
  }
}