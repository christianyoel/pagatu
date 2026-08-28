package pe.edu.upeu.orden.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

@Getter @Setter @Builder
public class OrdenResponse {
    private Long id;
    private String nombre;
    private String descripcion;
    private String cliente;
    private BigDecimal total;
    private String estado;
}