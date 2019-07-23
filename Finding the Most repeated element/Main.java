#include<stdio.h>
int main()
{
  int n,i,j,count=0,max=0,index;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=0;i<n;i++)
  {
    count=0;
    for(j=0;j<n;j++)
    {
      if(a[i]==a[j])
      {
        count++;
      }
    }
    if(count>max)
    {
      max=count;
      index=i;
    }
  }
  printf("%d",a[index]);
  return 0;
}