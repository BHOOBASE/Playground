#include <stdio.h>
 
int main()
{ 
  int array[5], n, i, largest;
  scanf("%d", &n);
  for (i = 0; i < n; i++)
	scanf("%d", &array[i]);
      largest = array[0];
   for (i = 1; i < n; i++) 
        {
		if (largest < array[i])
			largest = array[i];
	}
      printf("%d", largest);
      return 0;
}