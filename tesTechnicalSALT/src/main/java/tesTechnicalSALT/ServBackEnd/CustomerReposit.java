package tesTechnicalSALT.ServBackEnd;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerReposit extends JpaRepository<UserData, Long> {
}
