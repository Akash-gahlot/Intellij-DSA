package TCS;

public class Cruise_party {
    public static void main(String[] args) {
        int[] entry={3,5,2,0};
        int[] exit={0,2,4,4};
        System.out.println(Max_guest(entry,exit));
    }
    static int Max_guest(int[] entry,int[] exit){
        int max_guest=0;
        int guest_at_time=0;
        int prev_guest=0;
        for(int i=0;i<entry.length;i++){
            guest_at_time=entry[i]+prev_guest-exit[i];
            max_guest=Math.max(max_guest,guest_at_time);
            prev_guest=guest_at_time;
        }
        return max_guest;
    }
}
