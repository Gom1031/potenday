package project.Project1.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import project.Project1.Entity.consultboardEntity;

import java.util.List;

public interface consultboardRepository extends JpaRepository<consultboardEntity, Long> {
    Page<consultboardEntity> findAll(Pageable pageable);
    List<consultboardEntity> findByTitleContaining(String title);
    List<consultboardEntity> findByWriterContaining(String writer);
    List<consultboardEntity> findByContentContaining(String content);
    List<consultboardEntity> findByTitleContainingOrWriterContainingOrContentContaining(String title, String writer, String content);
}
