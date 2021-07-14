package br.com.eliel.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.eliel.domain.Anemometro;
import br.com.eliel.repository.AnemometroRepository;

@RestController
@RequestMapping("/api/v2/vel-vento")
public class AnemometroResource {
	
	@Autowired
	private AnemometroRepository repository;
	
	@GetMapping(value = "/{uuid}")
	public ResponseEntity<Anemometro> buscarPorUuid(@PathVariable String uuid) {	
    return ResponseEntity.
    					status(HttpStatus.OK).
    					body( repository.getByUuid(uuid) );
	}
	@PostMapping()
	public ResponseEntity<Anemometro> salvarAnemometro(@RequestBody Anemometro p) {
	return ResponseEntity.
						status(HttpStatus.OK).
						body( this.repository.save(p) );
	}
	

}
