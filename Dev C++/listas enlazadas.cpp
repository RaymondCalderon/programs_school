#include <stdio.h>
#include <stdlib.h>
//--------------------------------------------------------------

/*Estructura que tiene el contenido*/

typedef struct DEncadenada {
   char elemento;
   struct DEncadenada *next;
   struct DEncadenada *back;
}grupo;

typedef grupo *pNodo;
typedef grupo *Lista;
//--------------------------------------------------------------
//--------------------------------------------------------------
/* Funciones con listas: */
void insertar(Lista *, char);
void eliminar(Lista *, char);
void mostrarLista(Lista);
//--------------------------------------------------------------
/*Funciones utilizadas*/
void menu();
char introducirDato();
//--------------------------------------------------------------





//--------------------------------------------------------------
/*Funcion main*/
int main()
{
   Lista lista = NULL;
   char a,b,c;
   do
   {
       menu();
       a = introducirDato();
       switch(a)
       {
            case '1':
                system("CLS");
                cout<<("_____________________________________n");
                cout<<("         "Insertar Elemento"nn");
                cout<<("Introducir elemento: ");
                scanf("%c",&b);

                insertar(&lista,b);
                mostrarLista(lista);
                system("PAUSE");
                system("CLS");
                break;
            case '2':
                system("CLS");
                if(lista!=NULL)
                {
                   cout<<("_____________________________________n");
                   cout<<("         "Eliminar Elemento"nn");
                   mostrarLista(lista);
                   cout<<("n");
                   cout<<("Eliminar elemento: ");
                   scanf("%c",&c);


                   eliminar(&lista,c);
                   cout<<("n");

                }

                mostrarLista(lista);

                system("PAUSE");
                system("CLS");
                break;

            case '3':
                system("CLS");
                mostrarLista(lista);
                system("PAUSE");
                system("CLS");
                break;

            case '4':
                system("CLS");
                cout<<("        "Fin del programa"n");
                cout<<("_____________________________________n");

                a='';

                break;
       }
   }while(a!='');
   return 0;
}
//--------------------------------------------------------------
//--------------------------------------------------------------
/*Función de Menu de opciones*/
void menu()
{
    cout<<("   "Listas Doblemente Encadenadas"  n");
    cout<<("_____________________________________n");
    cout<<("Insertar Elemento.................[1]n");
    cout<<("Eliminar Elemento.................[2]n");
    cout<<("Mostrar Lista.....................[3]n");
    cout<<("Salir.............................[4]n");
    cout<<("_____________________________________n");
}
//--------------------------------------------------------------
//--------------------------------------------------------------
/*Introducir el numero de inicio*/

char introducirDato()
{
   char ch;

   do{

      cout<<("nAccion a realizar: ");
      fflush(stdin);
      ch=getche();
      if(!(ch>='1'&& ch<='4'))
      {
          cout<<("n"Inserte un digito correcto"");
      }
      cout<<("n");

   }while(!(ch>='1'&& ch<='4'));


   return ch;
}
//--------------------------------------------------------------




//--------------------------------------------------------------
/*Funcion para insertar elementos en la lista*/

void insertar(Lista *lista, char v)
{
   pNodo nuevo, actual;

   nuevo = (pNodo)malloc(sizeof(grupo));
   nuevo->elemento = v;
   actual = *lista;

   if(actual)
   {
        while(actual->back)
        {
            actual = actual->back;
        }
   }
   if(!actual || actual->elemento > v) {
      nuevo->next = actual;
      nuevo->back = NULL;

      if(actual)
      {
            actual->back = nuevo;
      }

      if(!*lista)
      {
            *lista = nuevo;
      }
   }
   else {
      while(actual->next &&actual->next->elemento <= v)
      {
            actual = actual->next;
      }

      nuevo->next = actual->next;
      actual->next = nuevo;
      nuevo->back = actual;

      if(nuevo->next)
      {
          nuevo->next->back = nuevo;
      }
   }
}
//--------------------------------------------------------------
//--------------------------------------------------------------
/*Funcion para eliminar elemento en la lista*/

void eliminar(Lista *lista, char v)
{
   pNodo nodo;

   nodo = *lista;

   while(nodo && nodo->elemento < v)
   {
       nodo = nodo->next;
   }

   while(nodo && nodo->elemento > v)
   {
       nodo = nodo->back;
   }

   if(!nodo || nodo->elemento != v)
   {
       return;
   }

   if(nodo == *lista)
   {
        if(nodo->back)
        {
            *lista = nodo->back;
        }
        else
        {
            *lista = nodo->next;
        }

   }

   if(nodo->back)
   {
      nodo->back->next = nodo->next;
   }

   if(nodo->next)
   {
      nodo->next->back = nodo->back;
   }

   free(nodo);
}
//--------------------------------------------------------------
//--------------------------------------------------------------
/*Funcion para mostrar la lista*/

void mostrarLista(Lista lista)
{
   pNodo nodo = lista;

   if(!lista)
   {
        cout<<(""La Lista esta Vacia"");
   }
   else{
      while(nodo->back)
      {

            nodo = nodo->back;
      }
      cout<<("n     "Elementos de la Lista"      n");
      cout<<("_____________________________________n");
      while(nodo)
      {
         cout<<("-> %c", nodo->elemento);
         nodo = nodo->next;
      }

   }

   cout<<("n");
}
//--------------------------------------------------------------

