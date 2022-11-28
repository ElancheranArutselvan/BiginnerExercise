class Multidimenarrays {
    public static void main(String[] args) {
        int[][] data= { {5, 6, 7, 8}, {9, 10, 11, 12} };
        System.out.println(data[1][0]);
        for(int a = 0; a < data.length; a++){
            for(int b = 0; b < data[a].length; b++){
                System.out.print(data[a][b] + "\t");
            }
            System.out.println();
        }
        int[][] obj = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(obj[2][3]);
        System.out.println(obj.length);
        for(int c=0; c< obj.length; c++){
            for(int d=0; d< obj[c].length; d++){
                System.out.print(obj[c][d] + " ");
            }
            System.out.println();
        }
        int[][][] inp = {{{1, 2, 3}, {5, 6, 7}},{{9, 10, 11}, {13, 14, 15}}};
        System.out.println(inp[1][1][0]);
    }
}