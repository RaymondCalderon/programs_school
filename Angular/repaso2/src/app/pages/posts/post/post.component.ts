import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent implements OnInit {

  @Input()postRemote;
  @Output() clickPost = new EventEmitter<number>();

  constructor() { }

  ngOnInit() {
  }

  onClickHijo(id){
    // console.log(id);
    this.clickPost.emit(this.postRemote.id);
  }

}
