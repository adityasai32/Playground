#include<stdio.h>
int main()
{
  int row,col;
  scanf("%d",&row);
  scanf("%d",&col);
  int a[row][col];
  int b[row][col];
  int flag=0;
  int i,j;
  for(i=0;i<row;i++)
  {
    for(j=0;j<col;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }
  for(i=0;i<row;i++)
  {
    for(j=0;j<col;j++)
    {
      scanf("%d",&b[i][j]);
    }
  }
  
  for(i=0;i<row;i++)
  {
    for(j=0;j<col;j++)
    {
      if(a[i][j]!=b[i][j])
        flag=1;
    }
  }
  if(flag==1)
    printf("No");
  else
    printf("Yes");
  return 0;
}