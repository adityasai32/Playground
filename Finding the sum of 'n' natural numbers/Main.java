#include<stdio.h>

int fact(int n)
{
  while(n>0)
  {
    return n+fact(n-1);
  }
  return 0;
}

int main()
{
  int n;
  scanf("%d",&n);
  int x=fact(n);
  printf("%d",x);
  return 0;
}
