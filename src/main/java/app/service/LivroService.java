package app.service;

import java.util.List;
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
	
	
	public List<Livro> listAll(){
		return this.livroRepository.findAll();
	}
	

	
	
	
public String update(long idLivro, Livro livro) {
	livro.setIdLivro(idLivro);
	this.livroRepository.save(livro);
	return livro.getTitulo() + " registro atualizado";
	}

public Livro findById(long idLivro) {
	Livro livro = this.livroRepository.findById(idLivro).get();
	return livro;
}

public String delete(long idLivro) {

	this.livroRepository.deleteById(idLivro);
	return  "livro deletado";

}
	
}
