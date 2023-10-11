package easy

import kotlin.math.abs

class Solution : Problem {
    override fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()

        for (i in nums.indices) {
            val diff = target - nums[i]
            if (map.containsKey(target - nums[i])) {
                return intArrayOf(map[diff]!!, i)
            }
            map[nums[i]] = i
        }
        return intArrayOf()
    }

    override fun isPalindrome(x: Int): Boolean {
        val left = x.toString()
        val right = left.reversed()

        return left == right
    }

    override fun maxProfit(prices: IntArray): Int {
        var index = 0
        var min = prices[index]
        var maxDiff = 0

        for(i in prices.indices){
            if (prices[i] < min) {
                min = prices[i]
                index = i
            }

            if ((prices[index] - prices[i]) < maxDiff) {
                maxDiff = prices[index] - prices[i]
            }
        }

        return abs(maxDiff)
    }

    override fun containsDuplicate(nums: IntArray): Boolean {
        val map = mutableMapOf<Int,Int>()

        for (i in nums.indices){
            if(map.containsKey(nums[i])){
                return true
            }

            map[nums[i]] = i
        }

        return false
    }

    override fun isAnagram(s: String, t: String): Boolean {
        val s1 = s.toCharArray()
        val t1 = t.toCharArray()

        return s1.sorted() == t1.sorted()
    }

    override fun fib(n: Int): Int {
        if(n <= 1){
            return n
        }

        return fib(n-1) + fib(n-2)
    }

    override fun reverseWords(s: String): String {
        return s.split(' ').joinToString(" ") { it.reversed() }
    }

    override fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1

        while (left <= right) {
            val mid = (left + right) / 2

            when {
                nums[mid] == target -> return mid
                nums[mid] < target -> left = mid + 1
                else -> right = mid - 1
            }
        }

        return -1
    }

    override fun reverseString(s: CharArray) {
        var left = 0
        var right = s.size - 1

        while (left < right) {
            val temp = s[left]
            s[left] = s[right]
            s[right] = temp
            left++
            right--
        }
    }

    override fun minDeletionSize(strs: Array<String>): Int {
        var count = 0

        for (i in strs[0].indices) {
            for (j in 0..<strs.size - 1) {
                if (strs[j][i] > strs[j + 1][i]) {
                    count++
                    break
                }
            }
        }

        return count
    }
}