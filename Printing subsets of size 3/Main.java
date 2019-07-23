#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n];
  int i,j,k;
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=0;i<n;i++)
  {
    for(j=i+1;j<n;j++)
    {
      for(k=j+1;k<n;k++)
      {
        printf("(%d, %d, %d) ",a[i],a[j],a[k]);
      }
    }
    if(i<n-1)
      printf("\n");
  }
  return 0;
}