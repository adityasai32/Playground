#include<stdio.h>
int main()
{
  int n,a[n];
  int x=0;
  scanf("%d",&n);
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(int i=0;i<n;i++)
  {
    if(a[i]>x)
    {
      x=a[i];
    }
  }
  printf("%d",x);
  return 0;
}