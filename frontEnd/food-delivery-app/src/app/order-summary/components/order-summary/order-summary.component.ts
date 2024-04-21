import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { OrderDTO } from '../../models/OrderDTO';
import { OrderService } from '../../services/order.service';

@Component({
  selector: 'app-order-summary',
  templateUrl: './order-summary.component.html',
  styleUrls: ['./order-summary.component.css']
})
export class OrderSummaryComponent {

  orderSummary?: OrderDTO;
  obj: any;
  total?: any;
  showDialog: boolean = false;

  constructor(private route: ActivatedRoute, private orderService: OrderService, private router: Router) { }

  ngOnInit() {
    const data = this.route.snapshot.queryParams['data'];
    this.obj = JSON.parse(data);
    this.obj.userId=1;
    this.orderSummary = this.obj;

    this.total = this.orderSummary.foodItemsList.reduce((accumulator, currentValue) => {
      return accumulator + (currentValue.quantity * currentValue.price);
    }, 0);

  }



  saveOrder(){
    this.orderService.saveOrder(this.orderSummary).subscribe({
      next:res =>{
        this.showDialog = true;
      },
      error:err =>{
        console.error('Failed to save data:', err);
      }
    })
  }



  closeDialog() {
    this.showDialog = false;
    this.router.navigate(['/']); // Replace '/home' with the actual route for your home page
  }


}
