package mx.edu.uacm.foto.controller;

import java.util.List;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.uacm.foto.domain.Foto;
import mx.edu.uacm.foto.message.request.FotoRequest;
import mx.edu.uacm.foto.repository.FotoRepository;
import mx.edu.uacm.foto.service.ServiceFoto;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value = { "/api" })
public class FotoController {
	public static final Logger log = LogManager.getLogger(FotoController.class);

	@Autowired
	private FotoRepository fotoRepository;

	@Autowired
	private ServiceFoto fotoService;

	@GetMapping("/foto")
	public List<FotoRequest> getAllFoto() {
		log.debug("_______________________________________________________");
		log.debug("-CON-----------------                        getAllFoto");

		return (List<FotoRequest>) fotoService.getAll();
	}

	@PostMapping("/foto")
	public Foto addFoto(@Valid @RequestBody FotoRequest foto) {
		log.debug("_______________________________________________________");
		log.debug("-CON-----------------                           addFoto");

		log.debug("Entra --> " + foto.toString());
		Foto foto2 = fotoService.add(foto);
		String aux = new String(foto2.getFoto());
		log.debug("Sale --> " + aux.substring(0, 15));
		return foto2;
	}

	@PutMapping("/foto")
	public Foto updateFoto(@Valid @RequestBody FotoRequest foto) {
		log.debug("_______________________________________________________");
		log.debug("-CON-----------------                        updateFoto");

		return fotoService.add(foto);
	}

	@DeleteMapping("/foto/{id}")
	public String deleteFoto(@PathVariable String id) {
		log.debug("_______________________________________________________");
		log.debug("-CON-----------------                        deleteFoto");

		return fotoService.delete(Long.parseLong(id));
	}
}
