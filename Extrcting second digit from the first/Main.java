#include <stdio.h>
int main() {
  
  int n,m;
  int count=0;
  scanf("%d",&n);
  m=n;
  while(m!=0)
  {
    m=m/10;
    count++;
  }
  while(count!=2)
  {
    n=n/10;
    count--;
  }
  printf("%d",n%10);
  return 0;
}