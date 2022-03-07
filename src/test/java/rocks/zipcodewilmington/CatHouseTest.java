package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @After //Had to add this because the expected and actual for the removal wasn't function properly based off add test. "Annotating a public void method with @After causes that method to be run after the Test method". source:http://junit.sourceforge.net/javadoc/org/junit/After.html#:~:text=Annotation%20Type%20After&text=If%20you%20allocate%20external%20resources,Test%20method%20throws%20an%20exception.
    public void tearDown() {
        CatHouse.clear();
    }

    @Test
    public void addCatTest(){
        //Given
        int expected = 1;

        //When
        Cat bibby = new Cat("bibby", new Date(4), 9);
        CatHouse.add(bibby);
        int actual = CatHouse.getNumberOfCats();

        //Then
        Assert.assertEquals( expected, actual);

    }

    @Test
    public void removeCatTest(){
        //Given
        int expected = 1;

        //When
        Cat slick = new Cat("slick", new Date(2), 1);
        Cat bibby = new Cat("bibby", new Date(4), 9);
        CatHouse.add(bibby);
        CatHouse.add(slick);
        CatHouse.remove(slick);
        int actual = CatHouse.getNumberOfCats();

        //Then
        Assert.assertEquals( expected, actual);

    }

    @Test
    public void removeCatIDTest(){
        //Given
        int expected = 1;

        //When
        Cat slick = new Cat("slick", new Date(2), 1);
        Cat bibby = new Cat("bibby", new Date(4), 9);
        CatHouse.add(bibby);
        CatHouse.add(slick);
        CatHouse.remove(1);
        int actual = CatHouse.getNumberOfCats();

        //Then
        Assert.assertEquals( expected, actual);
    }

    @Test
    public void getCatByIDTest(){
        //Given
        Cat expected = new Cat("roxi", new Date(2),3);

        //When
        CatHouse.add(expected);
        Cat actual = CatHouse.getCatById(3);

        //Then
        Assert.assertEquals( expected, actual);
    }

    @Test
    public void getNumberOfCatsTest(){
        //Given
        int expected = 2;

        //When
        Cat slick = new Cat("slick", new Date(2), 1);
        Cat bibby = new Cat("bibby", new Date(4), 9);
        CatHouse.add(bibby);
        CatHouse.add(slick);
        int actual = CatHouse.getNumberOfCats();

        //Then
        Assert.assertEquals( expected, actual);
    }






}
