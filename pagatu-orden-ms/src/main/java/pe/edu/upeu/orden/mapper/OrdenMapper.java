package pe.edu.upeu.orden.mapper;

import pe.edu.upeu.orden.dto.OrdenRequest;
import pe.edu.upeu.orden.dto.OrdenResponse;
import pe.edu.upeu.orden.entity.Orden;
import org.springframework.stereotype.Component;

@Component
public class OrdenMapper {

    public Orden toEntity(OrdenRequest request) {
        return Orden.builder()
                .nombre(request.getNombre())
                .descripcion(request.getDescripcion())
                .cliente(request.getCliente())
                .total(request.getTotal())
                .estado(request.getEstado())
                .build();
    }

    public OrdenResponse toResponse(Orden orden) {
        return OrdenResponse.builder()
                .id(orden.getId())
                .nombre(orden.getNombre())
                .descripcion(orden.getDescripcion())
                .cliente(orden.getCliente())
                .total(orden.getTotal())
                .estado(orden.getEstado())
                .build();
    }
}