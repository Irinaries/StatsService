import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.StatsService.services.StatsService;

public class StatsServiceTest {
    @Test
    public void sumSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;

        long actual = service.sumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180 / 12;

        long actual = service.average(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void monthMaximumTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;

        long actual = service.monthMaximum(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthMinimumTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 9;

        long actual = service.monthMinimum(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthsBellowAverageTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;

        long actual = service.monthsBellowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthsAboveAverageTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;

        long actual = service.monthsAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

}
