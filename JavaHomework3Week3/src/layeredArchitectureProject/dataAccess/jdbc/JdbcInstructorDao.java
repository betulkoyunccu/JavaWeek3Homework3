package layeredArchitectureProject.dataAccess.jdbc;

import layeredArchitectureProject.dataAccess.InstructorDao;
import layeredArchitectureProject.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor category) {
		System.out.println("Jdbc ile veri tabanýna eklendi.");
		
	}

}
