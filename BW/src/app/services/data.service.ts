import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Customer } from '../interfaces/customer';
import { Invoice } from '../interfaces/invoice';
import { Paging } from '../interfaces/paging';
import { User } from '../interfaces/user';
import { AuthService } from './auth.service';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  url: string = "http://localhost:9090/";

  constructor(private http: HttpClient, private router: Router, private authSrv: AuthService) { }

  getHeaders(token:string) {
    return new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': `Bearer ${token}`
    });
  }

  getUser(id: number, token:string){
    const headers = this.getHeaders(token);
    return this.http.get<User>(this.url + "user/" + id, {headers})
  }

  getAllCustomers(token:string){
    const headers = this.getHeaders(token);
    return this.http.get<Customer[]>(this.url + "customer", {headers})
  }

  getAllInvoices(token:string){
    const headers = this.getHeaders(token);
    return this.http.get<Invoice[]>(this.url + "invoice", {headers})
  }

  getSingleInvoice(name:string, token: string){
    const headers = this.getHeaders(token);
    return this.http.get<Invoice[]>(this.url + `invoice/filter_by_customer=${name}`, {headers})
  }

  getByGap(token: string){
    const headers = this.getHeaders(token);
    return this.http.get<Paging>(this.url + `customer/by_gap_asc`, {headers})
  }

  getBySubDate(token: string){
    const headers = this.getHeaders(token);
    return this.http.get<Paging>(this.url + `customer/by_date_asc`, {headers})
  }

  getByLastContact(token: string){
    const headers = this.getHeaders(token);
    return this.http.get<Paging>(this.url + `customer/by_last_date_asc`, {headers})
  }

  getByProvince(token: string){
    const headers = this.getHeaders(token);
    return this.http.get<Customer[]>(this.url + `customer/order_by_province`, {headers})
  }

  filter(param: string, token: string){
    const headers = this.getHeaders(token);
    return this.http.get<Customer[]>(this.url + `customer/${param}`, {headers})
  }
}
