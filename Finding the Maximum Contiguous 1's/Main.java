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
    if(a[i]==1)
    {
      count++;
    }
    else
    {
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