import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

// The following snippet shows the AppRoutingModule class with the @NgModule metadata and an empty routes array.
const routes: Routes = [];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
