import * as tslib_1 from "tslib";
import { Component, ViewChild } from '@angular/core';
import { IonSegment, IonInfiniteScroll } from '@ionic/angular';
import { NoticiasService } from '../../services/noticias.service';
var Tab2Page = /** @class */ (function () {
    function Tab2Page(noticiasService) {
        this.noticiasService = noticiasService;
        this.articles = [];
        this.cat = null;
        this.page = 5;
        this.categorias = [
            'business',
            'entertainment',
            'general',
            'health',
            'science',
            'sports',
            'technology'
        ];
    }
    Tab2Page.prototype.ngOnInit = function () {
        var _this = this;
        this.segment.value = this.categorias[0];
        var categoria = 'business';
        this.noticiasService.getNoticiasPorCategoria(categoria, this.page)
            .subscribe(function (noticias) {
            var _a;
            console.log(noticias);
            (_a = _this.articles).push.apply(_a, noticias.articles);
        });
        console.log(categoria);
    };
    Tab2Page.prototype.onChange = function (event) {
        var _this = this;
        var categoria = event.detail.value;
        console.log('onChange');
        if (categoria !== this.cat) {
            this.articles.length = 0;
        }
        this.cat = event.detail.value;
        this.noticiasService.getNoticiasPorCategoria(categoria, this.page)
            .subscribe(function (noticias) {
            console.log(noticias);
            for (var _i = 0, _a = noticias.articles; _i < _a.length; _i++) {
                var article = _a[_i];
                _this.articles.push(article);
            }
        });
        console.log(categoria);
    };
    Tab2Page.prototype.loadMoreNews = function (event) {
        var _this = this;
        this.page++;
        console.log('loadmore');
        var categoria = event.detail.value;
        this.noticiasService.getNoticiasPorCategoria(categoria, this.page)
            .subscribe(function (noticias) {
            var _a;
            console.log(noticias);
            (_a = _this.articles).push.apply(_a, noticias.articles);
            event.target.complete();
        });
    };
    tslib_1.__decorate([
        ViewChild(IonSegment),
        tslib_1.__metadata("design:type", IonSegment)
    ], Tab2Page.prototype, "segment", void 0);
    tslib_1.__decorate([
        ViewChild(IonInfiniteScroll),
        tslib_1.__metadata("design:type", IonInfiniteScroll)
    ], Tab2Page.prototype, "infiniteScroll", void 0);
    Tab2Page = tslib_1.__decorate([
        Component({
            selector: 'app-tab2',
            templateUrl: 'tab2.page.html',
            styleUrls: ['tab2.page.scss']
        }),
        tslib_1.__metadata("design:paramtypes", [NoticiasService])
    ], Tab2Page);
    return Tab2Page;
}());
export { Tab2Page };
//# sourceMappingURL=tab2.page.js.map