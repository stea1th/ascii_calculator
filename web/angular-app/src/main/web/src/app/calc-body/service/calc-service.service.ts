import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class CalcServiceService {

  baseUrl = 'http://localhost:8080';
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  };

  constructor(private http: HttpClient) {
  }

  public postResult(num: string): Observable<any> {

    return this.http.post<any>(this.baseUrl + '/result', {
        expression: num
      },
      this.httpOptions).pipe();
  }

  public getAscii(num: string): Observable<any> {
    return this.http.get<any>(this.baseUrl + '/ascii?num=' + num).pipe();
  }


}
