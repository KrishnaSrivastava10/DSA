class pattern7{
       for(int i=0;i<n;i++){
            int space=n/2+1;
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
}
