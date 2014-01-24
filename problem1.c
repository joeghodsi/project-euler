#include <stdio.h>

/* The sum of all positive numbers up to n */
int sumToN(int n) {
   return n*(n+1)/2;
}

/* The sum of all positive multiples of x up to n */
int sumMultiplesOfXToN(int x, int n) {
   return x*sumToN(n/x);
}

/* The sum of all positive multiples of x or y up to n */
int sumMultiplesOfXOrYToN(int x, int y, int n) {
   int xSum = sumMultiplesOfXToN(x, n);
   int ySum = sumMultiplesOfXToN(y, n);
   int xySum = sumMultiplesOfXToN(x*y, n);
   
   /* subtract xySum otherwise multiples of both x and y are counted twice. */
   return xSum + ySum - xySum;
}

int main() {
   printf("%d\n", sumMultiplesOfXOrYToN(3, 5, 999));
   
   return 0;
}
