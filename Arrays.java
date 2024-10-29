public class Arrays {
    public static void main (String []args){
        int[][] number = {{1,3,5,9,11},{2,4,6,8,10}};

        System.out.println(number[0][2]);

        number[0][2] = 10;
        System.out.println(number[0][2]);

        for (int i = 0; i < number.length; i++){
            for (int j = 0; j < number[i].length; j++){
                System.out.println("Loop Traversal: "+number[i][j]+ " ");
            }
            System.out.println();
        }   
    }
}
