package TCS;

public class String_Hash_star_Problem {
    public static void main(String[] args) {
        String val="####***";
        System.out.println(check_valid(val));

    }
    static int check_valid (String value){
        int hash_count=0;
        int star_count=0;
        for(int i=0;i<value.length();i++){
            if(value.charAt(i)=='#'){
                hash_count++;
            }
            else{
                star_count++;
            }
        }
        if(hash_count>star_count){
            return 1;
        }
        else if(star_count>hash_count){
            return -1;
        }
        return 0;
    }
}
