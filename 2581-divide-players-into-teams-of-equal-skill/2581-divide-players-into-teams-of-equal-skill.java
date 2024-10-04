class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n = skill.length ;
        int j = n -2;
        long ans = 0;
        int Skill = skill[0] + skill[n-1];
        ans = skill[0] * skill[n-1];
        // System.out.println(Arrays.toString(skill));
        for(int i = 1; i < skill.length / 2; i++,j--){
            if(skill[i]+skill[j] != Skill){
                return -1;
            }
            else{
                // System.out.println(skill[i]*skill[j] +" Chem: "+skill[i]+" & "+skill[j] );
                ans += (skill[i]*skill[j] );
            }
        }
        return ans;
    }
}