#include<stdio.h>
int main()
{
  int n;
  int a[n];
  int k;
  int i,j,temp;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d",&k);
  
  for(i=0;i<n;i++)
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
  printf("%d",a[k-1]);
  
  return 0;
}