#include<stdio.h>
#include<string.h>
int  Rotation_check(char *str1, char *str2)
{
  int flag,temp;
  int len1=strlen(str1);
  int len2=strlen(str2);
  for(int i=0;i<len1;i++)
  {
    flag=0;
    temp=str2[0];
    for(int j=0;j<len2;j++)
    {
      str2[j]=str2[j+1];
    }
    str2[len2-1]=temp;
    if(strcmp(str1,str2)==0)
    {
      printf("Yes");
      flag=1;
      return 0;
    }
  }
  return 1;
}
int main()
{
  char st1[20], st2[20];
  gets(st1);
  gets(st2);
  int x=Rotation_check(st1,st2);
  if(x!=0)
    printf("No");
  return 0;
}