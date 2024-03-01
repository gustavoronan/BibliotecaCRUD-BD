package app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Livro;
import app.repository.LivroRepository;

@Service
public class LivroService {


	@Autowired
	private LivroRepository livroRepository;
	
	public String save (Livro livro) {

		this.livroRepository.save(livro);
		return livro.getTitulo() + " livro salvo com sucesso";
	}
	
	
/*
	public List<Livro> listAll(){

		Livro livro = new Livro(1, "12345678", "Dom Casmurro", "Um clássico da literatura brasileira", 1899, 256);
		Livro livro2 = new Livro(2, "98765432", "A Culpa é das Estrelas", "Uma história emocionante sobre amor e perda", 2012, 318);
		Livro livro3 = new Livro(3, "13579246", "Harry Potter e a Pedra Filosofal", "O primeiro livro da saga Harry Potter", 1997, 223);

		lista.add(livro);
		lista.add(livro2);
		lista.add(livro3);

		return lista;

	}

	
	
	
public String update(long idLivro, Livro livro) {
		
		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getIdLivro() == idLivro) {
					lista.set(i, livro);
					return livro.getTitulo()+ " livro alterada com sucesso";
				}
			}

		return "não encontrado";
	}

public Livro findById(long idLivro) {

	// banco de dados
	lista = this.listAll();

	if(lista != null)
		for(int i=0; i<lista.size(); i++) {
			if(lista.get(i).getIdLivro() == idLivro) {
				return lista.get(i);
			}
		}

	return null;

}

public boolean delete(long idLivro) {

	// banco de dados
	lista = this.listAll();

	if(lista != null)
		for(Livro livro : this.lista) {
			if(livro.getIdLivro() == idLivro) {
				this.lista.remove(livro);
				return true;
			}
		}

	return false;

}
	*/
}
