import java.util.*;

class TwoCityScheduling {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,new Temp());
		int ans=0;
		int n = costs.length/2;
		for(int i=0;i<n;i++) 
			  ans += costs[i][1] + costs[i+n][0];
		
		return ans;
    }
}

class Temp implements Comparator<int[]>{

	@Override
	public int compare(int[] a, int[] b) {
		if(a[1]-a[0] > b[1]-b[0])
			return 1;
		return -1;
	}
	
}