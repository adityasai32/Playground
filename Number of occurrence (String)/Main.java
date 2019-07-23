#include<stdio.h>
#include<string.h>
int main()
{
  char s[50],r[20];
  gets(s);
  scanf("%s",r);
  int len1=strlen(s);
  int len2=strlen(r);
  int count=0;
  for(int i=0;i<len1;i++)
  {
    if(s[i]>='a' && s[i]<='z')
    {
      s[i]=s[i]-32;
    }
  }
  for(int i=0;i<len2;i++)
  {
    if(r[i]>='a' && r[i]<='z')
    {
      r[i]=r[i]-32;
    }
  }
  for(int i=0;i<len1;i++)
  {
    int flag=1;
    for(int j=0;j<len2;j++)
    {
      if(r[j]!=s[i+j]){
        flag=0;
        break;
      }
    }
    if(flag==1)
      count++;
  }
  printf("%d ",count);
 
  return 0;
}