package br.com.eliel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnemometroRepository extends JpaRepository<Anemometro, Long>{
    //Retorno atributoPesquisado(parametro de pesquisa)
	
	Anemometro getByVento(String VeloVento);
	 
	Anemometro getByUuid(String uuid);
	
	Anemometro getByData(Date registroData);
	
		
}