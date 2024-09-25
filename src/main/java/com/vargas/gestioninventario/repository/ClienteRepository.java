
package com.vargas.gestioninventario.repository;

import com.vargas.gestioninventario.entity.Cliente;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findByTipoDocumento_IdAndNumeroDocumento(Long tipoDocumentoId, String numeroDocumento);
}
