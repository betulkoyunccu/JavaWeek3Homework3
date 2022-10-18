package layeredArchitectureProject.dataAccess.hibernate;

import layeredArchitectureProject.dataAccess.InstructorDao;
import layeredArchitectureProject.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor category) {
		System.out.println("Hibernate ile veri tabanýna eklendi.");

	}

}
