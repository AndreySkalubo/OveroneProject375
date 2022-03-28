package overone.randomize.dao;

import overone.randomize.entity.Lesson;
import org.springframework.data.repository.CrudRepository;

public interface LessonRepository extends CrudRepository<Lesson, Integer> {
}
