import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

//
import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @Before
    public void creteList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(listSize+1,list.getCount());
    }

//    @Test
//    public void hasCityTest(){
//        City city = new City("Vancouver", "BC");
//        list.addCity(city);
//        assertTrue(list.hasCity(city));
//    }
//
//    @Test
//    public void deleteCityTest(){
//        City city = new City("Vanciyver", "BC");
//        list.addCity(city);
//        list.deleteCity(city);
//        assertFalse(list.hasCity(city));
//    }
//
//    @Test
//    public void countCities(){
//        list.addCity(new City("Halifax","NS"));
//        list.addCity(new City("Vancouver","BC"));
//        list.addCity(new City("Edmonton","AB"));
//        assertEquals(list.countCities(), 3);
//    }
}
