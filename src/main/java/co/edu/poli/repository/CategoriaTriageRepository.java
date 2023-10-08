package co.edu.poli.repository;

import co.edu.poli.domain.CategoriaTriage;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


@SuppressWarnings("unchecked")
@Repository
@Scope("singleton")
public interface CategoriaTriageRepository extends JpaRepository<CategoriaTriage, Long> {

    //List<CategoriaTriage> findAllByNivel();

}
