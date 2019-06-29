import * as tslib_1 from "tslib";
import { Component } from '@angular/core';
import { NoticiasService } from '../../services/noticias.service';
var Tab1Page = /** @class */ (function () {
    function Tab1Page(servicioNoticias) {
        this.servicioNoticias = servicioNoticias;
        this.articles = [];
    }
    Tab1Page.prototype.ngOnInit = function () {
        var _this = this;
        this.servicioNoticias.getNoticias()
            .subscribe(function (noticias) {
            var _a;
            console.log(noticias);
            (_a = _this.articles).push.apply(_a, noticias.articles);
        });
    };
    Tab1Page = tslib_1.__decorate([
        Component({
            selector: 'app-tab1',
            templateUrl: 'tab1.page.html',
            styleUrls: ['tab1.page.scss']
        }),
        tslib_1.__metadata("design:paramtypes", [NoticiasService])
    ], Tab1Page);
    return Tab1Page;
}());
export { Tab1Page };
//# sourceMappingURL=tab1.page.js.map