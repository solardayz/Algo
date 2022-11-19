package datastructure;

import java.util.Arrays;

public class ArrayStudy {
    public static void main(String[] args) {

        Integer[] integers = new Integer[5];
        integers[0] = 0;

        integers = new Integer[]{0, 1, 2, 3, 5};
        Integer[] integer1 = {0,1,2};


        System.out.println("integer1 = " + integer1);
        System.out.println("integer1 = " + integer1.toString());
        System.out.println("Arrays.toString(integer1) = " + Arrays.toString(integer1));
        
        int[][][] ints = {
                {
                    {1,2,3},{4,5,6}
                },
                {
                    {11,22,33},{44,55,66}
                }
        };
        System.out.println("ints[0][0][2] = " + ints[0][0][2]);
        System.out.println("ints[1][2][3] = " + ints[1][0][1]);


        String[] cities = {
                "Alexander City"
                ,"Andalusia"
                ,"Anniston"
                ,"Athens"
                ,"Atmore"
                ,"Auburn"
                ,"Bessemer"
                ,"Birmingham"
                ,"Chickasaw"
                ,"Clanton"
                ,"Cullman"
                ,"Decatur"
                ,"Demopolis"
                ,"Dothan"
                ,"Enterprise"
                ,"Eufaula"
                ,"Florence"
                ,"Fort Payne"
                ,"Gadsden"
                ,"Greenville"
                ,"Guntersville"
                ,"Huntsville"
                ,"Jasper"
                ,"Marion"
                ,"Mobile"
                ,"Montgomery"
                ,"Opelika"
                ,"Ozark"
                ,"Phenix City"
                ,"Prichard"
                ,"Scottsboro"
                ,"Selma"
                ,"Sheffield"
                ,"Sylacauga"
                ,"Talladega"
                ,"Troy"
                ,"Tuscaloosa"
                ,"Tuscumbia"
                ,"Tuskegee"
                ,"Alaska"
                ,"Anchorage"
                ,"Cordova"
                ,"Fairbanks"
                ,"Haines"
                ,"Homer"
                ,"Juneau"
                ,"Ketchikan"
                ,"Kodiak"
                ,"Kotzebue"
                ,"Nome"
        };

        for (String city : cities) {
            if (city.startsWith("S")) {
                System.out.println("city = " + city);
            }
        }
    }
}
