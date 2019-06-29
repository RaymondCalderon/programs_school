import { Component, OnInit, ViewChild } from '@angular/core';
import { IonSegment, IonInfiniteScroll } from '@ionic/angular';
import { NoticiasService } from '../../services/noticias.service';
import { Article } from '../../interfaces/interface';

@Component({
  selector: 'app-tab2',
  templateUrl: 'tab2.page.html',
  styleUrls: ['tab2.page.scss']
})


export class Tab2Page implements OnInit {
  @ViewChild(IonSegment)segment: IonSegment;
  @ViewChild(IonInfiniteScroll)infiniteScroll: IonInfiniteScroll;

  articles: Article[] = [];

  cat = null;
  page = 5;
  categoria = null;

  constructor(private noticiasService: NoticiasService) {}

  categorias: string[] = [
  'business',
  'entertainment',
  'general',
  'health',
  'science',
  'sports',
  'technology'];

  ngOnInit() {
    this.segment.value = this.categorias[0];
    this.categoria = 'business';

    this.noticiasService.getNoticiasPorCategoria(this.categoria, this.page)
    .subscribe(noticias => {
      console.log(noticias);
      this.articles.push(...noticias.articles);
    });

    console.log(this.categoria);
  }

  onChange(event) {
    this.categoria = event.detail.value;
    console.log('onChange');
    this.page = 1;

    if (this.categoria !== this.cat) {
      this.articles.length = 0;
    }

    this.cat = event.detail.value;


    this.noticiasService.getNoticiasPorCategoria(this.categoria, this.page)
    .subscribe(noticias => {
      console.log(noticias);
      for (const article of noticias.articles) {
        this.articles.push(article);
      }
    });

    console.log(this.categoria);
  }

  loadMoreNews(event) {
    this.page++;
    console.log('loadmore');
    // this.categoria = event.detail.value;
    this.noticiasService.getNoticiasPorCategoria(this.categoria, this.page)
    .subscribe(noticias => {
      console.log(noticias);
      this.articles.push(...noticias.articles);

      event.target.complete();
    });

  }


}
