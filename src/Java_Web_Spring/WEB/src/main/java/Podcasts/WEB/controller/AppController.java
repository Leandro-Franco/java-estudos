package Podcasts.WEB.controller;

import Podcasts.WEB.model.Entidade;
import Podcasts.WEB.model.EntidadeCreatDTO;
import Podcasts.WEB.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app")
public class AppController {
	private AppService service;

	public record EntidadeDTO(Long id, String name, String url) {}

	@Autowired
	public AppController(AppService service) {
		this.service = service;
	}

	@GetMapping
	public String getRoot(){
		return "on root";
	}

	@GetMapping("/{id}")
	public ResponseEntity<EntidadeDTO> getPodcast(@PathVariable Long id) {
		if (id > 90) {
			return ResponseEntity.notFound().build();
//			return ResponseEntity.status(HttpStatus.NOT_FOUND);
		}
		Entidade entidade = service.findEntidadeById(id);
		EntidadeDTO serviceDto = new EntidadeDTO(id, entidade.getName(), entidade.getUrl());
		return ResponseEntity.ok(serviceDto);
	}


	@GetMapping("/search")
	public String searchPodcast(@RequestParam String title) {
		return "Você buscou por Podcasts com o título: %s".formatted(title);
	}

	@PostMapping
	public  ResponseEntity<EntidadeDTO> createEntidade(@RequestBody EntidadeCreatDTO EntidadeCreatDTO){
		Entidade entidade = new Entidade();
		entidade.setName(EntidadeCreatDTO.name());
		entidade.setUrl(EntidadeCreatDTO.url());

		Entidade novaEntidade = service.novaEntidade(entidade);

		EntidadeDTO entidadeDTO = new EntidadeDTO(

				novaEntidade.getId(),

				novaEntidade.getName(),

				novaEntidade.getUrl()

		);

  return ResponseEntity.status(HttpStatus.CREATED).body(entidadeDTO);
	}
}
