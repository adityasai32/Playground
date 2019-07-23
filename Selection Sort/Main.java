#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n];
  int i,j,k,temp;
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=0;i<n;i++)
  {
    temp=a[i];
    k=i;
    for(j=i;j<n;j++)
    {
      if(a[j]<temp)
      {
        temp=a[j];
        k=j;
      }
    }
    a[k]=a[i];
    a[i]=temp;
  }
  for(i=0;i<n;i++)
  {
    printf("%d\n",a[i]);
  }
  
    
  return 0;
}