import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetAllPaths {
    public static void main(String[] args) {
        int r = 3;
        int c = 3;

        boolean[][] visited = new boolean[r][c];

        int[][] path = new int[r][c];

        List<String> paths = new ArrayList<>(getAllPaths(0, 0, "", 1, path, visited));

        for (String i : paths)
            if (i.length() > 0)
                System.out.println(i);
    }

    // Return String coontaining of all paths, seperated by \n --->

    // static String getAllPaths(int r, int c, String path) {

    // if (r == 1 && c == 1)
    // return path + "\n";

    // String pathD = "";
    // String pathR = "";

    // if (r > 1)
    // pathD = getAllPaths(r - 1, c, path + "D");

    // if (c > 1)
    // pathR = getAllPaths(r, c - 1, path + "R");

    // return pathD + pathR;
    // }

    // Return an ArrayList of all paths, Deigonal move included --->

    // static List<String> getAllPaths(int r, int c, String path) {
    // if (r == 1 && c == 1)
    // return new ArrayList<String>(Arrays.asList(path));

    // List<String> ans = new ArrayList<>();

    // if (r > 1)
    // ans.addAll(getAllPaths(r - 1, c, path + " D"));

    // if (c > 1)
    // ans.addAll(getAllPaths(r, c - 1, path + " R"));

    // if (r > 1 && c > 1)
    // ans.addAll(getAllPaths(r - 1, c - 1, path + " d"));

    // return ans;
    // }

    // All Directions included --->

    static List<String> getAllPaths(int r, int c, String direction, int count, int[][] path, boolean[][] visited) {
        path[r][c] = count;
        
        if (r == visited.length - 1 && c == visited[0].length - 1){
            
            System.out.println("\n" + direction);
            for(int [] i : path)
                System.out.println(Arrays.toString(i));

            return new ArrayList<String>(Arrays.asList(direction));
        }

        List<String> ans = new ArrayList<>();

        if (visited[r][c])
            return new ArrayList<String>(Arrays.asList(""));

        visited[r][c] = true;


        if (r < visited.length - 1)
            ans.addAll(getAllPaths(r + 1, c, direction + "D ", count + 1, path, visited));

        if (c < visited[0].length - 1)
            ans.addAll(getAllPaths(r, c + 1, direction + "R ", count + 1, path, visited));

        if (c < visited[0].length - 1 && r < visited.length - 1)
            ans.addAll(getAllPaths(r + 1, c + 1, direction + "d ", count + 1, path, visited));

        if (r > 1)
            ans.addAll(getAllPaths(r - 1, c, direction + "U ", count + 1, path, visited));

        if (c > 1)
            ans.addAll(getAllPaths(r, c - 1, direction + "L ", count + 1, path, visited));

        visited[r][c] = false;
        path[r][c] = 0;

        return ans;
    }
}