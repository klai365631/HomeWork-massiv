public class Main {
    public static void main(String[] args) {

        // Задание 1,2
        int[] weight=new int[3];
        weight[0]=1;
        weight[1]=2;
        weight[2]=3;

        float[] weight2={1.57f, 7.654f, 9.986f};
        int[] weight3=new int[4];
        weight3[0]=10;
        weight3[1]=13;
        weight3[2]=15;
        weight3[3]=17;

        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if(i!= weight.length-1){
                System.out.print(", ");
            }

        }
        System.out.println();
        for (int i = 0; i < weight2.length; i++) {
            System.out.print(weight2[i]);
            if(i!= weight2.length-1){
                System.out.print(", ");
            }

        }
        System.out.println();
        for (int i = 0; i < weight3.length; i++) {
            System.out.print(weight3[i]);
            if (i!= weight3.length-1){
                System.out.print(", ");
            }

        }
        System.out.println();


        //Задание 3
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;

        float[] weight2 = {1.57f, 7.654f, 9.986f};
        int[] weight3 = new int[4];
        weight3[0] = 10;
        weight3[1] = 13;
        weight3[2] = 15;
        weight3[3] = 17;

        for (int i = weight.length-1;i>=0; i--) {
            System.out.print(weight[i]);
            if (i!= 0){
                System.out.print(", ");}
            }
        System.out.println();
        for (int i = weight2.length-1;i>=0; i--) {
            System.out.print(weight2[i]);
            if (i!= 0){
                System.out.print(", ");}
            }
        System.out.println();
        for (int i = weight3.length-1;i>=0; i--) {
            System.out.print(weight3[i]);
            if (i!= 0){
                System.out.print(", ");}
            }
        System.out.println();

        //Задание 4
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 == 1) {
                weight[i]++;
            }

            System.out.print(weight[i]);
            if (i!= weight.length-1) {
                System.out.print(", ");
            }


        }












    }
}