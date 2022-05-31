package lab2;

public class SecdSmallElement {
		 public static void main(String args[]){
			      int num, size;
			      int array[] = {10, 20, 25, 63, 96, 57};
			      size = array.length;

			      for(int i = 0; i<size; i++ ){
			         for(int j = i+1; j<size; j++){
			            if(array[i]>array[j]){
			               num = array[i];
			               array[i] = array[j];
			               array[j] = num;
			            }
			         }
			      }
			      System.out.println("2nd Smallest element of the array is:: "+array[0]);
			   }
			}