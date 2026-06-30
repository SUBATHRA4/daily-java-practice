
class pattern{
    public static void main(String[] args) {
    // for(int i=0;i<=2;i++){
    //     for(int j=0;j<=2;j++){
    //         System.out.print(i+""+j);                    output:00 01 02
    //         System.out.print(" ");                              10 11 12
    //     }                                                       20 21 22 
    //     System.out.println();
    // }

    //     for(int i=1;i<=5;i++){                          output:*****
    //     for(int j=1;j<=5;j++){                                 *****              
    //         System.out.print("*");                             *****      
    //     }                                                      *****              
    //     System.out.println();                                  *****
    // }

    // for(int i=1;i<=5;i++){                              output:11111
    //     for(int j=1;j<=5;j++){                                 22222      
    //         System.out.print(i);                               33333 
    //     }                                                      44444
    //     System.out.println();                                  55555
    // }
    //  System.out.print(j); output:12345 * 5 times  
    

    // for(int i=1;i<=5;i++){                             output:1
    //     for(int j=1;j<=i;j++){                                12
    //         System.out.print(j);                              123
    //  }                                                        1234           
    //     System.out.println();                                 12345
    // }
    //System.out.print(i); output:1 22 333 4444 55555



    // for (int i = 1; i <= 5; i++) {                     output:    *
    //         for (int j = i; j < 5; j++) {                        **
    //             System.out.print(" ");                          ***   
    //         }                                                  ****
    //         for (int k = 1; k <= i; k++) {                    *****   
    //             System.out.print("*");
    //         }
    //         System.out.println();
    // }


    
    // for (int i = 5; i >= 1; i--) {                   output:*****
    //         for (int j = 5; j > i; j--) {                    **** 
    //             System.out.print(" ");                        *** 
    //         }                                                  **
    //         for (int k = 1; k <= i; k++) {                      *
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

    }
}