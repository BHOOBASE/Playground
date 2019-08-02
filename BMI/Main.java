#include<stdio.h>
int main()
{
float a,b;
scanf("%f%f",&a,&b);
float c=a/b;
if(c<0.42)
{
printf("You are underweight. Have an apple daily.");
}
else if(c>=1)
{
printf("You are obese. Go to doctor");
}
else
{
printf("You are normal. Go walking daily and maintain it.");
}
}