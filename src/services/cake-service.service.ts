import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CakeServiceService {

  constructor(private httpclient:HttpClient) { }
  BACKEND = "http://localhost:8080"
  public getCake(id){
    return this.httpclient.get(this.BACKEND + '/getCake?id='+id);
  }
}
