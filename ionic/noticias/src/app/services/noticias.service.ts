import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { RespuestaNoticias } from '../interfaces/interface';
import { environment } from '../../environments/environment';

const apiKey = environment.apiKey;
const apiUrl = environment.apiUrl;


const headers = new HttpHeaders({
  'X-Api-key': apiKey
});

@Injectable({
  providedIn: 'root'
})
export class NoticiasService {

  constructor(private http: HttpClient) { }

  llamarAPI<T>(query: string) {
    query = apiUrl + query;

    return this.http.get<T>(query, {headers: headers});
  }

  getNoticias() {
    // return this.http.get<RespuestaNoticias>(`https://newsapi.org/v2/top-headlines?country=us&apiKey=1869f7b8668c4a77ba73f14043d72fd6`);
    return this.llamarAPI<RespuestaNoticias>('/top-headlines?country=us');
  }

  getNoticiasPorCategoria(categoria: string, page: number) {
    return this.llamarAPI<RespuestaNoticias>(`/top-headlines?country=us&category=${categoria}&pageSize=5&page=${page}`);
  }
}
