package mx.edu.uacm.foto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import mx.edu.uacm.foto.domain.Foto;
import mx.edu.uacm.foto.message.request.FotoRequest;

@Service
public interface ServiceFoto {

	public Foto add(FotoRequest foto);

	public Foto update(FotoRequest foto);

	public String delete(Long id);
	
	public List<FotoRequest> getAll();
}
