import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './Cricket/Components/dashboard/dashboard.component';
import { PlayersMaxMatchesComponent } from './Cricket/Components/players-max-matches/players-max-matches.component';
import { UpdateMatchesComponent } from './Cricket/Components/update-matches/update-matches.component';

const routes: Routes = [

  {path: '', component:DashboardComponent},
  {path:'playerMaxMatches',component:PlayersMaxMatchesComponent},
  {path:'updateMatches',component:UpdateMatchesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
