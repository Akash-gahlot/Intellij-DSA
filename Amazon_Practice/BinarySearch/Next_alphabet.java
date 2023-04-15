package Amazon_Practice.BinarySearch;

public class Next_alphabet {
    public static void main(String[] args) {
        char[] alphabets={'a','c','e','e','g','i','j','l','m','p'};
        char target='k';
        System.out.println(search(alphabets,target));

    }
    static char search(char[] alphabets,char target){
        int start=0;
        int end= alphabets.length-1;
        char next_alphabet='a';
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>alphabets[mid]){
                start=mid+1;
            }
            else if(target<alphabets[mid]){
                next_alphabet=alphabets[mid];
                end=mid-1;
            }
            else if(target==alphabets[mid]){
                return alphabets[mid];
            }

        }
        return next_alphabet;
    }
}
