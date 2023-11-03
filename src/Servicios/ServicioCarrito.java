package Servicios;

import Entidades.Producto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;

import Entidades.Carrito;
import Entidades.Persona;

public class ServicioCarrito {
	
public void play() {
	String archivoEntrada = "listaProd.csv"; //archivo a leer

	
	//String rutaAbsoluta = Paths.get(archivoEntrada).toAbsolutePath().toString();
	try {
	List<String> lista = Files.readAllLines(Paths.get(archivoEntrada)); //extraer en lista 
	String[] datosDeProducto1 = lista.get(1).split(","); //datosProducto -> [40 ,jabon ,123f] 
	String[] datosDeProducto2 = lista.get(2).split(","); 
	String[] datosDeProducto3 = lista.get(3).split(","); 
	
	//cargar c/dato a producto
	Producto p1 = new Producto(datosDeProducto1[1], datosDeProducto1[2],Float.parseFloat(datosDeProducto1[0]));
	Producto p2 = new Producto(datosDeProducto2[1], datosDeProducto2[2],Float.parseFloat(datosDeProducto2[0]));
	Producto p3 = new Producto(datosDeProducto3[1], datosDeProducto3[2],Float.parseFloat(datosDeProducto3[0]));
	
	Carrito carrito = new Carrito(p1,p2,p3, LocalDateTime.parse("2023-08-14T12:30:00"));
	Persona persona1 = new Persona ("Juan","Domingo",LocalDateTime.parse("2017-08-14T11:20:30"),carrito);
	
	Carrito miCarrito = persona1.getCarrito();
	float rdo = miCarrito.costoFinal();
	 
	System.out.println(rdo);

	}catch(IOException e) {
		
		
		System.out.println("Algo fallo: \n"+ e);
		
	}
}
	
	
}
