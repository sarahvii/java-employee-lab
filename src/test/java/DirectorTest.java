import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() { director = new Director ("Elvis", "JL438273A", 5000000, "All Departments", 20);}

    @Test
    public void salaryCanBeRaised() {
        director.raiseSalary(1);
        { assertEquals(5000001, director.getSalary());}}

    @Test
    public void bonusCanBePaid() {
        director.payBonus();
        {assertEquals(50000, director.payBonus(), 0.1);
        }}

    @Test
    public void canGetBudget() {
        {assertEquals(20, director.getBudget(), 0.0);

    }

}}
