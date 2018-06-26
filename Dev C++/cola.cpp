#include "iostream"
#include <stdio.h>

using namespace std;
int x = 0;
void insertar(int * cola,int n, int & ultimo)
{
	if(ultimo == x)
	{
		cout<<"\nCOLA LLENA\n";
		return;
	}
	cola[ultimo]=n;
	cout<<"\nSe ha ingresado el dato:"<<n<<"\n\n";
	ultimo++;
	
}

void eliminar(int * cola,int& primero, int & ultimo)
{
	if(ultimo == 0)
	{
		cout<<"\nCOLA VACIA\n";
		return;
	}
	else
	{
	cout << "\nSe ha eliminado el dato:"<<cola[primero];
	
	for(int i=0; i<ultimo; i++)
		{
			cola[i]=cola[i+1];
		}
	ultimo--;
	}
}

void imprimir(int* cola, int ultimo)
{
	cout<<"<<  Cola  >>";
	cout<<"\nUltimo elemento--> ";
	for(int i = ultimo-1; i>=0; i--)
	{
		cout<<cola[i]<<" ";
	}
	cout<<"<<--Primer elemento\n";
}
void vaciar(int * cola,int & ultimo)
{
	cout<<"Has vaciado totalmente la cola";
	ultimo = 0;	
}

int main()
{	
	cout << "Que tan grande es la Cola? ";
	cin >> x;
	system("cls");
	int opcion,n,cola[x],primero=0,ultimo=0;
	while(1)
	{
		cout<<"COLAS";
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
				insertar(cola,n,ultimo);
				break;
			case 2:
				eliminar(cola,primero,ultimo);
				break;
			case 3:
				imprimir(cola, ultimo);
				break;
			case 4:
				vaciar(cola,ultimo);
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
