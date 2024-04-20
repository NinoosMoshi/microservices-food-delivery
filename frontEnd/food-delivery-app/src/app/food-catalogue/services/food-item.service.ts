import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { API_URL_FC } from 'src/app/constants/url';

@Injectable({
  providedIn: 'root'
})
export class FoodItemService {

  private apiUrl = API_URL_FC + "/api/v1/foodCatalogue/fetchRestaurantAndFoodItemsById"

  constructor(private http:HttpClient) { }


  getFoodItemsByRestaurant(restaurantId:number): Observable<any>{
    return this.http.get<any>(`${this.apiUrl}/${restaurantId}`);
  }


}
