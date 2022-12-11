public class HarmonicAverage {
    public static void main(String[] args) {
        double myList[]={1,2,3,4};
        double series=0.0;

        for(int i=0;i< myList.length;i++){

            series+=(1/myList[i]);
        }

        double average=(myList.length/series);
        System.out.println(average);

    }
}