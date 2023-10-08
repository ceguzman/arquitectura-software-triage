package co.edu.poli.web.rest;

import co.edu.poli.domain.CategoriaTriage;
import co.edu.poli.repository.CategoriaTriageRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoriaTriageRest {

    private final CategoriaTriageRepository categoriaTriageRepository;

    public CategoriaTriageRest(CategoriaTriageRepository categoriaTriageRepository) {
        this.categoriaTriageRepository = categoriaTriageRepository;
    }

    @GetMapping("/nivel-triage")
    public ResponseEntity<List<CategoriaTriage>> getNivelTriage() {
        List<CategoriaTriage> listNivelTriage = (List<CategoriaTriage>) categoriaTriageRepository.findAll();
        return ResponseEntity.ok().body(listNivelTriage);
    }

    /**
	 * 
	 * @param categoriaTriage
	 */
	@PostMapping("/categoria-triage")
    public ResponseEntity<CategoriaTriage> insert(@RequestBody CategoriaTriage categoriaTriage) throws URISyntaxException {
        if (categoriaTriage.getId() != null) {
            return ResponseEntity.badRequest().build();
        } else {
            CategoriaTriage result = categoriaTriageRepository.save(categoriaTriage);
            return ResponseEntity.created(new URI("/api/categoria-triage" + result.getId()))
                    .body(result);
        }
    }

}
