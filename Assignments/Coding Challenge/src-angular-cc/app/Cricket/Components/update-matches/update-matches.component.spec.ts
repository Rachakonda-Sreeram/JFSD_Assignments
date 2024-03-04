import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateMatchesComponent } from './update-matches.component';

describe('UpdateMatchesComponent', () => {
  let component: UpdateMatchesComponent;
  let fixture: ComponentFixture<UpdateMatchesComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [UpdateMatchesComponent]
    });
    fixture = TestBed.createComponent(UpdateMatchesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
