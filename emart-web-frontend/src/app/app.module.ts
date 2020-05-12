import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmartMainNavigatorComponent } from './component/emart-main-navigator/emart-main-navigator.component';
import { EmartMainFooterComponent } from './component/emart-main-footer/emart-main-footer.component';
import { EmartCustomerIndexComponent } from './component/emart-customer-index/emart-customer-index.component';
import { EmartLoginComponent } from './component/emart-login/emart-login.component';
import { EmartCustomerSignupComponent } from './component/emart-customer-signup/emart-customer-signup.component';
import { EmartSellerSignupComponent } from './component/emart-seller-signup/emart-seller-singup.component';
import { EmartSellerSignupDetailComponent } from './component/emart-seller-signup-detail/emart-seller-signup-detail.component';
import { EmartSearchResultComponent } from './component/emart-search-result/emart-search-result.component';
import { EmartItemDetailComponent } from './component/emart-item-detail/emart-item-detail.component';
import { EmartShoppingCartComponent } from './component/emart-shopping-cart/emart-shopping-cart.component';
import { EmartPurchaseHistoryComponent } from './component/emart-purchase-history/emart-purchase-history.component';
import { EmartSellerNavigatorComponent } from './component/emart-seller-navigator/emart-seller-navigator.component';
import { EmartAddItemComponent } from './component/emart-add-item/emart-add-item.component';
import { EmartViewStockComponent } from './component/emart-view-stock/emart-view-stock.component';
import { Routes, RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';

const appRoutes: Routes = [
   {path: '',redirectTo:'/signin',pathMatch: 'full'},
   { path: 'signin', component: EmartLoginComponent },
   { path: 'signup-customer', component: EmartCustomerSignupComponent },
   { path: 'signup-seller', component: EmartSellerSignupComponent },
   { path: 'signup-seller-detail', component: EmartSellerSignupDetailComponent },
   { path: 'emart-customer-index', component: EmartCustomerIndexComponent },
   { path: 'emart-search-results', component: EmartSearchResultComponent },
   { path: 'emart-shopping-cart', component: EmartShoppingCartComponent },
   { path: 'emart-purchase-history', component: EmartPurchaseHistoryComponent },
   { path: 'emart-add-item', component: EmartAddItemComponent },
   { path: 'emart-view-stock', component: EmartViewStockComponent },
 ];

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
      EmartSearchResultComponent,
      EmartItemDetailComponent,
      EmartShoppingCartComponent,
      EmartPurchaseHistoryComponent,
      EmartSellerNavigatorComponent,
      EmartAddItemComponent,
      EmartViewStockComponent
   ],
   imports: [
      BrowserModule,
      HttpClientModule,
      AppRoutingModule,
      FormsModule,
      RouterModule.forRoot(
        appRoutes,
        { enableTracing: true } // <-- debugging purposes only
      )
   ],
   providers: [],
   exports: [
      EmartMainNavigatorComponent,
      EmartMainFooterComponent,
      EmartSellerNavigatorComponent
   ],
   bootstrap: [
      AppComponent
   ]
})
export class AppModule { }
