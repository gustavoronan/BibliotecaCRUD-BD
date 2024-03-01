package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import app.entity.Editora;

@Service
public class EditoraService {

List<Editora> lista = new ArrayList<>();
	
	public String save (Editora editora) {
		lista.add(editora);
		return editora.getNomeEditora() + " editora salvo com sucesso";
	}
	
	public List<Editora> listAll(){

		Editora editora = new Editora(1, "livros", "rua 1", "0102301203");
		Editora editora2 = new Editora(2, "machados", "rua 2", "123912399123");
		Editora editora3 = new Editora(3, "darkside", "rua 3", "129394941231");

		lista.add(editora);
		lista.add(editora2);
		lista.add(editora3);

		return lista;

	}
	
	public Editora findById(long idEditora) {

		// banco de dados
		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getIdEditora() == idEditora) {
					return lista.get(i);
				}
			}

		return null;
	
	}
	
	public String update(long idEditora, Editora editora) {
		
		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getIdEditora() == idEditora) {
					lista.set(i, editora);
					return editora.getNomeEditora()+ " editora alterada com sucesso";
				}
			}

		return "não encontrado";
	}
	
	public boolean delete(long idEditora) {

		// banco de dados
		lista = this.listAll();

		if(lista != null)
			for(Editora editora : this.lista) {
				if(editora.getIdEditora() == idEditora) {
					this.lista.remove(editora);
					return true;
				}
			}

		return false;

	}
	
}
