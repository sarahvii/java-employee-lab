import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() { developer = new Developer ("Jim", "AB212121A", 50000);}

    @Test
    public void salaryCanBeRaised() {
        developer.raiseSalary(50000);
        { assertEquals(100000, developer.getSalary());}}

    @Test
    public void bonusCanBePaid() {
        developer.payBonus();
        {assertEquals(500, developer.payBonus(), 0.1);
        }}



}
