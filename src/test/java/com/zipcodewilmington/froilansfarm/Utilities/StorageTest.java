package com.zipcodewilmington.froilansfarm.Utilities;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Farmer;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Housing.Storage;
import org.junit.Assert;
import org.junit.Test;

public class StorageTest {

    @Test
    public void testAddHorse(){
        Horse horse = new Horse();
        Storage stable = new Storage();

        stable.addHorse(horse);

        Assert.assertNotNull(stable);
    }

    @Test
    public void testAddChicken(){
        Chicken chicken = new Chicken();
        Storage ChickenCoop = new Storage();
        ChickenCoop.addChicken(chicken);

        Assert.assertNotNull(ChickenCoop);
    }

    @Test
    public void testAddPerson(){
        Farmer fred = new Farmer();
        Storage house = new Storage();

        house.addPerson(fred);
        Assert.assertNotNull(house);
    }

    @Test
    public void testSize(){
        int expected = 1;
        Farmer fred = new Farmer();
        Storage house = new Storage();
        house.addPerson(fred);

        Assert.assertEquals(expected, house.getFarmHouseSize());
    }
    @Test
    public void testChickenSize(){
        int expected = 2;
        Chicken chick1 = new Chicken();
        Chicken chick2 = new Chicken();
        Storage chickencoop = new Storage();
        chickencoop.addChicken(chick1);
        chickencoop.addChicken(chick2);

        Assert.assertEquals(expected, chickencoop.getChickenCoopSize());
    }

    @Test
    public void testHorseSize(){
        int expected = 3;
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        Horse horse3 = new Horse();

        Storage stable = new Storage();

        stable.addHorse(horse1);
        stable.addHorse(horse2);
        stable.addHorse(horse3);

        Assert.assertEquals(expected, stable.getStableSize());
    }

}
