import java.util.*;

public class p9day5 {
    public static void main(String[] args) {
        int votes[] = {1, 2, 1, 3, 2, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        // count votes
        for (int v : votes) {
            map.put(v, map.getOrDefault(v, 0) + 1);
        }

        int maxVotes = 0;
        int winner = -1;

        // find candidate with max votes
        for (int candidate : map.keySet()) {
            int count = map.get(candidate);

            if (count > maxVotes) {
                maxVotes = count;
                winner = candidate;
            }
        }

        System.out.println("Winner is Candidate " + winner +
                           " with " + maxVotes + " votes");
    }
}