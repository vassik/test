package org.project1;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Project1Test {

    @Test
    public void shouldAnswerWithTrue()
    {
        Project1 project = new Project1();

        assertTrue(project.returnString("Hello").equals("Project1Hello"));
    }
}
