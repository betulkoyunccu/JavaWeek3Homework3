package layeredArchitectureProject.business;

import java.util.List;

import layeredArchitectureProject.core.logging.Logger;
import layeredArchitectureProject.dataAccess.CourseDao;
import layeredArchitectureProject.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;
	private List<Course> courses;

	public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}

	public void add(Course course) throws Exception {
		if (course.getCoursePrice() < 0) {
			throw new Exception("Kurs fiyatý 0'dan kücük olamaz");

		}
		for (Course cours : courses) {
			if (cours.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Kurs adi digerleriyle ayni olamaz ! ");
			}
		}
		courseDao.add(course);
		courses.add(course);
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}

	}
}
