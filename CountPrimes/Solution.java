class Solution {
    public int countPrimes(int n) {
        
        if(n==0 || n==1|| n==2)
        {
            return 0;
        }
        
        else{
            int res=0;
            boolean count_prime[]=new boolean[n+1];
            for(int i=2;i<=n;i++){
              count_prime[i] = true;  
            }
            for(int i=2; i*i<=n;i++){
                if(count_prime[i]==true){
                    for(int j=i*i;j<=n;j+=i){
                        count_prime[j]=false;
                    }
                }
            }
            for(int i=2;i<n;i++){
                if(count_prime[i]==true){
                    res+=1;
                }
            }
            return res;
        }
        
    }
}
