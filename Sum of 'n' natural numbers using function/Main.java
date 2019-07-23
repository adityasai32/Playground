#include<stdio.h>
int suum(int n)
{
  int i=1,sum=0;
  for(i=1;i<=n;i++)
  {
    sum = sum + i;
  }
  return sum;
}
int main() {
  int n;
  int sum;
  scanf("%d",&n);
  sum=suum(n);
  printf("%d",sum);
  return 0;
}