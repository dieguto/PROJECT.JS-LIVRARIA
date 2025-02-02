package br.senai.sp.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senai.sp.api.model.Autor;
import br.senai.sp.api.repository.AutorRepository;

@RestController
@RequestMapping("/autores")
public class AutorResource {
	
	@Autowired
	private AutorRepository autorRepository;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping
	public List<Autor> getAutores(){
		return autorRepository.findAll(); 
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping
	public List<Autor> gravar(@Validated @RequestBody Autor autor) {
		Autor novoAutor = autorRepository.save(autor);
		// retorna todos os dados assim que salvar um novo dado
		return autorRepository.findAll();
	}

}
