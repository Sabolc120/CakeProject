import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CakePreviewComponent } from './cake-preview/cake-preview.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { MainPageComponent } from './main-page/main-page.component';
import { RegisterPageComponent } from './register-page/register-page.component';

const routes: Routes = [
  {path: "mainPage", component:MainPageComponent},
  {path: "loginPage", component:LoginPageComponent},
  {path: "registerPage", component:RegisterPageComponent},
  {path: "getCake", component:CakePreviewComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
