#include<math.h>
#include<stdio.h>
void poww(int x, int y);
int main(){
  int a,b;
  int p;
  scanf("%d",&a);
  scanf("%d",&b);
  poww(a,b);
  return 0;
}
void poww(int x,int y)
{
  int s;
  s=pow(x,y);
  printf("%d",s);
}