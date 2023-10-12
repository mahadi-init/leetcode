package easy

interface Problem {
    fun twoSum(nums: IntArray, target: Int): IntArray

    fun isPalindrome(x: Int): Boolean

    fun maxProfit(prices: IntArray): Int

    fun containsDuplicate(nums: IntArray): Boolean

    fun isAnagram(s: String, t: String): Boolean

    fun fib(n: Int): Int

    fun reverseWords(s: String): String

    fun search(nums: IntArray, target: Int): Int

    fun reverseString(s: CharArray)

    fun minDeletionSize(strs: Array<String>): Int

    fun sortedSquares(nums: IntArray): IntArray

    fun buildArray(nums: IntArray): IntArray

    fun getConcatenation(nums: IntArray): IntArray

    fun finalValueAfterOperations(operations: Array<String>): Int

    fun shuffle(
        nums: IntArray,
        n: Int
    ): IntArray

    fun runningSum(nums: IntArray): IntArray

    fun numIdenticalPairs(nums: IntArray): Int

    fun maximumWealth(accounts: Array<IntArray>): Int

    fun mostWordsFound(sentences: Array<String>): Int
}