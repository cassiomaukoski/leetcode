package com.cassiomaukoski.math.question9;

class Solution {
    public boolean isPalindrome(int x) {
        if(x <0){
            return false;
        }

        int normal = x;
        int reverse = 0;

        while (x != 0) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }

        return reverse == normal;
    }
}
