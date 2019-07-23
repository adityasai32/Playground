#include <stdio.h>
int main() {
  int n;
  int i=0,j=1;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    printf("%d\n",j);
    j=j+2;
  }
  return 0;
}