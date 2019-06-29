import * as tslib_1 from "tslib";
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { environment } from '../../environments/environment';
var apiKey = environment.apiKey;
var apiUrl = environment.apiUrl;
var headers = new HttpHeaders({
    'X-Api-key': apiKey
});
var NoticiasService = /** @class */ (function () {
    function NoticiasService(http) {
        this.http = http;
    }
    NoticiasService.prototype.llamarAPI = function (query) {
        query = apiUrl + query;
        return this.http.get(query, { headers: headers });
    };
    NoticiasService.prototype.getNoticias = function () {
        // return this.http.get<RespuestaNoticias>(`https://newsapi.org/v2/top-headlines?country=us&apiKey=1869f7b8668c4a77ba73f14043d72fd6`);
        return this.llamarAPI('/top-headlines?country=us');
    };
    NoticiasService.prototype.getNoticiasPorCategoria = function (categoria, page) {
        return this.llamarAPI("/top-headlines?country=us&category=" + categoria + "&pageSize=5&page=" + page);
    };
    NoticiasService = tslib_1.__decorate([
        Injectable({
            providedIn: 'root'
        }),
        tslib_1.__metadata("design:paramtypes", [HttpClient])
    ], NoticiasService);
    return NoticiasService;
}());
export { NoticiasService };
//# sourceMappingURL=noticias.service.js.map