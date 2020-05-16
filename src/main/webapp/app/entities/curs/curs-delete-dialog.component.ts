import { Component } from '@angular/core';

import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager } from 'ng-jhipster';

import { ICurs } from 'app/shared/model/curs.model';
import { CursService } from './curs.service';

@Component({
  templateUrl: './curs-delete-dialog.component.html'
})
export class CursDeleteDialogComponent {
  curs: ICurs;

  constructor(protected cursService: CursService, public activeModal: NgbActiveModal, protected eventManager: JhiEventManager) {}

  clear() {
    this.activeModal.dismiss('cancel');
  }

  confirmDelete(id: number) {
    this.cursService.delete(id).subscribe(() => {
      this.eventManager.broadcast({
        name: 'cursListModification',
        content: 'Deleted an curs'
      });
      this.activeModal.dismiss(true);
    });
  }
}
