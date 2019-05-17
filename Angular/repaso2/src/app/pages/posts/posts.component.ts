import { Component, OnInit } from '@angular/core';
import { DataService } from '../../services/data.service';

@Component({
  selector: 'app-posts',
  templateUrl: './posts.component.html',
  styleUrls: ['./posts.component.css']
})
export class PostsComponent implements OnInit {

  postsRemoto: any;

  postsLocal = [{
    titulo: 'Titulo1',
    cuerpo: 'No hay nadie que ame el dolor mismo, que lo busque, lo encuentre y lo quiera, simplemente porque es el dolor.'
  },
  {
    titulo: 'Titulo2',
    cuerpo: 'No hay nadie que ame el dolor mismo, que lo busque, lo encuentre y lo quiera, simplemente porque es el dolor.'
  },
  {
    titulo: 'Titulo3',
    cuerpo: 'No hay nadie que ame el dolor mismo, que lo busque, lo encuentre y lo quiera, simplemente porque es el dolor.'
  }
];

  constructor(private dataService: DataService) { }

  ngOnInit() {
    this.dataService.getPosts()
    .subscribe(posts => {
      console.log(posts);
      this.postsRemoto = posts;
    });
  }

}
