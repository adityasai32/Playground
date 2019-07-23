#include <stdio.h>
int main() 
{
  int n1,n2;
  scanf("%d%d",&n1,&n2);
  int a[n1],b[n2];
  int c[n1+n2];
  int i=0,j=0,k=0;
  for(i=0;i<n1;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=0;i<n2;i++)
  {
    scanf("%d",&b[i]);
  }
  for(i=0;i<n1;i++)
  {
    c[i]=a[i];
  }
  for(j=0;j<n2;j++)
  {
    c[i]=b[j];
    i++;
  }
  for(i=0;i<n1+n2;i++)
  {
    for(j=i;j<n1+n2;j++)
    {
      if(c[i]>c[j])
      {
        k=c[j];
        c[j]=c[i];
        c[i]=k;
      }
    }
  }
  for(i=0;i<n1+n2;i++)
  {
    printf("%d ",c[i]);
  }
  return 0;
}
