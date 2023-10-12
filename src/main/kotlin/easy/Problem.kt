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

    fun differenceOfSum(nums: IntArray): Int

    fun romanToInt(s: String): Int

    fun detectCapitalUse(word: String): Boolean

    fun maximumCount(nums: IntArray): Int

    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean>

    fun decode(encoded: IntArray, first: Int): IntArray

    fun smallerNumbersThanCurrent(nums: IntArray): IntArray

    fun numJewelsInStones(jewels: String, stones: String): Int

    fun interpret(command: String): String
}