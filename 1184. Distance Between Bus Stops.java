class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if(start>destination)
        {
            int temp=start;
            start=destination;
            destination=temp;
        }

        int s=0;
        for(int i=start;i<destination;i++)
        {
            s+=distance[i];
        }

        int ts=0;
        for(int i:distance)
        {
            ts+=i;
        }
        return Math.min(s,ts-s);
    }
}
