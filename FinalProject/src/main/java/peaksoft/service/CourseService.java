package peaksoft.service;

import peaksoft.dto.request.CourseRequest;
import peaksoft.model.Course;
import peaksoft.dto.response.Response;

import java.util.List;

public interface CourseService {

    Response saveCourse(CourseRequest course, Long id);

    Response deleteById(Long id);

    Course getById(Long id);

    List<Course> findAllCourse();

    Response updateById(Long id, CourseRequest course);
}
