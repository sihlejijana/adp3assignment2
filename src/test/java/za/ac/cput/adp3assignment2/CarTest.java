package za.ac.cput.adp3assignment2;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    //Collection
    @Test
    void testCollectionAdd(){
        Collection yearModel = new LinkedHashSet();
        yearModel.add("2018 Ford");
        yearModel.add("2020 Mercedes");
        yearModel.add("2019 Volkswagen");
        yearModel.add("2019 BMW");

        System.out.println(yearModel);
        assertEquals(4,yearModel.size());
    }

    @Test
    void testCollectionRemove(){
        Collection yearModel = new LinkedHashSet();
        yearModel.add("2018 Ford");
        yearModel.add("2020 Mercedes");
        yearModel.add("2019 Volkswagen");
        yearModel.add("2019 BMW");

        yearModel.remove("2019 Volkswagen");
        yearModel.remove("2019 BMW");

        System.out.println(yearModel);
        assertEquals(2,yearModel.size());
    }

    @Test
    void testCollectionFind(){
        Collection yearModel = new LinkedHashSet();
        yearModel.add("2018 Ford");
        yearModel.add("2020 Mercedes");
        yearModel.add("2019 Volkswagen");
        yearModel.add("2019 BMW");

        if(yearModel.contains("2018 Ford")){
            System.out.println("2018 Ford");
        }

        assertEquals(4,yearModel.size());

    }

    //Map
    @Test
    void testMapAdd(){
        HashMap <String, String> carRegistration = new HashMap<String, String>();
        carRegistration.put("CA 754144", "2018 Ford, Blue");
        carRegistration.put("CA 125369", "2020 Mercedes, White");
        carRegistration.put("CA 255001", "2019 Volkswagen, Red");
        carRegistration.put("CA 121281", "2019 BMW, Black");

        System.out.println(carRegistration);
        assertEquals(4, carRegistration.size());
    }

    @Test
    void testMapRemove(){
        HashMap <String, String> carRegistration = new HashMap<String, String>();
        carRegistration.put("CA 754144", "2018 Ford, Blue");
        carRegistration.put("CA 125369", "2020 Mercedes, White");
        carRegistration.put("CA 255001", "2019 Volkswagen, Red");
        carRegistration.put("CA 121281", "2019 BMW, Black");

        carRegistration.remove("CA 125369");
        carRegistration.remove("CA 255001");

        System.out.println(carRegistration);
        assertEquals(2,carRegistration.size());
    }

    @Test
    void testMapFind(){
        HashMap <String, String> carRegistration = new HashMap<String, String>();
        carRegistration.put("CA 754144", "2018 Ford, Blue");
        carRegistration.put("CA 125369", "2020 Mercedes, White");
        carRegistration.put("CA 255001", "2019 Volkswagen, Red");
        carRegistration.put("CA 121281", "2019 BMW, Black");


        carRegistration.get("CA 754144");
        System.out.println(carRegistration.get("CA 754144"));
        assertEquals(4,carRegistration.size());

    }

    //Set
    @Test
    void testSetAdd(){
        HashSet<String> carColour = new HashSet<>();
        carColour.add("blue");
        carColour.add("white");
        carColour.add("red");
        carColour.add("black");

        System.out.println(carColour);
        assertEquals(4,carColour.size());
    }

    @Test
    void testSetRemove(){
        HashSet<String> carColour = new HashSet<>();
        carColour.add("blue");
        carColour.add("white");
        carColour.add("red");
        carColour.add("black");

        carColour.remove("red");
        carColour.remove("white");

        System.out.println(carColour);
        assertEquals(2,carColour.size());

    }

    @Test
    void testSetFind(){
        HashSet<String> carColour = new HashSet<>();
        carColour.add("blue");
        carColour.add("white");
        carColour.add("red");
        carColour.add("black");

        String actual = "";
        if(carColour.contains("blue")){
            actual = "blue";
            System.out.println("blue");
        }
        assertEquals("blue",actual);
    }

    //List
    @Test
    void testListAdd() {
        ArrayList<String> carModel = new ArrayList<>();
        carModel.add("Ford");
        carModel.add("Mercedes");
        carModel.add("Volkswagen");
        carModel.add("BMW");

        System.out.println(carModel);
        assertEquals(4,carModel.size());
    }

    @Test
    void testListRemove(){
        ArrayList<String>  carModel = new ArrayList<>();
        carModel.add("Ford");
        carModel.add("Mercedes");
        carModel.add("Volkswagen");
        carModel.add("BMW");

        carModel.remove("Volkswagen");
        carModel.remove("BMW");

        System.out.println(carModel);
        assertEquals(2, carModel.size());
        }

        @Test
        void testListFind(){
        ArrayList<String>  carModel = new ArrayList<>();
        carModel.add("Ford");
        carModel.add("Mercedes");
        carModel.add("Volkswagen");
        carModel.add("BMW");

            String actual = "";
            if(carModel.contains("Mercedes")){
                actual = "Mercedes";
                System.out.println("Mercedes");
            }
            assertEquals("Mercedes",actual);
        }
}