import java.util.*;
public class QueueReconstructionbyHeight {
    public int[][] reconstructQueue(int[][] people) {
        return sort(people);
        //return people;
    }
    
    public int[][] sort(int[][] people){

        // Sort the array in descending order is completed :
        Arrays.sort(people,new TempQueueReconstructionbyHeight());
        
        // Logic for Reconstruction the thing:
        int n = people.length;
        ArrayList<int[]> tmp = new ArrayList<>();
        for (int i = 0; i < n; i++)
            tmp.add(people[i][1], new int[]{people[i][0], people[i][1]});

        int[][] res = new int[people.length][2];
        int i = 0;
        for (int[] k : tmp) {
            res[i][0] = k[0];
            res[i++][1] = k[1];
        }
        
        return res;
        
    }
    
    
    public void print(int[][] people){
        for(int i=0; i<people.length;i++)
            System.out.println(people[i][0]);
    }
}

class TempQueueReconstructionbyHeight implements Comparator<int[]>{

	@Override
	 public int compare(int[] a, int[] b) {
        if (b[0] == a[0]) return a[1] - b[1];
            return b[0] - a[0];
    }
	
}