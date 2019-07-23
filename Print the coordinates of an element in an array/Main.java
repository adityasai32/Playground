#include<stdio.h>
int main()
{
  int n1,n2;
  scanf("%d%d",&n1,&n2);
  int a[n1][n2];
  int i,j,k;
  for(i=0;i<n1;i++)
  {
    for(j=0;j<n2;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }
  int f;
  scanf("%d",&f);
  int temp=0;
  for(i=0;i<n1;i++)
  {
    for(j=0;j<n2;j++)
    {
      if(f==a[i][j])
      {
        printf("(%d, %d)",i,j);
        temp=1;
        break;
      } 
    }
  }
  if(temp==0)
  {
    printf("(-1, -1)");
  }
  return 0;
}