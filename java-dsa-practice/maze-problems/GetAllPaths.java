public class GetAllPaths {
    public static void main(String[] args) {
        int r = 3;
        int c = 3;

        System.out.println(getAllPaths(r, c, ""));
    }

    static String getAllPaths(int r, int c, String path) {

        if(r==1 && c==1)
            return path + "\n"; 
        
        String pathD = "";
        String pathR = "";


        if(r>1)
            pathD = getAllPaths(r-1, c, path +"D");
        
        if(c>1)
            pathR = getAllPaths(r, c-1, path + "R");

        return pathD + pathR;
    }
}