package multi_dimension_array;
public class C07_mda {
    public static void main(String[] args) {
        /*
        soru 7) //Verilen bir multi dimensional array'in
        inner indexindeki elementlerinin ortalamasından
        büyük elementleri yazdıran bir kod yazınız.
         */
        int sayilar[][]={{3,2,1}, {4,5,1,9,5}, {6,7,8}};
        int ort=0;
        int sum=0;
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                sum+=sayilar[i][j];
                ort=sum/sayilar[i].length;

            }
            for (int j = 0; j < sayilar[i].length; j++) {
                if (ort<sayilar[i][j]){
                    System.out.println(sayilar[i][j]);
                }

            }
            sum=0;
            ort=0;

        }






    }
}
