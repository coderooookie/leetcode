public class Solution {
    public boolean canWinNim(int n) {
        int mod = n % 4;
        switch (mod){
        case 1 : case 2 : case 3:
            return true;
        default:
            return false;
        }
            
    }
}