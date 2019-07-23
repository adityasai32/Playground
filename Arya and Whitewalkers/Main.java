#include <stdio.h>
int main() {
  int n;
  scanf("%d",&n);
  int i=0;
  while(n!=0)
  {
    if(n%2==1)
    {
      i++;
    }
    n=n/2;
  }
  printf("%d",i);
  return 0;
}