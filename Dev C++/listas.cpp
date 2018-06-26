#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<iostream>

using namespace std;
int x = 0;
int pos = 0;
void insertar(int * lista,int n, int & pos, int & ultimo)
{
	if(ultimo == x)
	{
		cout<<"\nLISTA LLENA\n";
		return;
	}
	else if(lista[pos-1]==0)
	{
		lista[pos-1]=n;
		cout<<"\nSe ha ingresado el dato:"<<n<<" en la posicion "<<pos;
		ultimo++;
		return;
	}
	else
	{
	cout<<"Ya existe un valor en esta Posicion";
	return;
	}
}

void eliminar(int * lista,int & pos, int & ultimo)
{
	if(ultimo == 0)
	{
		cout<<"\nLISTA VACIA\n";
		return;
	}
	else if(lista[pos-1]==0)
	{
		cout<<"\nEn esta posicion no hay nada que Eliminar";
		return;
	}
	else
	{
	cout << "\nSe ha eliminado el dato:"<<lista[pos-1]<<" que estaba en la posicion "<<pos;
	
	for(int i=pos; i<ultimo; i++)
		{
			lista[i]=lista[i+1];
		}
	ultimo--;
	}
}

void imprimir(int* lista)
{
	cout<<"<<  Lista  >>";
	cout<<"\nUltimo Elemento-->";
	for(int i = x-1; i>=0; i--)
	{
		cout<<lista[i]<<" ";
	}
	cout<<"<<--Primer elemento\n";
}
void vaciar(int * lista,int & ultimo)
{
	cout<<"Has vaciado totalmente la Lista";
	for(int i=0; i<=x-1; i++)
	{
		lista[i] = 0;
	}
}

int main()
{	
	cout << "Que tan grande es la Lista? ";
	cin >> x;
	system("cls");
	int opcion,n,lista[x],primero=0,ultimo=0;
	for(int i=0; i<=x-1; i++)
	{
		lista[i] = primero;
	}
	system("cls");
	while(1)
	{
		cout<<"LISTAS";
		cout<<"\n\nMenu";
		cout<<"\n1. Insertar";
		cout<<"\n2. Eliminar";
		cout<<"\n3. Imprimir";
		cout<<"\n4. Vaciar Totalmente";
		cout<<"\n5. Salir";
		cout<<"\n\nSelecciona una opcion: ";
		cin>>opcion;
		
		switch(opcion)
		{
			case 1:
				cout<<"\nIntroduce un numero: ";
				cin>>n;
				cout<<"\nEn que posicion vas a insertar el numero(Desde 1 Hasta "<<x<<")?";
				cin>>pos;
				if(pos<1 || pos>x)
				{
					cout<<"Posicion no Valida, Intente con otra Posicion";
					break;
				}
				insertar(lista,n,pos,ultimo);
				break;
			case 2:
				cout<<"\nEn que posicion vas a Eliminar el numero(Desde 1 Hasta "<<x<<")?";
				cin>>pos;
				eliminar(lista,pos,ultimo);
				break;
			case 3:
				imprimir(lista);
				break;
			case 4:
				vaciar(lista,ultimo);
				break;
			case 5:
				return 0;	
			
			default:
				cout<<"\nSelecciona una opcion valida...";
				break;
		}
		cout<<"\n\n";
		system("pause");
		system("cls");
	}
}
