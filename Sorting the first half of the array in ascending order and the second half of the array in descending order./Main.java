#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int i,j,temp,a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=0;i<n/2;i++)
  {
    for(j=i;j<n/2;j++)
    {
      if(a[i]>a[j])
      {
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }
    }
  }
  for(i=n/2;i<n;i++)
  {
    for(j=i;j<n;j++)
    {
      if(a[i]<a[j])
      {
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }
    }
  }
  for(i=0;i<n;i++)
    printf("%d ",a[i]);
  return 0;
}