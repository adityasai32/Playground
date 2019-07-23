#include<stdio.h>
int main()
{
  int row,col;
  scanf("%d",&row);
  scanf("%d",&col);
  int i,j,a[row][col];
  for(i=0;i<row;i++)
  {
    for(j=0;j<col;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }
  for(i=0;i<col;i++)
  {
    for(j=0;j<row;j++)
    {
      printf("%d ",a[j][i]);
    }
    printf("\n");
  }
  return 0;
}