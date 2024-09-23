package homework3;

public class MainEx2 {
    /*
     * Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, 
     * если они одинаковые, и false в противном случае. 
     * Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа по парно по индексам.
     */

     public static <T> boolean compareArrays(T[] array1, T[] array2){
        if(!array1.getClass().equals(array2.getClass())){
            return false;
        }
        if (array1.length != array2.length){
            return false;
        }
        return true;
    }    

    public static void main(String[] args) {
        Integer [] a = {1, 0, 3};
        Integer [] b = {0, 8, 4};
        String [] c = {"Hello", "goodbuy"};
        String [] d = {"Yo", "No", "Yes"};;
        String [] e = {"No", "Yes"};

        boolean test1 = compareArrays(a, b);
        boolean test2 = compareArrays(c, e);
        boolean test3 = compareArrays(a, c);
        boolean test4 = compareArrays(c, d);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
    }

    
    
}
