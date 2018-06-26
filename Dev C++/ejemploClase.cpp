#include "iostream"
#include "string"
using namespace std;

//declaración de la clase
class Alumno
{
		private:
			string nombre;
			string apellido;
			bool acreditado;
		public:
				Alumno(string, string, bool=true);
				void mostrar_info();
				void set_nombre(string nom,string ape);	
};

//Implementación de la clase
Alumno :: Alumno (string nom, string ape, bool acr)
{
		nombre=nom;
		apellido=ape;
		acreditado=acr;
}

void Alumno :: mostrar_info()
{
		cout<< apellido <<","<<nombre;
		cout<<"\nAcreditado:"<<acreditado<<"\n\n";
}

void Alumno :: set_nombre(string nom, string ape)
{
	nombre=nom;
	apellido=ape;
	return;
}

int main()
{
		int opcion, salir=0;
		string nom, ape;
		cout<<"Datos iniciales del Alumno";
		cout<<"\nNombre:";
		cin>>nom;
		cout<<"\nApellido:";
		cin>>ape;
		
		Alumno alumno_1 = Alumno(nom,ape);
		while(salir==0)
		{
			system("cls");
			cout<<"Menu";
			cout<<"\n [1] Actualizar Registro";
			cout<<"\n [2] Mostrar Registro";
			cout<<"\n [3] Salir";
			
			cout<<"\nSelecciona una opcion:";
			cin>>opcion;
			switch(opcion)
			{
				case 1:
					cout<<"Ingresa el nuevo Nombre:";
					cin>> nom;
					cout<<"Ingresa el nuevo Apellido:";
					cin>> ape;
					
					alumno_1.set_nombre(nom,ape);
					break;
				case 2:
					system("cls");
					cout<<"Datos del Alumno"<<endl;
					alumno_1.mostrar_info();
					system("pause");
					break;
				case 3:
					salir=1;
					break;
			}
		}
		
	
		return 0;
}
