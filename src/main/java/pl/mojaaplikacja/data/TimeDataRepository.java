package pl.mojaaplikacja.data;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.mojaaplikacja.model.TimeData;

@Repository
public interface TimeDataRepository extends JpaRepository<TimeData, Long> {

}
