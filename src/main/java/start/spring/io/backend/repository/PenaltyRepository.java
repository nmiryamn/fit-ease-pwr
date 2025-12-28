package start.spring.io.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import start.spring.io.backend.model.Penalty;

/**
 * JPA repository for the Penalty entity.
 * Provides basic CRUD operations.
 */
public interface PenaltyRepository extends JpaRepository<Penalty, Integer> {
    
}
