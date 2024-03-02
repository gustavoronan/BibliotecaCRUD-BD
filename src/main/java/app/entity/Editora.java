package app.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Editora {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long idEditora;
	String nomeEditora;
	String enderecoEditora;
	String telefoneEditora;
	
	@OneToMany(mappedBy = "editora")
	private List<Livro> livro;
	
}
