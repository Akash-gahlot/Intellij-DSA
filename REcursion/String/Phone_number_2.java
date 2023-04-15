/*
package REcursion.String;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {

    }
    static List<String> letterCombinations(String digits) {
        ArrayList<String> list=new ArrayList<>();
        return combination("",digits,list);
    }
   public ArrayList<String> combination(String PS,String                 UPS,ArrayList<String> list){
        if(UPS.isEmpty()){
            list.add(PS);
            return list;
        }
        int digit=UPS.charAt(0)-'1';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            combination(PS+ch,UPS.substring(1));
        }
        return list;

    }

}*/
