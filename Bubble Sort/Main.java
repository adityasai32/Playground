#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n];
  int i,j,temp;
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=n-1;i>=0;i--)
  {
    for(j=0;j<i;j++)
    {
      if(a[j]>a[j+1])
      {
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }
    }
  }
  for(i=0;i<n;i++)
  {
    printf("%d\n",a[i]);
  }
  
    
  return 0;
}