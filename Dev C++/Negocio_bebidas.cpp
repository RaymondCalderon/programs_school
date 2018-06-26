#include "iostream"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <conio.h>
using namespace std;
void productos()
{
	int refre,cafe, te;
	int bolsa=1, polvo=2,hielo=1.5;
	printf("Productos: ");
	scanf("%i %i %i", &refre,&cafe,&te);
	printf("los precios son: %i %i %i respectivamente\n", refre,cafe,te);
}
void ventas()
{
	string vendido;
	cout<<"ingrese los caracteres: ";
	cin >> vendido;
	cout<< vendido;
	/*printf("Productos: ");
	scanf("%c %c %c", &R, &C, &T);
	printf("los precios son: %c %c %c  respectivamente\n\n", R,C,T);
	cout<< C;
	cout<< C;
	cout<< C;*/
}
int main(){
  productos();
  ventas();
  
  return 0;
}

