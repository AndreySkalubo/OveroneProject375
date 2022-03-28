package overone.randomize.service;

import overone.randomize.entity.Lesson;
import overone.randomize.entity.dto.LessonDto;
import org.springframework.stereotype.Service;

@Service
public class LessonMapperImpl {

    public Lesson toEntity(LessonDto lessonDto) {
        Lesson lesson = new Lesson();
        lesson.setId(lessonDto.getId());
        lesson.setDate(lessonDto.getDate());
        lesson.setStudents(lessonDto.getStudents());
        return lesson;
    }
}
