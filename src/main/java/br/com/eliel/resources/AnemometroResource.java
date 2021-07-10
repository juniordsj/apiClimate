package br.com.eliel.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.eliel.domain.Anemometro;
import br.com.eliel.repository.AnemometroRepository;

@RestController
@RequestMapping("/api/v1/vel-vento")
public class AnemometroResource {
	
	private List<Anemometro> anemometro = new ArrayList<>();
	
	@Autowired
	private AnemometroRepository anemometroRepository;
	
	@PostMapping("/")
	public Anemometro anemometro(@RequestBody Anemometro anemometro) {
		return this.anemometroRepository.save(anemometro);
	}
	
	@GetMapping("/")
	public List<Anemometro> getPrec () {
		return this.anemometroRepository.findAll();
	}
	
	

}
