#include<stdio.h>
int main()
{
  int n,c[n];
  int a,b,d,e;
  scanf("%d",&n);
  for(int i=0;i<n;i++)
  {
    scanf("%d",&c[i]);
  }
  scanf("%d %d",&a,&b);
  for(int i=0;i<n;i++)
  {
    if(c[i]==a)
    {
      a=0;
      d=i;
    }
    if(c[i]==b)
    {
      b=0;
      e=i;
    }
  }
  if(a==0)
    printf("%d\n",d);
  else
    printf("-1\n");
  if(b==0)
    printf("%d\n",e);
  else
    printf("-1\n");
  return 0;
}