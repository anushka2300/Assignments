public class LCMGCD {
    
        static Long[] lcmAndGcd(Long A , Long B) {
            // code here
            Long ans[]=new Long[2];
            Long X=A,Y=B;
            while(A!=0){
                if(A>B) A=A%B;
                else{
                    Long temp=A;
                    A=B%A;
                    B=temp;
                }
            }
            ans[1]=B;
              ans[0]=(X*Y)/ans[1];
            return ans;
        }
    };

