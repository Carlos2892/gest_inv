package com.vargas.gestioninventario.repository;

import com.vargas.gestioninventario.entity.DetalleCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleCompraRepository extends JpaRepository<DetalleCompra, Long> {
    void deleteByCompraId(Long compraId);
}
