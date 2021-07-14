package br.com.eliel.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.eliel.domain.Anemometro;

@Repository
public interface AnemometroRepository extends JpaRepository<Anemometro, Long>{
    //Retorno atributoPesquisado(parametro de pesquisa)
	
	Anemometro getByVento(String VeloVento);
	 
	Anemometro getByUuid(String uuid);
	
	Anemometro getByregistroData(Date registroData);
	
		
}