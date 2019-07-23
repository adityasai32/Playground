
#include <stdio.h>
int main() {
  int n;
  int i=0,sum=0;
  scanf("%d",&n);
  for(i=0;i<=n;i++)
  {
    sum=sum+i;
  }
  printf("%d",sum);
  return 0;
}