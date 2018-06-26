#include <stdio.h>
#include <stdlib.h>
struct Juego
{
char Nombre[20];
char Genero[20];
struct Juego *sig,*ant;
};
int main(){
struct Juego *cabeza,*ult,*nuevo,*aux,*aux1;
char continuar;
int NumVidas;
int Log_Rotacion,i=0;
printf("Digite el Numero de vidas que tiene cada jugador: ");
scanf("%d",&NumVidas);//TENIAS QUE PONER %d porque NumVidas es int
printf("\nDigite la cantidad de saltos entre jugadores: ");
scanf("%d",&Log_Rotacion);//TENIAS QUE PONER %d porque Log_Rotacion es int
fflush(stdin);
printf("\nDESEA AGREGAR JUGADORES S o N \n S=Si \n N=No: ");
scanf("%c",&continuar);//TENIAS QUE PONER %c porque continuar es char
cabeza=NULL;
while(continuar=='S' ||continuar=='s'){
fflush(stdin);
if(cabeza==NULL){
cabeza=(struct Juego*)malloc(sizeof(struct Juego));
printf("\nDigite el nombre del jugador: \n");
gets(cabeza->Nombre);
printf("\nDigite el genero del jugador: \n");
gets(cabeza->Genero);
cabeza->sig=cabeza;
cabeza->ant=cabeza;
ult = cabeza; //TE FALTO ESTO
}
else{
nuevo=(struct Juego*)malloc(sizeof(struct Juego));
printf("\nDigite el nombre del jugador: \n");
gets(nuevo->Nombre);
printf("\nDigite el genero del jugador: \n");
gets(nuevo->Genero);
ult->sig=nuevo;
nuevo->ant=ult;
ult=nuevo;
ult->sig=cabeza;
cabeza->ant=ult;
}
printf("\nDESEA AGREGAR JUGADORES S o N \n S=Si \n N=No: ");
scanf("%c",&continuar);//Esto lo cambie
}
//Aqui intento Hacer la 2 parte
aux = cabeza;//Primero apuntas aux en la direccion de cabeza
if(aux != NULL){//Si hay datos en la lista
while(i!=Log_Rotacion){
printf ("\nNodo:%d\tGenero: %s\tNombre: %s\n",i+1,aux->Genero,aux->Nombre);
aux=aux->sig;
i=i+1;
}
//NO OLVIDES LIBERAR EL ESPACIO DE MEMORIA RESERVADO PARA LA LISTA
aux = aux1 = cabeza;
while(aux->sig != cabeza){
aux = aux->sig;
free(aux1);
aux1 = aux;
}
}
system("PAUSE");
return 0;
}
