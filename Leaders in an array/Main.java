#include <stdio.h>
int main() 
{
  int n;
  scanf("%d",&n);
  int a[n];
  int i=0,j=0;
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=0;i<n;i++)
  {
    int temp=0;
    for(j=i;j<n;j++)
    {
      if(a[i]<a[j])
        temp=1;
    }
    if(temp==0)
    {
      printf("%d ",a[i]);
    }
  }
  return 0;
}