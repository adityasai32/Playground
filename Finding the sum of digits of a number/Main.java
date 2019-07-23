#include <stdio.h>
int main() {
	//Type your code
  int n,sum=0;
  int a;
  scanf("%d",&n);
  while(n!=0)
  {
    a=n%10;
    sum=sum+a;
    n=n/10;
  }
  printf("%d",sum);
	return 0;
}