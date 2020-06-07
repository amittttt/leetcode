public class CoinChangeTwo {
    public int change(int amount, int[] coins) {
		int[][] cacheTable = new int[coins.length+1][amount+1];
		cacheTable[0][0]=1;  
        for(int row=1; row<=coins.length;row++) {
			cacheTable[row][0]=1;
			int coinValue = coins[row-1];
			for(int col=1;col<=amount;col++) {
				try {
					int withOutCoin = cacheTable[row-1][col];
					int withCoin =  coinValue<=col? cacheTable[row][col-coinValue]:0;
					cacheTable[row][col] = withCoin+withOutCoin;
				}catch(Exception ex){
					System.out.println(ex);
				}

			}
		}
        return cacheTable[coins.length][amount];
    }
}