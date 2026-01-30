package ar.edu.utn.frba.ddsi.producto;

import ar.edu.utn.frba.ddsi.common.Saludador;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductoApplication {
    public static void main(String[] args) {
        Saludador saludador = new Saludador();
        System.out.println(saludador.saludar("Application de productos"));
        SpringApplication.run(ProductoApplication.class, args);
    }
}
