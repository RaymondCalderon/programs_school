//Numeros Random En un Arreglo
#include <stdlib.h>
#include<iostream>
using namespace std;
 
int rdtsc()
{
    __asm__ __volatile__("rdtsc");
}

int main()
{	
	int n = 0;
	cout<<"Cuantos valores en el Arreglo?:";
	cin>>n;
	int vector[n];
    int num,i; 
    for(i = 1; i <= n; i++)
    {	
    	srand(rdtsc());
        vector[i-1] = rand() % (100 - 1);
    }
    for(i = 1; i <= n; i++)
    {
    	cout<<vector[i-1]<<" ";
	}
    return 0;
}

