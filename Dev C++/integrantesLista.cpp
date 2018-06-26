#include "stdio.h"
#include "stdlib.h"
#include "string.h"
#include "iostream"
using namespace std;


#define NUM_ELEMENTOS 3
#define TAM_NOMBRE 30

typedef struct{
	int matricula;
	char nombre[TAM_NOMBRE];
}Alumno;
typedef Alumno TipoElemento;
typedef int posicion;
typedef struct{
	TipoElemento elementos[NUM_ELEMENTOS];
	posicion ult;
}Lista;

int Posicion;
Alumno Integrante1;
Alumno Integrante2;
Alumno Integrante3;
Lista Milista;
void inicializador()
{   
    char alum1[TAM_NOMBRE],alum2[TAM_NOMBRE],alum3[TAM_NOMBRE];
	int m1,m2,m3;
    cout<< "Ingrese el nombre del Alumno 1: ";
    cin>> alum1;
    cout<< "\nIngrese la matricula del Alumno 1: ";
    cin>> m1;
    cout<< "\nIngrese el nombre del Alumno 2: ";
    cin>> alum2;
    cout<< "\nIngrese la matricula del Alumno 2: ";
    cin>> m2;
    cout<< "\nIngrese el nombre del Alumno 3: ";
    cin>> alum3;
    cout<< "\nIngrese la matricula del Alumno 3: ";
    cin>> m3;
	strcpy(Integrante1.nombre, alum1);
	Integrante1.matricula=m1;
	strcpy(Integrante2.nombre, alum2);
	Integrante2.matricula=m2;
	strcpy(Integrante3.nombre, alum3);
	Integrante3.matricula=m3;
	
	Milista.elementos[0]=Integrante1;
	Milista.elementos[1]=Integrante2;
	Milista.elementos[2]=Integrante3;
}

void imprimirLista()
{
	for(int i=0; i<=NUM_ELEMENTOS-1; i++){
		//cout<<"Elemento:"<<i;
		cout<<"\nNombre:"<<Milista.elementos[i].nombre;
		cout<<"\nMatricula:"<<Milista.elementos[i].matricula;
		cout<<"\n";
	}
}

int main()
{
	inicializador();
	imprimirLista();
	
	return 0;
	
}
