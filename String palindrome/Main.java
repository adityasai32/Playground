#include<stdio.h>
#include<string.h>
int main()
{
  char s[20],r[20];
  int i,j;
  gets(s);
  int l1=strlen(s);
  j=l1-1;
  for(i=0;i<l1;i++)
  {
    r[j]=s[i];
    j--;
  }
  if(strcmp(r,s)==0)
  {
    printf("%s is a palindrome",s);
  }
  else
    printf("%s is not a palindrome",s);
    
  return 0;
}