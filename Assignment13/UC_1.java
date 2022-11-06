class MaxIntegerUC_1 {
        public static void testMaximum(Integer a, Integer b, Integer c) {
            Integer max = a;

            if(b.compareTo(a)>0){
                max = b;
            }
            if(c.compareTo(max)>0){
                max = c;
            }
            System.out.println("Maximum Number is = "+max);
        }

        public static void main(String[] args) {

            Integer a = 20, b = 100, c =10;

            testMaximum (a,b,c); //calling method
        }

}
