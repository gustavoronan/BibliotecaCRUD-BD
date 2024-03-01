package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Autor;
import app.repository.AutorRepository;

@Service
public class AutorService {

	@Autowired
	private AutorRepository autorRepository;
	
	public String save (Autor autor) {
		this.autorRepository.save(autor);
		return autor.getNomeAutor() + " autor salvo com sucesso";
	}
	
	
	public List<Autor> listAll(){
		return this.autorRepository.findAll();
	}
	
	/*
	public Autor findById(long idAutor) {

		// banco de dados
		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getIdAutor() == idAutor) {
					return lista.get(i);
				}
			}

		return null;
	
	}
	
	public String update(long idAutor, Autor autor) {
		
		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getIdAutor() == idAutor) {
					lista.set(i, autor);
					return autor.getNomeAutor()+ " autor alterado com sucesso";
				}
			}

		return "não encontrado";
	}
	
	public boolean delete(long idAutor) {

		// banco de dados
		lista = this.listAll();

		if(lista != null)
			for(Autor autor : this.lista) {
				if(autor.getIdAutor() == idAutor) {
					this.lista.remove(autor);
					return true;
				}
			}

		return false;

	}
	*/
}
