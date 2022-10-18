package layeredArchitectureProject.dataAccess.hibernate;

import layeredArchitectureProject.dataAccess.CourseDao;
import layeredArchitectureProject.entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course category) {
		System.out.println("Hibernate ile veri tabanýna eklendi.");
		
	}

}
