import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ProjectTest {

    @Test
    public void shouldAnswerWithTrue()
    {
        Project3 project = new Project3();

        assertTrue(project.returnString("Hello").equals("Project3Hello"));
    }
}
