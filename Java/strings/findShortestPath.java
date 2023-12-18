public class findShortestPath {
    public static float shortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            // south
            if (path.charAt(i) == 'S') {
                y--;
            }
            // north
            else if (path.charAt(i) == 'N') {
                y++;
            }
            // east
            else if (path.charAt(i) == 'E') {
                x++;
            } else {
                x--;
            }
        }
        int x2 = x * x, y2 = y * y;
        return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(shortestPath(path));
    }
}
