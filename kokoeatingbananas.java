class Solution {
    public int minEatingSpeed(int[] piles, int h){
        int low = 1;
        int high = max(piles);

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long hrs = totalhrs(piles, mid);

            if (hrs <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public int max(int[] piles) {
        int maxi = piles[0];

        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > maxi) {
                maxi = piles[i];
            }
        }

        return maxi;
    }

    public long totalhrs(int[] piles, int hourly) {
        long totalhrs = 0;

        for (int i = 0; i < piles.length; i++) {
            totalhrs += (long) Math.ceil((double) piles[i] / hourly);
        }

        return totalhrs;
    }
}

        
