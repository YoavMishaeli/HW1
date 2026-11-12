public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i==j){
            return 0;
        }
        int n = m.length;
        int[] minDist = new int[n];

        for (int k = 0; k < n; k++) {
            minDist[k] = Integer.MAX_VALUE;//לוקחים את הערך המקסימלי בתור המינימום ההתחלתי
        }
        //רקורסיה שמוצאת את המסלול הקצר ביותר
        findPathRecursive(m, i, j, 0, minDist);
        if (minDist[j] != Integer.MAX_VALUE) {
            return minDist[j];
        }
        return -1;
    }

    private static void findPathRecursive(int[][] m, int current, int target, int currentDist, int[] minDist) {
        if (currentDist < minDist[current]) {
            minDist[current] = currentDist;
            
            // ממשיכים להסתעף לשכנים רק אם עדיין לא הגענו ליעד
            if (current != target) {
                for (int neighbor = 0; neighbor < m.length; neighbor++) {
                    if (m[current][neighbor] == 1) {
                        findPathRecursive(m, neighbor, target, currentDist + 1, minDist);
                    }
                    }
        }
    }
}

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}