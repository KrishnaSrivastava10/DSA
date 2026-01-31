class pattern9{
        for(int i=0;i<10/2;i++){
         
            for(int j=0;j<10/2-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<10/2;i++){
            
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*5-(2*i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
}
