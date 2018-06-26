#include <iostream>
#include <cstdlib>
#include <stdio.h>
#include <ctime>
using namespace std;
int x = 0;
int y=0;
int valor=0;
int vector[0];
void llenado()
{
	srand((unsigned)time(0));
	for(int i=0; i <= x-1; i++)
	{
		vector[i] = 1+(rand() % 100);
	}
}
void burbuja ()
{
	for(int i=1; i < x; i++)
	{
		for( int j=0; j < x-i; j++)
		{
			if (vector[j] > vector[j+1])
			{
				y = vector[j+1];
				vector[j+1] = vector[j];
				vector [j] = y;
			}
		}
	}
}
void Imprimir()
{
		for(int i=0; i <= x-1; i++)
	{
		cout << "\nPosicion del Vector->"<<i<<"= "<<vector[i];
	}
	cout << "\n";
}
void seleccion()
{
	int s;
	for(int i=0; i < x-1 ; i++)
	{
		s = i;
		for(int j=i+1; j < x ; j++)
		{
			if(vector[s] > vector[j])
			s = j;
			y = vector[s];
			vector[s] = vector[i];
			vector[i] = y;
		}
	}
}
int main()
{
	cout << "Capacidad del vector? ";
	cin >> x;
	int vector[x];
	int opcion;
	while(1)
	{
		cout << "\n------ORDENAMIENTO------";
		cout << "\n1.Llenar vector";
		cout << "\n2.Burbuja";
		cout << "\n3.Seleccion Directa";
		cout << "\n4.Salir\n";
		cout << "\nSeleccione una opcion:";
		cin >> opcion;
		
		switch(opcion)
		{
			case 1:
				llenado();
				Imprimir();
				break;
			case 2:
				burbuja();
				Imprimir();
				break;
			case 3:
				seleccion();
				Imprimir();
				break;
			case 4:
				return 0;
			default :
				cout<<"Seleccione una opcion valida...\n";
		}
		system("pause");
		system("cls");
}
}
