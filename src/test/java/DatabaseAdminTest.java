import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() { databaseAdmin = new DatabaseAdmin ("Hector", "AB212121B", 50000);}

    @Test
    public void salaryCanBeRaised() {
        databaseAdmin.raiseSalary(50000);
        { assertEquals(100000, databaseAdmin.getSalary());}}

    @Test
    public void bonusCanBePaid() {
        databaseAdmin.payBonus();
        {assertEquals(500, databaseAdmin.payBonus(), 0.1);
        }}
}
