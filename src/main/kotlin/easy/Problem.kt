package easy

interface Problem {
    fun twoSum(nums: IntArray, target: Int): IntArray //https://leetcode.com/problems/two-sum/submissions/1071537101/

    fun isPalindrome(x: Int): Boolean //https://leetcode.com/problems/palindrome-number/submissions/1071543158/

    fun maxProfit(prices: IntArray): Int //https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/1071546343/

    fun containsDuplicate(nums: IntArray): Boolean  //https://leetcode.com/problems/contains-duplicate/submissions/1071548613/

    fun isAnagram(s: String, t: String): Boolean  //https://leetcode.com/problems/valid-anagram/submissions/1071555140/

    fun fib(n: Int): Int  //https://leetcode.com/problems/fibonacci-number/submissions/1071557763/

    fun reverseWords(s: String): String  //https://leetcode.com/problems/reverse-words-in-a-string-iii/submissions/1071577552/

    fun search(nums: IntArray, target: Int): Int  //https://leetcode.com/problems/binary-search/submissions/1071582189/

    fun reverseString(s: CharArray)  //https://leetcode.com/problems/reverse-string/submissions/1071587097/

    fun minDeletionSize(strs: Array<String>): Int  //https://leetcode.com/problems/delete-columns-to-make-sorted/submissions/1071588507/

    fun sortedSquares(nums: IntArray): IntArray //https://leetcode.com/problems/squares-of-a-sorted-array/submissions/1072361229/

    fun buildArray(nums: IntArray): IntArray  //https://leetcode.com/problems/build-array-from-permutation/submissions/1072363223/

    fun getConcatenation(nums: IntArray): IntArray  //https://leetcode.com/problems/concatenation-of-array/submissions/1072542362/

    fun finalValueAfterOperations(operations: Array<String>): Int // https://leetcode.com/problems/final-value-of-variable-after-performing-operations/submissions/1072544722/

    fun shuffle(
        nums: IntArray,
        n: Int
    ): IntArray // https://leetcode.com/problems/shuffle-the-array/submissions/1073142188/

    fun runningSum(nums: IntArray): IntArray  //https://leetcode.com/problems/running-sum-of-1d-array/submissions/1073146560/

    fun numIdenticalPairs(nums: IntArray): Int //https://leetcode.com/problems/number-of-good-pairs/submissions/1073149341/

    fun maximumWealth(accounts: Array<IntArray>): Int //https://leetcode.com/problems/richest-customer-wealth/submissions/1073152733/

    fun mostWordsFound(sentences: Array<String>): Int  //https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/submissions/1073154687/
}