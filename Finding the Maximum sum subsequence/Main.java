#include<stdio.h>
int main()
{
  int n,i,count=0,sum=0;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=0;i<n;i++)
  {
    if(a[i]<a[i+1] && i<n-1)
    {
      count=count+a[i];
    }
    else
    {
      count=count+a[i];
      if(count>sum)
      {
        sum=count;
      }
      count=0;
    }
  }
  printf("%d",sum);
  return 0;
}