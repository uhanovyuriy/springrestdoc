package smartjava.domain.topic;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TopicRepository extends JpaRepository<Topic, Long>{

    Optional<Topic> findOne(long id);

}