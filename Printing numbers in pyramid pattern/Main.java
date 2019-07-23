#include <stdio.h>
int main() {
  int n;
  int i,j,m=1;
  int l;
  scanf("%d",&n);
  l=n;
  for(i=1;i<=n;i++)
  {
    for(int k=1;k<l;k++)
    {
      printf(" ");
    }
    l--;
    for(j=1;j<=i;j++)
    {
      printf("%d ",m);
      m++;
    }
    printf("\n");
  }
  return 0;
}