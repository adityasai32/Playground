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
  int count=0;
  j=0;
  for(count=0;count<col;count++)
  {
    for(i=0;i<row;i++)
    {
      if(j>=i){
        printf("%d ",a[i][j]);
        j++;
      }
    }
    j=count+1;
    row--;
  }
  return 0;
}