package mx.edu.uacm.foto.service;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Optional;

import javax.imageio.ImageIO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import mx.edu.uacm.foto.domain.Foto;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceFotoTest {

	public static final Logger log = LogManager.getLogger(ServiceFotoTest.class);
//
//	@Autowired
//	private ServiceFoto serviceFoto;
//
//	@Test
//	public void add() {
//		log.debug("=======================================================");
//		log.debug("-SER-T---------------                               add");
//		
//		// Given
//		Foto foto = crearFoto();
//		
//		// When
//		Foto fotoReturn = serviceFoto.add(foto);
//		
//		// Then
//		log.debug("Foto guardada --> " + fotoReturn.toString());
//		Assert.assertThat(fotoReturn, is(notNullValue()));
//	}
//
//	@Test
//	public void update() {
//		log.debug("=======================================================");
//		log.debug("-SER-T---------------                            update");
//
//		// Given
//		Foto foto = crearFoto();
//		
//		// When
//		Foto fotoReturn = serviceFoto.add(foto);
//		log.debug("Foto guardada --> " + fotoReturn.toString());
//		fotoReturn.setNombre("Esta es una imagen editada");
//		Foto fotoReturnEditada = serviceFoto.add(fotoReturn);
//		
//		// Then
//		log.debug("Foto editada --> " + fotoReturn.toString());
//		Assert.assertThat(fotoReturnEditada, is(notNullValue()));
//	}
//
//	@Test
//	public void delete() {
//		log.debug("=======================================================");
//		log.debug("-SER-T---------------                            delete");
//
//		// Given
//		Foto foto = crearFoto();
//		
//		// When
//		Foto fotoReturn = serviceFoto.add(foto);
//		log.debug("Foto guardada --> " + fotoReturn.toString());
//		fotoReturn.setNombre("Esta es una imagen editada");
//		String fotoReturnEditada = serviceFoto.delete(fotoReturn.getId());
//		
//		// Then
//		log.debug("Foto Borrada --> " + fotoReturn.toString());
//		Assert.assertEquals("Borrado con exito", fotoReturnEditada);
//	}
//
//	public Foto crearFoto() {
//		Optional<byte[]> imagen = toBinary("src/foto/foto.jpg");
//
//		Foto foto = new Foto();
//		foto.setNombre("Primer Imagen");
//		foto.setDescripcion("Estas es una descripcion de foto");
//		foto.setFoto(imagen.get());
//
//		return foto;
//	}
//
//	public static Optional<byte[]> toBinary(String path) {
//		int len = path.split("\\.").length;
//		String ext = path.split("\\.")[len - 1];
//		try {
//			BufferedImage img = ImageIO.read(new File(path));
//			ByteArrayOutputStream baos = new ByteArrayOutputStream();
//			ImageIO.write(img, ext, baos);
//			return Optional.of(baos.toByteArray());
//		} catch (IOException e) {
//			return Optional.empty();
//		}
//	}

}
