import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-checkbox',
  templateUrl: './checkbox.page.html',
  styleUrls: ['./checkbox.page.scss'],
})
export class CheckboxPage implements OnInit {

  public form = [
      { val: 'Tyron', isChecked: true, color: "dark" },
      { val: 'Hodor', isChecked: false },
      { val: 'Drogon', isChecked: false }
  ];

  constructor() { }

  ngOnInit() {
  }

}
