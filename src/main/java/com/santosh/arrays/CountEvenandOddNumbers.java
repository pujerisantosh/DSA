package com.santosh.arrays;

public class CountEvenandOddNumbers {

    public void EvenandOddNumbers(int[] arr){
        int evenCount = 0;
        int oddCount = 0;

        for (int i=0;i<arr.length;i++){


            if (arr[i]%2 == 0){

                evenCount++;
            }

            else {
                oddCount++;
            }
        }



    }

    static void main(String[] args) {


        int[] arr = {1,2,3,4,5,6,7,8};

        CountEvenandOddNumbers obj = new CountEvenandOddNumbers();

        obj.EvenandOddNumbers(arr);
    }
}
