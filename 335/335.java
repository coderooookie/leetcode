class Solution {
public:
    bool isSelfCrossing(vector<int>& x) {
        
        auto leng=x.size();
        int test[4]={0},temp,i=0;
        if (leng<4) return false;
        if (leng=4) {
            test[0]=x[0];test[1]=x[1];test[2]=x[2];test[3]=x[3];
            if (test[0]>=test[2] && test[1]<=test[3])  return true;
            else return false;
        }
        if (leng=5){
             test[0]=x[1];test[1]=x[2];test[2]=x[3];test[3]=x[0]+x[4];
            if (test[0]>=test[2] && test[1]<=test[3])  return true;
            else return false;
        }
    }
};