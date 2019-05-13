import { Component } from '@angular/core';

import { ContactPage } from '../contact/contact';
import { HomePage } from '../home/home';
import { FavoritesPage } from '../favorites/favorites'

@Component({
  templateUrl: 'tabs.html'
})
export class TabsPage {

  tabPrincipal = HomePage;
  tabFavoritos = FavoritesPage;
  tabConfiguracion = ContactPage;

  constructor() {

  }
}
