class Solution {
    public int[] decimalRepresentation(int n) {

        List<Integer> ans = new ArrayList<>();

        int place =1;

        while(n > 0){
            int digit = n % 10;
            if(digit != 0){
                ans.add(digit * place);
            }
            n /=10;
            place *=10;
        }
        ans.sort(Collections.reverseOrder());

        int[] result = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            result[i] = ans.get(i);
        }
        return result;
    }
}
