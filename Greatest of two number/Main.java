#include<stdio.h>
int main()
{
  //Type your code here
  int a,b;
  scanf("%d\n%d",&a,&b);
  if(a>b)
    printf("num1 is the greatest");
  else if(a<b)
    printf("num2 is the greatest");
  else
    printf("Both number Equal");
  return 0;
}