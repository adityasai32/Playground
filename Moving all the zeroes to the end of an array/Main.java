#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);

  int a[n];
  int m[n],i=0;
  int j=0,count=0;
  
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }

  for(i=0;i<n;i++)
  {
    if(a[i]==0)
    {
      count++;
    }
    else
    {
      m[j]=a[i];
      j++;
    }
  }
  for(i=0;i<j;i++)
  {
    printf("%d ",m[i]);
  }
  for(i=0;i<count;i++)
  {
    printf("0 ");
  }
  return 0;
}