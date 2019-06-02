package mx.edu.uacm.foto.service.imple;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.uacm.foto.domain.Foto;
import mx.edu.uacm.foto.message.request.FotoRequest;
import mx.edu.uacm.foto.repository.FotoRepository;
import mx.edu.uacm.foto.service.ServiceFoto;

@Service
public class ServiceFotoImple implements ServiceFoto {

	public static final Logger log = LogManager.getLogger(ServiceFotoImple.class);

	@Autowired
	private FotoRepository fotoRepository;

	@Override
	public Foto add(FotoRequest foto) {
		log.debug("_______________________________________________________");
		log.debug("-SER---------------------                           add");

		Foto newFoto = new Foto();
		newFoto.setNombre(foto.getNombre());
		newFoto.setDescripcion(foto.getDescripcion());
		newFoto.setFoto(foto.getFoto().getBytes());

		return fotoRepository.save(newFoto);
	}

	@Override
	public Foto update(FotoRequest foto) {
		log.debug("_______________________________________________________");
		log.debug("-SER---------------------                        update");
		
		Foto newFoto = new Foto();
		newFoto.setId(foto.getId());
		newFoto.setNombre(foto.getNombre());
		newFoto.setDescripcion(foto.getDescripcion());
		newFoto.setFoto(foto.getFoto().getBytes());
		return fotoRepository.save(newFoto);
	}

	@Override
	public String delete(Long id) {
		log.debug("_______________________________________________________");
		log.debug("-SER---------------------                        delete");

		fotoRepository.deleteById(id);
		return "Borrado con exito";
	}

	@Override
	public List<FotoRequest> getAll() {
		log.debug("_______________________________________________________");
		log.debug("-SER---------------------                        getAll");
		List<FotoRequest> fotoRequest = new ArrayList<FotoRequest>();
		FotoRequest f = null;
		for (Foto foto : fotoRepository.findAll()) {
			
			f = new FotoRequest();
			f.setId(foto.getId());
			f.setNombre(foto.getNombre());
			f.setDescripcion(foto.getDescripcion());
			String s = new String(foto.getFoto());
			log.debug("SaleService --> " + s.substring(0, 15));
			f.setFoto(s);
			log.debug(f.toString());
			fotoRequest.add(f);
		}
		return fotoRequest;
	}

}
