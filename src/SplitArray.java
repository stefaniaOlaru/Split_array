import java.util.ArrayList;
import java.util.List;

public class SplitArray{
    //aceasta functie are rolul de a calcula suma elementelor dintr-un array
    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }


    public static boolean  splitArraySameAverage(int[] arr) {
        int n = arr.length;
        int s = sum(arr);
        //1<<n este echivalentul lui 2^n, iar 2^n este numarul de combinatii posibile, adica de submultimi care se pot forma
        //cu elementele din arr
        for (int i = 0; i < (1 << n); i++) {
            List<Integer> combination = new ArrayList<>();
            for (int j = 0; j < n; j++) {
              //daca elementul rezultatul este 1, inseamna ca elementul de pe pozitia j din arr trebuie adaugat in combinatie
                if((i/(int)Math.pow(2,j))%2 == 1){
                    combination.add(arr[j]);
                }
            }
            int[] combinationArray = new int[combination.size()];
            for (int k = 0; k < combination.size(); k++) {
                combinationArray[k] = combination.get(k);
            }
            int s1 = sum(combinationArray);
            //verificam formula pe care am dedus-o in document
            //ne asiguram ca se elimina cazul in care una dintre submutltimi este vida
            if( s1 == s*combinationArray.length/n && combinationArray.length != 0 && combinationArray.length != n){
                return true;
            }
        }
        return false;

    }
}
