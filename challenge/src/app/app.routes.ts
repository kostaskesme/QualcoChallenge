import { Routes } from '@angular/router';

import { HomeComponent } from './home/home.component'
import { CountriesComponent } from './countries/countries.component'
import { LanguagesComponent } from './languages/languages.component'


export const routes: Routes = [
  {
    path: '', component: HomeComponent
  },
  {
      path: 'countries', component: CountriesComponent
  },
  {
    path: 'country/:countryId', component: LanguagesComponent
  }
];
