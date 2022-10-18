package layeredArchitectureProject.dataAccess.hibernate;

import layeredArchitectureProject.dataAccess.CategoryDao;
import layeredArchitectureProject.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veri tabanýna eklendi.");
		
	}

}
