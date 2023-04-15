package com.company;


    public class linear_search {
        static int linear(int[] arr,int search){
            for(int index=0;index<arr.length;index++){
                if(arr[index]==search){
                    return index;
                }

            }
            return -1;

        }

        public static void main(String[] Args) {
            // write your code here
            int[] arr={1,2,3,4,5,6};
            System.out.println(linear( arr,6));
        }
    }

