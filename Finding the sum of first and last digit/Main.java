#include <stdio.h>
int main() {
  
  int n,m;
  int count=0;
  int a,b;
  scanf("%d",&n);
  a=n%10;
  m=n;
  while(m!=0)
  {
    m=m/10;
    count++;
  }
  while(count!=1)
  {
    n=n/10;
    count--;
  }
  printf("%d",a+n);
  return 0;
}