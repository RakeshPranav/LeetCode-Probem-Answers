class Solution {
    public String addBinary(String a, String b) {
       int s=a.length()-1;
       int t=b.length()-1;
       int carry=0;
       StringBuilder sb=new StringBuilder();
       while(s>=0 || t>=0 ||carry!=0){
         int sum=carry;
         if(s>=0){
            sum+=a.charAt(s)-'0';
            s--;
         }
         if(t>=0){
            sum+=b.charAt(t)-'0';
            t--;
         }
         sb.append(sum%2);
         carry=sum/2;
       }
       return sb.reverse().toString();
    }
}