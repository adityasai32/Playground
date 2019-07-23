// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
#include <string.h>
// Main function
int main()
{
  char s[20];
  gets(s);
  int len=strlen(s);
  
  for(char i='a';i<='z';i++)
  {
    int k=0;
    for(int j=0;j<len;j++)
    {
      if(s[j]==i)
        k++;
    }
    if(k!=0){
      printf("%c%d ",i,k);
    }
  }
  
  return 0;
}