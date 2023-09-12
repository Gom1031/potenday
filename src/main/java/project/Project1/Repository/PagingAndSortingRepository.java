package project.Project1.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.Project1.Entity.consultboardEntity;

//consultboard 테이블을 페이징하는 메서드
@Repository
public interface PagingAndSortingRepository extends JpaRepository<consultboardEntity, Long> {
    Page<consultboardEntity> findAll(Pageable pageable);
}
