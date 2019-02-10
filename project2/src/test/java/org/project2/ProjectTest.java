package org.project2;

import org.junit.Test;
import org.project2.Project2;

import static org.junit.Assert.assertTrue;

public class ProjectTest {

    @Test
    public void shouldAnswerWithTrue()
    {
        Project2 project = new Project2();

        assertTrue(project.returnString("Hello").equals("Project2Hello"));
    }
}
