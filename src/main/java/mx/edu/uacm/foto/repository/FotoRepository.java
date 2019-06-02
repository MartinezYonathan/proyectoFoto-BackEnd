package mx.edu.uacm.foto.repository;

import org.springframework.data.repository.CrudRepository;

import mx.edu.uacm.foto.domain.Foto;

public interface FotoRepository extends CrudRepository<Foto, Long> {

}
