package pe.edu.upeu.orden.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.upeu.orden.dto.OrdenRequest;
import pe.edu.upeu.orden.dto.OrdenResponse;
import pe.edu.upeu.orden.entity.Orden;
import pe.edu.upeu.orden.exception.ResourceNotFoundException;
import pe.edu.upeu.orden.mapper.OrdenMapper;
import pe.edu.upeu.orden.repository.OrdenRepository;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrdenService {

    private final OrdenRepository repository;
    private final OrdenMapper mapper;

    public List<OrdenResponse> listar() {
        return repository.findAll().stream().map(mapper::toResponse).toList();
    }

    public OrdenResponse obtener(Long id) {
        return mapper.toResponse(buscarOFallar(id));
    }

    public OrdenResponse crear(OrdenRequest request) {
        Orden orden = mapper.toEntity(request);
        return mapper.toResponse(repository.save(orden));
    }

    public OrdenResponse actualizar(Long id, OrdenRequest request) {
        Orden orden = buscarOFallar(id);
        orden.setNombre(request.getNombre());
        orden.setDescripcion(request.getDescripcion());
        orden.setCliente(request.getCliente());
        orden.setTotal(request.getTotal());
        orden.setEstado(request.getEstado());
        return mapper.toResponse(repository.save(orden));
    }

    public void eliminar(Long id) {
        repository.delete(buscarOFallar(id));
    }

    private Orden buscarOFallar(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Orden no encontrada: " + id));
    }
}