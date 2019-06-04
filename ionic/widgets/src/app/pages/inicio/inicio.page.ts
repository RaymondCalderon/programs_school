import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-inicio',
  templateUrl: './inicio.page.html',
  styleUrls: ['./inicio.page.scss'],
})
export class InicioPage implements OnInit {
  componentes: Componente[] = [
    {
      icono: 'american-football',
      nombre: 'Alert',
      url: '/alert'
    },
    {
      icono: 'appstore',
      nombre: 'Action Sheet',
      url: '/action-sheet'
    },
    {
      icono: 'man',
      nombre: 'Avatar',
      url: '/avatar'
    },
    {
      icono: 'outlet',
      nombre: 'Button',
      url: '/button'
    },
    {
      icono: 'image',
      nombre: 'Cards',
      url: '/card'
    },
    {
      icono: 'planet',
      nombre: 'Fab',
      url: '/fab'
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
