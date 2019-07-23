#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n];
  int i,j,k,count;
  int temp;
  scanf("%d",&k);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  
  for(i=1;i<=k;i++)
  {
    count=0;
    for(j=0;j<n;j++)
    {
      if(i==a[j])
      {
        count++;
      }
    }
    printf("%d %d\n",i,count);
  }
  return 0;
}