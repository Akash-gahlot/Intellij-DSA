package com.binaryProblems;

public class nextletter {
    public static void main(String[] args) {
        char[] alphabets={'a','c','e','e','g','i','j','l','m','p'};
        char target='m';
        System.out.println(search(alphabets,target));

    }
    static char search(char[]  alphabets,char target){
        char value='a';
        int start=0;
        int end=alphabets.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>alphabets[mid]){
                start=mid+1;
            }

            else if(target<alphabets[mid]){
                value=alphabets[mid];
                end=mid-1;
            }
            else if(target==alphabets[mid]){
                start=mid+1;
            }


        }
        return value;
    }

}
