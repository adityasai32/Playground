#include <stdio.h>
#include <math.h>
int main() {
  int n;
  int sum=0;
  int a,m,o,no=0;
  scanf("%d",&n);
  m=n;
  o=n;
  while(m!=0)
  {
    m=m/10;
    no++;
  }
  while(n!=0)
  {
    a=n%10;
    sum=sum+pow(a,no);
    n=n/10;
  }
  if(sum==o)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
  return 0;
}