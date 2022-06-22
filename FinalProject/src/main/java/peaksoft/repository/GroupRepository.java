package peaksoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import peaksoft.model.Group;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {
    @Query(value = "select s from Group s where s.dateOfStart > :start and s.dateOfFinish < :finish")
    List<Group> getByDates(@Param("start") LocalDate dateOfStart,
                           @Param("finish") LocalDate dateOfFinish);
}
