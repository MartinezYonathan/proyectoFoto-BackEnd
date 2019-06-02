package mx.edu.uacm.foto.domain;

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
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FotoTest {
	public static final Logger log = LogManager.getLogger(FotoTest.class);

	
	@Test
	public void crearFoto() {
		log.debug("=======================================================");
		log.debug("-DOM-F---------------                         crearFoto");
		Optional<byte[]> imagen = toBinary("src/foto/foto.jpg");
		
		Foto foto = new Foto();
		foto.setNombre("Primer Imagen");
		foto.setDescripcion("Estas es una descripcion de foto");
		foto.setFoto(imagen.get());
		
		//log.debug(foto.toString());
		Assert.assertThat(foto, is(notNullValue()));
	}
	
	public static Optional<byte[]> toBinary(String path) {
	    int len = path.split("\\.").length;
	    String ext = path.split("\\.")[len - 1];
	    try {
	        BufferedImage img = ImageIO.read(new File(path));
	        ByteArrayOutputStream baos = new ByteArrayOutputStream();
	        ImageIO.write(img, ext, baos);
	        return Optional.of(baos.toByteArray());
	    } catch(IOException e) {
	        return Optional.empty();
	    }
	}

}
