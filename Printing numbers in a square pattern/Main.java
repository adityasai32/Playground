#include <stdio.h>
int main(){
  int n;
  int i=1,j=1;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=n;j++)
    {
      printf("%d",i);
    }
    printf("\n");
  }
  return 0;
}