import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { API_URL_RL } from 'src/app/constants/url';

@Injectable({
  providedIn: 'root'
})
export class RestaurantService {

  private apiUrl = API_URL_RL + '/api/v1/restaurant/fetchAllRestaurants';

  constructor(private http:HttpClient) { }


  getAllRestaurants(): Observable<any>{
    return this.http.get<any>(`${this.apiUrl}`);
  }


}
