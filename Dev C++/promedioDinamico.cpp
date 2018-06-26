#include "iostream"
#include "time.h"
#include "stdlib.h"
using namespace std;


int main() 
{
	srand(time(NULL));
	int aprobadas = 0;
	int reprobadas = 0;
	int suma = 0;
	int tam = 0;
	cout<<"Cuantas calificaciones tienes?\n";
	cin>> tam;
	int* calificacion = new int [tam];
	for(int i=0; i<tam; i++){
	    calificacion[i]=1+rand()%(10);
	}
	for(int j=0; j<tam; j++){
		cout<< "\nCalificacion" <<j+1<< "=" <<calificacion[j];
	}
	for(int k=0; k<tam; k++){
		if(calificacion[k]>=7){
			aprobadas++;
		}else{
			reprobadas++;
		}
		suma = suma + calificacion[k];
	}
	cout<<"\nEl alumno aprobo "<<aprobadas<< " y reprobo " <<reprobadas<< " con un promedio de "<<suma/tam;
	delete calificacion;
	cout <<"\n\n";
	return 0;
}
