public class arrays {
    public static void main(String[] args) {
        // Single dimensional arrays
            // String names[] = new String [5];
            // names[0] ="ade";
            // names [1] = "temi";
            // names [2] = "david";
            // names [3] = "efe";
            // names [4] = "inyang";
             // or
        // String names[] = { "ade", "temi", "david", "efe", "inyang" };
        // for (int i = 0; i < names.length; i++) {
        //     System.out.println(names[i]);
        // }


        //  Multiple dimension arrays

       String food [][] = {  {"beans", "450"}, {"eba", "250"}, {"bread", "500"}};

       for( int i = 0; i < 3; i++) {
        for(int j = 0; j < 2; j++){
            System.out.println(food[i][j]);
        }
       }
    }
}