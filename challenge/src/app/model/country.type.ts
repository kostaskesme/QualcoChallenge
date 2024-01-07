import { Language } from '../model/language.type'

export interface Country {
  id: number,
  name: string,
  area: number,
  countryShortCode: string,
  countryLongCode: string,
  region: {
    id: number;
    name: string;
  }
  languages: Language[]
}
