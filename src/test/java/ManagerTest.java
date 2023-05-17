import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before() { manager = new Manager ("Bob", "JL123456A", 100000, "Big Fancy"); }

    @Test
    public void salaryCanBeRaised() {
        manager.raiseSalary(50000);
    { assertEquals(150000, manager.getSalary());}}

    @Test
    public void bonusCanBePaid() {
        manager.payBonus();
        {assertEquals(1000, manager.payBonus(), 0.1);
    }}

}
