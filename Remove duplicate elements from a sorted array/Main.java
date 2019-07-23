#include <stdio.h>
int main() 
{
  int n,a[n];
  scanf("%d",&n);
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(int i=0;i<n;i++)
  {
    int temp=0;
    for(int j=0;j<i;j++)
    {
      if(a[i]==a[j])
        temp=1;
    }
    if(temp==0)
    {
      printf("%d ",a[i]);
    }
  }
  return 0;
}