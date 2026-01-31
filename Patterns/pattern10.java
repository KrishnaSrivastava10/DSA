class pattern9{
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        int st = n-1;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<st;j++){
                System.out.print("* ");
            }
            st--;
            System.out.println();
        }
}
