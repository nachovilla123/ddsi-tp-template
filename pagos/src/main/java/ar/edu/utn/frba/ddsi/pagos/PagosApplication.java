package ar.edu.utn.frba.ddsi.pagos;

import ar.edu.utn.frba.ddsi.common.Saludador;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PagosApplication {
    public static void main(String[] args) {
        Saludador saludador = new Saludador();
        System.out.println(saludador.saludar("Aplicacion de pagos"));
        SpringApplication.run(PagosApplication.class, args);
    }
}
