import { Component, OnInit, Input, Output } from '@angular/core';

@Component({
  selector: 'srm-select-single',
  templateUrl: './select-single.component.html'
})
export class SelectSingleComponent implements OnInit {

  @Input() values: any[] = [];
  @Input() name: string;
  @Input() onChangeFunc: Function;
  value: any;

  constructor() { }

  ngOnInit() {
  }

  onChange(selected: any) {
    if (this.onChangeFunc !== undefined || this.onChangeFunc !== null) {
      this.value = this.values.find(element => element.description === selected);
      this.onChangeFunc(this.value);
    }
  }
}
