#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n],b[n],i,j,k;
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  j=0;
  b[j]=a[0];
  for(i=1;i<n;i++)
  {
    if(a[i]>b[j])
    {
      j++;
      b[j]=a[i];
    }
    else
    {
      for(k=0;k<=j;k++)
      {
        b[j+1]=b[j];
      }
      b[j]=a[i];
      j++;
    }
  }
  for(i=0;i<n;i++)
  {
    printf("%d\n",b[i]);
  }
  return 0;
}
