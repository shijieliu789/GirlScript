public class Arrays {

    public static void main(String[] args){
        int[] x;
        x = new int[10];

        int[] arr = new int[10];
        arr[0] = 20;

        int[] smallArray = new int[]{2,4,6,8,10};

//        System.out.print("{");
//        for (int i =1; i<=x.length; i++){
//           x[i-1] = i*10;
//            System.out.print(x[i-1]+" ");
//        }
//        System.out.print("}");

//        System.out.print("{");
//        int j=0;
//        while (j < x.length){
//            x[j] = j*3;
//            System.out.print(x[j]+" ");
//            j++;
//        }
//        System.out.print("}");

//        System.out.print("{");
//        int position=0;
//        do {
//            x[position] = position + 15;
//            System.out.print(x[position] + " ");
//            position++;
//        }while (position < 1);
//        System.out.print("}");

        int num = 10;
        int[] sumArr = new int[10];
        for(int i =1; i <= 10; i++){
            sumArr[i-1] = num * i;
            System.out.printf("%d * %d = %d", num, i, sumArr[i-1]);
            System.out.println("");
        }

        System.out.print("{");
        int j=0;
        while(j < sumArr.length){
            System.out.print(sumArr[j] + " ");
            j++;
        }
        System.out.print("}");
   }
}
