#include<stdio.h>
int prime(int x)
{
  int flag=0;
  for(int i=2;i<x;i++)
  {
    if(x%i==0)
    {
      flag=1;
    }
  }
  if(flag==0)
  {
    printf("%d",x);
    printf("\n");
  }
}
int main(){
  int n;
  scanf("%d",&n);
  for(int i=2;i<=n;i++)
  {
    prime(i);
  }
  return 0;
}