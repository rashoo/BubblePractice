import java.util.Random;

public class BubblePractice {
    public static void main(String[] args) {

        Random randomNums = new Random();
        int[] array = new int[5];
        for(int i=0; i< array.length; i++){
             array[i] = randomNums.nextInt();
        }

        for(int arrayLength = array.length-1; arrayLength >0; arrayLength--){
            for(int currentElement = 0; currentElement < arrayLength; currentElement++ ){
                if(array[currentElement] > array[currentElement+1]){
                    swap(array, currentElement, currentElement+1);
                }
            }
        }
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i] +" |");
        }
    }

    public static void swap(int[] array, int currentElement, int nextElement){
        if(currentElement == nextElement){
            return;
        }
        int temp = array[currentElement];
        array[currentElement] = array[nextElement];
        array[nextElement] = temp;
    }
}