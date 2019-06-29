import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-inicio',
  templateUrl: './inicio.page.html',
  styleUrls: ['./inicio.page.scss'],
})
export class InicioPage implements OnInit {

componentes: Componente[] = [
  {
    icono: "american-football",
    nombre: "Alert",
    url: "/alert"
  },
  {
    icono: "man",
    nombre: "Avatar",
    url: "/avatar"
  },
  {
    icono: "outlet",
    nombre: "Button",
    url: "/button"
  },
  {
    icono: "image",
    nombre: "Cards",
    url: "/card"
  },
  {
    icono: "appstore",
    nombre: "Action Sheet",
    url: "/action-sheet"
  },
  {
    icono: "planet",
    nombre: "Fab",
    url: "/fab"
  },
  {
    icono: "checkbox",
    nombre: "Check Box",
    url: "/checkbox"
  },
  {
    icono: "grid",
    nombre: "Grid",
    url: "/grid"
  },
  {
    icono: "infinite",
    nombre: "Infinite Scroll",
    url: "/scroll"
  },
  {
    icono: "contact",
    nombre: "Input",
    url: "/input"
  }
  
];

  constructor() { }

  ngOnInit() {
  }

}

interface Componente {
  icono: string;
  nombre: string;
  url: string;
}