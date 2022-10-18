package layeredArchitectureProject.business;

import layeredArchitectureProject.core.logging.Logger;
import layeredArchitectureProject.dataAccess.InstructorDao;
import layeredArchitectureProject.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;

	public InstructorManager(InstructorDao instructorDao, Logger [] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
        
    }

	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		for (Logger logger : loggers) {
			logger.log(instructor.getInstructorId() + " " + instructor.getInstructorName() + " "
					+ instructor.getInstructorLastName() + "\n");
		}
	}
}
