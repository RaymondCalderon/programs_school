import { Component, OnInit } from '@angular/core';
import { AlertController } from '@ionic/angular';


@Component({
  selector: 'app-alert',
  templateUrl: './alert.page.html',
  styleUrls: ['./alert.page.scss'],
})
export class AlertPage implements OnInit {
  nuevoTitulo: string;


  constructor(public alertCtrl: AlertController) { }

  ngOnInit() {
  }

  async presentAlert() {
    const alert = await this.alertCtrl.create({
      header: 'Alert',
      subHeader: 'Subtitle',
      message: 'Este es un mensaje de alerta',
      buttons: ['OK']
    });

    await alert.present();
  }

  async presentAlertInput() {
    const alert = await this.alertCtrl.create({
      header: 'Alert',
      subHeader: 'Ejemplo con Input',
      message: 'Este es un mensaje de alerta',
      inputs: [
        {
          name: 'txtTitulo',
          type: 'text',
          placeholder: 'Escribe un Titulo'
        }
      ],
      buttons: [
        {
          text: 'Cancelar',
          role: 'cancel',
          cssClass: 'secondary',
          handler: () => {
            console.log('Se cancelo la acción');
          }
        },
        {
          text: 'Aceptar',
          handler: (datos) => {
            this.nuevoTitulo = datos.txtTitulo;

            console.log('Se acepto la acción');
          }
        }
      ]
    });

    await alert.present();
  }

}
