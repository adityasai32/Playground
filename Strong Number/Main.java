#include <stdio.h>
int main() {
  int n;
  int m,o,sum=0;
  int no=0;
  int i=1;
  int a=1;
  scanf("%d",&n);
  m=n;
  o=n;
  while(n!=0)
  {
    o=n%10;
    for(i=1;i<=o;i++)
    {
      a=a*i;
    }
    sum=sum+a;
    i=1;
    a=1;
    n=n/10;
  }
  if(sum==m)
    printf("Yes");
  else
    printf("No");
  return 0;
}