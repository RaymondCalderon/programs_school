#include "iostream"
//#include <conio.h>			
#include <stdio.h>

using namespace std;
int x = 0;
void Apilar (int *pila,int dato,int& tope)
{
	if(tope==x)
	{
		cout << "\nLA PILA ESTA LLENA \n";
		return;
	}
	pila[tope++]=dato;
	cout<<"\nDato apilado -->"<<dato<<"\n\n";
	
}

void Desapilar(int *pila, int& tope)
{
	if(tope ==0)
	{ 
		cout <<"\n PILA VACIA";
		return;
	}
	cout<<"\nEl dato desapilado fue "<<pila[--tope]<<"\n\n";
}
void Imprimir(int* pila,int tope)
{
	cout <<"PILA \n\n";
	for (int i = tope - 1; i >=0; i--)
	{
		cout << "|" << pila[i]<<"|\n";
	}
	cout <<"------\n";
}
	
int main()
{
	cout << "Que tan grande es la pila? ";
	cin >> x;	
	int opcion,n,pila[x], tope=0;
	
	
	while(1)
	{
		cout<<"    <<PILAS>>    ";
		cout<<"\n1. Apilar";
		cout<<"\n2. Desapilar";
		cout<<"\n3. Imprimir";
		cout<<"\n4. Salir";
		cout<<"\n\n Selecciona una Opcion:";
		cin>>opcion;
		
		switch(opcion)
		{
			case 1:
				cout<<"\nNumero a introducir:";
				cin>>n;
				
				Apilar(pila,n,tope);
				break;
			case 2:
				Desapilar(pila,tope);
				break;
			case 3:
				Imprimir(pila,tope);
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
