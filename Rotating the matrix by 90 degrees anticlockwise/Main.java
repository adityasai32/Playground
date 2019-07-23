#include<stdio.h>
int main()
{
  int row,col;
  scanf("%d",&row);
  scanf("%d",&col);
  int a[row][col];
  int i,j;
  for(i=0;i<row;i++)
  {
    for(j=0;j<col;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }
  
  for(j=col-1;j>=0;j--)
  {
    for(i=0;i<row;i++)
    {
        printf("%d ",a[i][j]);
    }
    printf("\n");
  }
  return 0;
}