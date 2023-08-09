class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        if(purchaseAmount % 10 < 5){
            purchaseAmount-=(purchaseAmount%10);
        }
        else{
            purchaseAmount+=(10-(purchaseAmount%10));
        }
        return 100-purchaseAmount;
    }
}