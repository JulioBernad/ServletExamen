package Service;

import java.util.List;

import Model.*;
import Repository.*;

public class Services {
	private Repository repository = new Repository();
	
	public void insertNewLanguage(String nLanguage, String country) {
		repository.insertNewLanguage(nLanguage);
		repository.insertNewCountry(country, nLanguage);
	}
	
	public void insertNewCountry(String language, String country) {
		repository.insertNewCountry(country, language);
	}
	
	public void createTables() {
		repository.createCountriesTable();
		repository.createLanguagesTable();
	}
	
	public void deleteTable(String language) {
		repository.deleteCountry(language);
		repository.deleteLannguage(language);
	}

	public List<Country> listAllCountries() {
		return repository.listAllCountries();
	}
	
	public List<Languages> listAllLanguages() {
		return repository.listAllLanguages();
	}

	public Repository getRepository() {
		return repository;
	}

	public void setRepository(Repository repository) {
		this.repository = repository;
	}
	
}