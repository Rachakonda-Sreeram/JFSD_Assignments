import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PlayersMaxMatchesComponent } from './players-max-matches.component';

describe('PlayersMaxMatchesComponent', () => {
  let component: PlayersMaxMatchesComponent;
  let fixture: ComponentFixture<PlayersMaxMatchesComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PlayersMaxMatchesComponent]
    });
    fixture = TestBed.createComponent(PlayersMaxMatchesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
