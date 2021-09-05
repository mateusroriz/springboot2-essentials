package devdojo.springboot2.repository;

import devdojo.springboot2.domain.DevUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DevUserRepository extends JpaRepository<DevUser, Long> {

    DevUser findByUsername(String username);
}
