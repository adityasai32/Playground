#include<stdio.h>
int main()
{
  //Type your code here
  int a,b,c;
  scanf("%d",&a);
  b=a%10;
  a=(a-b)/10;
  c=a%10;
  printf("%d",c);
  return 0;
}