import { Component, inject } from '@angular/core';
import { Country } from '../model/country.type'
import { Language } from '../model/language.type'
import { CommonModule } from '@angular/common';
import { CountryService } from '../services/country.service'
import { ActivatedRoute, Params } from '@angular/router';
import {MatTableModule} from '@angular/material/table';

@Component({
  selector: 'app-languages',
  standalone: true,
  imports: [CommonModule, MatTableModule],
  templateUrl: './languages.component.html',
  styleUrl: './languages.component.css'
})
export class LanguagesComponent {

  countryId: any;
  countryService: CountryService = inject(CountryService);
  languages: Language[] = [];
  displayedColumns: string[] = ['name'];

  constructor(private route: ActivatedRoute) {
     this.route.params.subscribe(
      (params: Params) => {
        this.countryId = params['countryId'];
    });

    this.countryService.getCountryById(this.countryId).then(response => {
      this.languages = response.languages;
    });
  }

}
