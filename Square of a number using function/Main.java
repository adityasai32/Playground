#include<stdio.h>
int sqr(int n)
{
  int a;
  a=n*n;
  return a;
}
int main() {
  int n;
  int a;
  scanf("%d",&n);
  a=sqr(n);
  printf("%d",a);
  return 0;
}
