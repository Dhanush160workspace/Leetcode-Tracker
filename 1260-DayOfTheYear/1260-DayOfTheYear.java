// Last updated: 7/9/2026, 3:08:33 PM
class Solution {
    public int dayOfYear(String date) {
        String year = date.substring(0,4);
        String month = date.substring(5,7);
        String datee = date.substring(8,10);
        int Year = Integer.parseInt(year);
        int Month = Integer.parseInt(month);
        int Datee = Integer.parseInt(datee);
        boolean isLeap = false;
        int[] cal = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (((Year % 4 == 0) && (Year % 100 != 0)) || (Year%400 ==0)){
            isLeap = true;
        }
        int sum = 0;
        for (int i=0; i<Month-1; i++){
            if (isLeap && i==1) {
                sum+=29;
            } else {
                sum += cal[i];
            }
        }
        return (sum+Datee);
    }
}