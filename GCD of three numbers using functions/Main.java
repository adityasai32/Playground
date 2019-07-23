int grt(int x,int y)
{
  int min;
  int ans;
  if(x>y)
    min=y;
  else if(y>x)
    min=x;
  else
    min=x;
  for(int i=1;i<=min;i++)
  {
    if(x%i==0&&y%i==0)
      ans=i;
  }
  return ans;
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