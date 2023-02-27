public class Main {
    public static String mineralFormation(int[][] cave){
        boolean hasStalactites = false;
        boolean hasStalagmites = false;

        for (int i = 0; i < cave[0].length; i++) {
            if(1 == cave[0][i]) {
                hasStalactites = true;
            }
            if(1 == cave[cave.length-1][i]) {
                hasStalagmites = true;
            }
        }
        if(hasStalactites && hasStalagmites) {
            return "both";
        }
        if(hasStalactites){
            return "stalactites";
        }
        if(hasStalagmites) {
            return "stalagmites";
        }
        return null; //probably bad to return null but I'm crazy
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[][] arr = {
                {0, 1, 0, 1},
                {0, 1, 0, 1,},
                {0, 0, 0, 1},
                {0, 0, 0, 0}
        };

        System.out.println(mineralFormation(arr)); //"stalactites"

        int[][] arr2 = {
                {0, 0, 0, 0},
                {0, 1, 0, 1},
                {0, 1, 1, 1},
                {0, 1, 1, 1}
        };

        System.out.println(mineralFormation(arr2)); //"stalagmites"

        int[][] arr3 = {
                {1, 0, 1, 0},
                {1, 1, 0, 1},
                {0, 1, 1, 1},
                {0, 1, 1, 1}
        };

        System.out.println(mineralFormation(arr3)); //"both"
    }
}