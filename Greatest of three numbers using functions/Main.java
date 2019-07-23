#include <stdio.h>
int grt(int x,int y)
{
  if(x>y)
    return x;
  else if(y>x)
    return y;
  else
    return x;
}
int main(){
  int a,b,c;
  int temp;
  scanf("%d %d %d",&a,&b,&c);
  temp=grt(a,b);
  temp=grt(temp,c);
  printf("%d",temp);
  return 0;
}