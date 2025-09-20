class Solution {
    public long solution(int k, int d) {
        long kLong = k;
        long dLong = d;
        long answer = 0;
        long dd = dLong*dLong;
        long kk = kLong*kLong;
        
        for(long a = 0; a*kLong<=dLong;a++){
            long x = a*kLong;
            long bound = dd-x*x;
            long boundSqrt = (long) Math.sqrt(bound);
            answer += (long) boundSqrt/kLong +1;
        }
        return answer;
    }
}