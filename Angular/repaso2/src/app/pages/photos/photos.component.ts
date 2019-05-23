import { Component, OnInit, Input } from '@angular/core';
import { DataService } from '../../services/data.service';

@Component({
  selector: 'app-photos',
  templateUrl: './photos.component.html',
  styleUrls: ['./photos.component.css']
})
export class PhotosComponent implements OnInit {

  photosRemote: any;
  numOfCols: 3;
  rowCount: 0;

  constructor(private dataService: DataService) { }

  ngOnInit() {
    this.photosRemote = this.dataService.getPhotos();
    // this.dataService.getPhotos()
    // .subscribe(posts => {
    //   console.log(posts);
    //   this.photoRemote = posts;
    // });
  }

}
