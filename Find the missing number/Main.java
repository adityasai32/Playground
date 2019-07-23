#include<stdio.h>
int main()
{
  int n,i,j,flag=0;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++){
    scanf("%d",&a[i]);
  }
  for(i=1;i<=n;i++)
  {
    flag=0;
    for(j=0;j<n;j++)
    {
      if(i==a[j])
        flag=1;
    }
    if(flag==0)
      printf("%d",i);
  }
  return 0;
}