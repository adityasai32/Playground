#include<string.h>
#include<stdio.h>
int main()
{
  char s[100];
  gets(s);
  int n,i,j,offset;  
  scanf("%d",&n);
  int len=strlen(s);
  for(i=0;i<len;i++)
  {
    if(s[i]>='A'&&s[i]<='Z')
    {
      offset=n%26;
      s[i]=s[i]-offset;
      if(s[i]<'A')
        s[i]='Z'-('A'-s[i])+1;
      
    }
    if(s[i]>='a'&&s[i]<='z')
    {
      offset=n%26;
      s[i]=s[i]-offset;
      if(s[i]<'a')
        s[i]='z'-('a'-s[i])+1;
    }
  }
  printf("%s",s);
  return 0;
}