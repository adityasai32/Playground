#include <stdio.h>
int main() {
  int n;
  int i=1,f=1;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    f=f*i;
  }
  printf("%d",f);
  return 0;
}