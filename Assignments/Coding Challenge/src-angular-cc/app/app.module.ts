import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DashboardComponent } from './Cricket/Components/dashboard/dashboard.component';
import { PlayersMaxMatchesComponent } from './Cricket/Components/players-max-matches/players-max-matches.component';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { UpdateMatchesComponent } from './Cricket/Components/update-matches/update-matches.component';

@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    PlayersMaxMatchesComponent,
    UpdateMatchesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
