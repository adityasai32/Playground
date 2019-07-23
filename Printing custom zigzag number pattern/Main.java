#include <stdio.h>
int main() {
  int n;
  scanf("%d",&n);
  int i,j,k;
  for(i=1;i<=n;i++)
  {
    if(i%2==0)
    {
      for(j=1;j<=n;j++)
      {
        if(j==1)
          printf("%d",i+1);
        else
          printf("%d",i);
      }
    }
    else
    {
      for(j=1;j<=n;j++)
      {
        if(j==n)
          printf("%d",i+1);
        else
          printf("%d",i);
      }
    }
    printf("\n");
  }
  return 0;
}