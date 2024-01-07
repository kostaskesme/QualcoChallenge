import { Injectable } from '@angular/core';
import { Country } from '../model/country.type'

@Injectable({
  providedIn: 'root'
})
export class CountryService {

  url = 'http://localhost:8080/countries';
  urlByid = 'http://localhost:8080/countries/';

  constructor() { }

  async getAllCountries(): Promise<Country[]> {
    const data = await fetch(this.url);
    return  (await data.json()) ?? [];
  }

    async getCountryById(id: number): Promise<Country> {
      const data = await fetch(this.urlByid + id);
      return  (await data.json()) ?? [];
    }
}
