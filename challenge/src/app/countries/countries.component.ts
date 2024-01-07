import {Component, inject} from '@angular/core';
import { Router, RouterOutlet, RouterLink, RouterLinkActive } from '@angular/router';
import { CountryService } from '../services/country.service'
import { Country } from '../model/country.type'
import { CommonModule } from '@angular/common';
import {MatTableModule} from '@angular/material/table';

@Component({
  selector: 'app-countries',
  standalone: true,
  imports: [CommonModule, RouterOutlet, RouterLink, RouterLinkActive, MatTableModule],
  templateUrl: './countries.component.html',
  styleUrl: './countries.component.css'
})

export class CountriesComponent {
  countries: Country[] = [];
  countryService: CountryService = inject(CountryService);
  displayedColumns: string[] = ['name', 'area', 'code'];

  constructor(){
    this.countryService.getAllCountries().then((response) => {
     this.countries = response;
     this.countries.sort((a,b)=>a.name >= b.name ? 1 : -1);
    });
  }
}
