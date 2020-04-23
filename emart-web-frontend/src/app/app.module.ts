import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmartMainNavigatorComponent } from './emart-main-navigator/emart-main-navigator.component';
import { EmartMainFooterComponent } from './emart-main-footer/emart-main-footer.component';
import { EmartCustomerIndexComponent } from './emart-customer-index/emart-customer-index.component';
import { EmartLoginComponent } from './emart-login/emart-login.component';
import { EmartCustomerSignupComponent } from './emart-customer-signup/emart-customer-signup.component';
import { EmartSellerSignupComponent } from './emart-seller-signup/emart-seller-singup.component';
import { EmartSellerSignupDetailComponent } from './emart-seller-signup-detail/emart-seller-signup-detail.component';
import { EmartSearchResultComponent } from './emart-search-result/emart-search-result.component';

@NgModule({
   declarations: [
      AppComponent,
      EmartMainNavigatorComponent,
      EmartMainFooterComponent,
      EmartCustomerIndexComponent,
      EmartLoginComponent,
      EmartCustomerSignupComponent,
      EmartSellerSignupComponent,
      EmartSellerSignupDetailComponent,
      EmartSearchResultComponent
   ],
   imports: [
      BrowserModule,
      AppRoutingModule
   ],
   providers: [],
   bootstrap: [
      AppComponent
   ]
})
export class AppModule { }
