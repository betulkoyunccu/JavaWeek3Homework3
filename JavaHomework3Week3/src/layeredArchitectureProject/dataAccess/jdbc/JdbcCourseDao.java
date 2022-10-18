package layeredArchitectureProject.dataAccess.jdbc;

import layeredArchitectureProject.dataAccess.CourseDao;
import layeredArchitectureProject.entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course category) {
		System.out.println("Jdbc ile veri tabanýna eklendi.");
		
	}

}
