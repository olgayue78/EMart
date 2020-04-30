/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { EmartViewStockComponent } from './emart-view-stock.component';

describe('EmartViewStockComponent', () => {
  let component: EmartViewStockComponent;
  let fixture: ComponentFixture<EmartViewStockComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmartViewStockComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmartViewStockComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
