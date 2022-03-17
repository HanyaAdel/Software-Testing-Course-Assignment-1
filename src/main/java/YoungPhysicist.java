import java.util.ArrayList;

public class YoungPhysicist {
    public boolean checkIfInEquilibrium(int n, ArrayList<ArrayList<Integer>> coordinates){
        int sumx = 0, sumy = 0, sumz = 0;
        for (int i = 0; i < n; i++){
            sumx = sumx + coordinates.get(i).get(0);
            sumy = sumy + coordinates.get(i).get(1);
            sumz = sumz + coordinates.get(i).get(2);
        }
        return (sumx == 0 && sumy == 0 && sumz == 0);
    }
}
