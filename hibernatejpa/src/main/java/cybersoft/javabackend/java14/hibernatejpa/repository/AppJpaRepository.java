package cybersoft.javabackend.java14.hibernatejpa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cybersoft.javabackend.java14.hibernatejpa.model.App;

@Repository
public interface AppJpaRepository extends JpaRepository<App, String> {
	Optional<App> findByName(String name);
}
