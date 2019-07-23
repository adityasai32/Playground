#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n];
  int i=0,j=0;
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  int f;
  scanf("%d",&f);
  
  int temp=0;
  for(i=0;i<n;i++)
  {
    if( f<a[i] && temp==0)
    {
      printf("%d ",f);
      printf("%d ",a[i]);
      temp=1;
    }
    else
    {
      printf("%d ",a[i]);
    }
  }
  if(temp==0)
  {
    printf("%d",f);
  }
  return 0;
}