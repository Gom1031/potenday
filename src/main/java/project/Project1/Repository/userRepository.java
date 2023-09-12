package project.Project1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.Project1.Entity.userEntity;

public interface userRepository extends JpaRepository<userEntity, Long> {
    userEntity findByUsername(String username);
    userEntity findByEmail(String email);
}
