// Last updated: 7/9/2026, 3:08:38 PM
class Solution {
    public String defangIPaddr(String address) {
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<address.length(); i++){
            if (address.charAt(i) == '.'){
                sb.append('[');
                sb.append('.');
                sb.append(']');
            } else {
                sb.append(address.charAt(i));
            }
        }
        String Sb = sb.toString();
        return Sb;
    }
}