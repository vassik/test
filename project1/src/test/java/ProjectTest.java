import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ProjectTest {

    @Test
    public void shouldAnswerWithTrue()
    {
        Project project = new Project();

        assertTrue(project.returnString("Hello").equals("Project1Hello"));
    }
}
