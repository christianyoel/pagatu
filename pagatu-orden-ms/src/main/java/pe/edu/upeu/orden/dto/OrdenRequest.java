package pe.edu.upeu.orden.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

@Getter @Setter
public class OrdenRequest {
    @NotBlank
    private String nombre;
    
    private String descripcion;
    
    @NotBlank
    private String cliente;
    
    @NotNull
    private BigDecimal total;
    
    @NotBlank
    private String estado;
}