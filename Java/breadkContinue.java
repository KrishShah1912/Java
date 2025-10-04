public class breadkContinue {
    public static void main(String[] args) {
        // break = break out of the loop
        // continue = skip current iteration of the loop (SKIP)

        int i;
        for(i=0;i<11;i++){
            
            // if(i==5){
            //     break;
            // }

            if(i==7){
                continue;
            }

            System.out.println(i);
        }
    }
}
