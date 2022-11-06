 class  MaxFloatUC_2 {

        public static void testMaximum(Float a, Float b, Float c) {
            Float max = a;

            if (b.compareTo(a) > 0) {
                max = b;
            }
            if (c.compareTo(max) > 0) {
                max = c;
            }

            System.out.println("Maximum Number is: " + max);

        }


        public static void main(String[] args) {
            // TODO Auto-generated method stub


            Float a = 5.85f, b = 50.05f, c = 10.91f;

            testMaximum(a, b, c);
        }


    }
