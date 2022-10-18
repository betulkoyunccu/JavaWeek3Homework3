package layeredArchitectureProject.dataAccess.jdbc;

import layeredArchitectureProject.dataAccess.CategoryDao;
import layeredArchitectureProject.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile veri tabanýna eklendi.");
		
	}

}
