#include "stdio.h"
#include "stdlib.h"
#include "string.h"
#include "iostream"
using namespace std;
	int C ,PrecioR,PrecioC,PrecioT;
	float SR,SC,ST;
	char venta[25];
	char insumo[25];
void inicio(){

	do {
		cout<<"\nIngrese el numero de Pruebas (Tiene que ser menor a 4): ";
		cin>>C;
		if(C>=4) {
			cout<<"\nIngrese un numero menor a 4";}
	} while(C>=4);
	
 	for(int i=0; i<=C-1; i++) {
		int VR=0,VC=0,VT=0,IR=0,IC=0,IT=0;
		float ventas=0,insumos=0,total=0;
		printf("Productos: ");
		scanf("%i %i %i", &PrecioR,&PrecioC,&PrecioT);
		printf("los precios son: %i %i %i respectivamente\n", PrecioR,PrecioC,PrecioT);
		
		cout<<"\nVentas: ";
		cin.ignore();
		cin.getline(venta,25);
		
			for(int j =0 ;j!=25;j++){
			if(venta[j]=='R'){
				VR = VR+1;
			}
			
			else if(venta[j]=='C'){
				VC = VC+1;
			}else if(venta[j]=='T'){
				VT = VT+1;
			}
		}
		
		cout<<"1: "<<VR;
		cout<<"\n2: "<< VC;
		cout<<"\n3: "<< VT;
		cout<<"\nInsumos: ";
		cin.ignore();
		cin.getline(insumo,25);
		
		for(int k =0 ;k!=25;k++){
			if(insumo[k]=='H'){
				IR = IR+1;
			}
			else if(insumo[k]=='P'){
				IC = IC+1;
			}
			else if(insumo[k]=='B'){
				IT = IT+1;
			}
		}
		cout<<"1: "<<IR;
		cout<<"\n2: "<< IC;
		cout<<"\n3: "<< IT;
		SR = (PrecioR)*.20;
		SC = (PrecioC)*.30;
		ST = (PrecioT)*.40;
		ventas = (SR*VR)+(SC*VC)+(ST*VT);
		insumos = (IR*1.5)+(IC*2)+(IT*1);
		total = ventas - insumos ;
		if(total<=0) {
			cout<<"\nPierde"; } 
			else{
			cout<<"\nGana"; }
		cout<<"\n"<<total;
	}
}



int main()
{
	inicio();
	return 0;
	
}
