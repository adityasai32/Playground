#include<stdio.h>
int main()
{
    int n;
  int l=1;
  scanf("%d",&n);
    for(int i = 1; i <= n; i++)
       {
          for(int k = 1; k <= (n- i ); k++)
               {
    		     printf(" ");
		       }
          for(int j = 1; j <= l; j++)
               {
    		     printf("*");
    		   }  
          printf("\n");
      l=l+2;
	    }
   
    return 0;
}