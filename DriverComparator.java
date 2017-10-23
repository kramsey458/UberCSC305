import java.util.*;

public class DriverComparator implements Comparator<Driver> {

    @Override
    public int compare(Driver driver, Driver otherDriver)
    {
        if (driver.getRank() < otherDriver.getRank())
        {
            return -1;
        }
        if (driver.getRank() > otherDriver.getRank())
        {
            return 1;
        }
        if (driver.getRank() == otherDriver.getRank()){
            if (driver.getRating().calculateRating() < otherDriver.getRating().calculateRating())
            {
                return 1;
            }
            if (driver.getRating().calculateRating() > otherDriver.getRating().calculateRating())
            {
                return -1;
            }
        }
        return 0;
    }
}
