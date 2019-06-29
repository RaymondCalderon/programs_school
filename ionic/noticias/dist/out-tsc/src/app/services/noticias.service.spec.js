import { TestBed } from '@angular/core/testing';
import { NoticiasService } from './noticias.service';
describe('NoticiasService', function () {
    beforeEach(function () { return TestBed.configureTestingModule({}); });
    it('should be created', function () {
        var service = TestBed.get(NoticiasService);
        expect(service).toBeTruthy();
    });
});
//# sourceMappingURL=noticias.service.spec.js.map