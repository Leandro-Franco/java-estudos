package Podcasts.WEB.service;

import Podcasts.WEB.model.Entidade;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class AppService {

	/**
		* Serve o objeto por ID
		* @param id
		* @return
		*/
	public Entidade findEntidadeById(Long id) {
		Entidade entidade = new Entidade();

		entidade.setId(id);
		entidade.setName("nome");
		entidade.setUrl("url.com.br");
		entidade.setSecret("super-secret-token-123");

		return entidade;
	}

	public Entidade novaEntidade(Entidade entidade) {
		Entidade novaEntidade = new Entidade();

		novaEntidade.setId(new Random().nextLong(0,90));
		novaEntidade.setName(entidade.getName());
		novaEntidade.setUrl(entidade.getUrl());
		return novaEntidade;
	}
}
