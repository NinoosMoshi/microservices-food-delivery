import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { OrderSummaryRoutingModule } from './order-summary-routing.module';
import { OrderSummaryComponent } from './components/order-summary/order-summary.component';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [
    OrderSummaryComponent
  ],
  imports: [
    CommonModule,
    OrderSummaryRoutingModule,
    HttpClientModule
  ]
})
export class OrderSummaryModule { }
