import { Component, OnInit, ViewChild } from '@angular/core';
import { IonInfiniteScroll } from '@ionic/angular';

@Component({
  selector: 'app-scroll',
  templateUrl: './scroll.page.html',
  styleUrls: ['./scroll.page.scss'],
})
export class ScrollPage implements OnInit {

  @ViewChild(IonInfiniteScroll) infiniteScroll: IonInfiniteScroll;
  dataList:any;
  
  constructor() { 
    this.dataList = [];
    for (let i =0; i<30; i++){
      this.dataList.push("Numero " + this.dataList.length);
    }
   }

  loadData(event){
    setTimeout(() =>{
      
      console.log('echo');
      for (let i =0; i<25; i++){
        this.dataList.push("numero " + this.dataList.length);
      }
      event.target.complete();

      //logica para determinar si todos los datos estan cargados
      // y deshabilitar el desplazamiento infinito
      if(this.dataList.length == 1000){
        event.target.disabled = true;
      } 
    }, 500);
  }

  toggleInfiniteScroll(){
    this.infiniteScroll.disabled = !this.infiniteScroll.disabled;
  }
  ngOnInit() {
  }

}
