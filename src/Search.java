import java.util.ArrayList;

public class Search {

    // A. write a static method named linearSearch that returns the first index
    // a target int is found in an array of ints (both the target and int array
    // should be accepted as parameters); return -1 if target is not found
    // BE SURE TO USE EARLY RETURN (more efficient)

    public static int linearSearch(int num, int[] set){
        boolean false1 = false;
        for(int i = 0; i < set.length; i++ ){
            if(set[i] == num){
                false1 = true;
            }
            if(false1){
                return i;
            }
        }
        return -1;
    }


    // B. write a second static method that has the same parameters as linearSearch but
    // instead of returning an index, it returns true if target is found or false
    // if target is not found
    // AGAIN, BE SURE TO USE EARLY RETURN

    public static boolean linearSearch1(int num, int[] set){
        boolean false2 = false;
        for(int i = 0; i < set.length; i++ ){
            if(set[i] == num){
                return true;
            }
        }
        return false2;
    }




    // C. provide an OVERLOADED version of the linearSearch method that accepts an ArrayList
    // of Integers (rather than an array of ints) and a target int; return the first index
    // at which the target is found, or return -1 if target is not found
    // BE SURE TO USE EARLY RETURN


    public static boolean linearSearch1(int num, int[] set){
        boolean false2 = false;
        for(int i = 0; i < set.length; i++ ){
            if(set[i] == num){
                return true;
            }
        }
        return false2;
    }



    // D. provide another OVERLOADED version of the linearSearch method that accepts an array
    // of Strings and a target String; return the first index at which the target is found,
    // or return -1 if target is not found
    // BE SURE TO USE EARLY RETURN


    public static int linearSearch( String[] set, String str){
        boolean false1 = false;
        for(int i = 0; i < set.length; i++ ){
            if(set[i].contains(str)){
                false1 = true;
            }
            if(false1){
                return i;
            }
        }
        return -1;
    }


    // E. write a "linearSearchLast" method that accepts an array of ints and a
    // target int, and return the LAST index at which the target is found,
    // or return -1 if target is not found

    public static int linearSearchLast(int[] set, int num){
        int last=0;
        for(int i = 0; i < set.length; i++){
            if(set[i] == num){
                last = i;
            }
        }
        if(last != 0){
            return last;
        }
        else{
            return -1;
        }
    }








    // F. write two static "linearSearchCount" methods (both overloaded), one that
    // accepts an array of ints and a target int, and the other that accepts an ArrayList
    // of Integers and a target int.  Each method should return the NUMBER OF TIMES
    // the target appears in the array/ArrayList.

    public static int linearSearchCount(int[] set, int num){
        int all = 0;
        for(int i = 0; i < set.length; i++ ){
            if(set[i] == num){
                all++;
            }
        }
        return all;
    }

    public static int linearSearchCount(ArrayList<Integer> set, int num){
        int all = 0;
        for(int i = 0; i < set.size(); i++ ){
            if(set.get(i) == num){
                all++;
            }
        }
        return all;
    }


}