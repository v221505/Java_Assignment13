 class MaxStringUC_3 {

        public static void testMaximum(String a, String b, String c) {
            String max = a;

            if(b.compareTo(a)>0){
                max = b;
            }
            if(c.compareTo(max)>0){
                max = c;
            }

            System.out.println("Maximum String is: "+max);

        }

        public static void main(String[] args) {
            String a = "Animal", b = "Vishwajeet" , c = "Ram";
            testMaximum (a,b,c);
        }


}
