public class array2d {
    public static void main(String[] args) {
        // 2d array = An array where each element is an array 
        //          Useful for storing a matrix of data

        String[] fruits = {"apple" , "orange" , "banana"};
        String[] vegetables = {"potato" ,"onion" , "carrot"};
        String[] meats = {"chicken" , "pork" , "beef" , "fish"};


        String[][] groceries = {fruits, vegetables, meats};

        groceries[0][0] = "pineapple";

        for(String[] foods : groceries){
            for(String food : foods){

                System.out.print(food+ " ");

            }
            System.out.println();
        }
    }   
}