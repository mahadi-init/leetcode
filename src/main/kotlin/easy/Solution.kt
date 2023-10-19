package easy

import java.util.*
import kotlin.collections.HashMap
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

        for (i in prices.indices) {
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
        val map = mutableMapOf<Int, Int>()

        for (i in nums.indices) {
            if (map.containsKey(nums[i])) {
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
        if (n <= 1) {
            return n
        }

        return fib(n - 1) + fib(n - 2)
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

    override fun sortedSquares(nums: IntArray): IntArray {
        val res = IntArray(nums.size)

        for (i in nums.indices) {
            res[i] = nums[i] * nums[i]
        }
        return res.sortedArray()
    }

    override fun buildArray(nums: IntArray): IntArray {
        val arr = IntArray(nums.size)

        for (i in nums.indices) {
            arr[i] = nums[nums[i]]
        }

        return arr
    }

    override fun getConcatenation(nums: IntArray): IntArray {
        return nums.plus(nums)
    }

    override fun finalValueAfterOperations(operations: Array<String>): Int {
        var count = 0

        for (i in operations.indices) {
            when (operations[i]) {
                "++X" -> count++
                "X++" -> count++
                "--X" -> count--
                "X--" -> count--
            }
        }

        return count
    }

    override fun shuffle(nums: IntArray, n: Int): IntArray {
        val list = mutableListOf<Int>()

        val x = nums.size / 2
        for (i in 0..<x) {
            list.add(nums[i])
            list.add(nums[i + n])
        }

        return list.toIntArray()
    }

    override fun runningSum(nums: IntArray): IntArray {
        val list = mutableListOf<Int>()

        var count = 0
        for (i in nums.indices) {
            count += nums[i]
            list.add(count)
        }

        return list.toIntArray()
    }

    override fun numIdenticalPairs(nums: IntArray): Int {
        var count = 0

        for (i in nums.indices) {
            for (j in i + 1..<nums.size) {
                if (nums[i] == nums[j]) {
                    count++
                }
            }
        }

        return count
    }

    override fun maximumWealth(accounts: Array<IntArray>): Int {
        var max = 0
        var count: Int

        for (i in accounts.indices) {
            count = 0

            accounts[i].forEach {
                count += it
            }

            if (count > max) {
                max = count
            }
        }

        return max
    }

    override fun mostWordsFound(sentences: Array<String>): Int {
        var max = 0

        sentences.map {
            val count = it.split(" ").size

            if (count > max) {
                max = count
            }
        }

        return max
    }

    override fun differenceOfSum(nums: IntArray): Int {
        var sum = 0
        var digitSum = 0

        nums.forEach { element ->
            sum += element

            digitSum += if (element <= 9) {
                element
            } else {
                val arr = element.toString().map { it.toString().toInt() }
                arr.sum()
            }
        }

        return abs(sum - digitSum)
    }

    override fun romanToInt(s: String): Int {
        var count = 0

        val map = mapOf(
            "I" to 1, "V" to 5, "X" to 10, "L" to 50,
            "C" to 100, "D" to 500, "M" to 1000,
            "IV" to 4, "IX" to 9, "XL" to 40,
            "XC" to 90, "CD" to 400, "CM" to 900
        )

        var i = s.length - 1
        while (i >= 0) {
            val str = if (i > 0) s.substring(i - 1, i + 1) else null
            if (map.containsKey(str)) {
                count += map[str]!!
                i -= 2
            } else {
                count += map[s[i].toString()]!!
                i--
            }
        }

        return count
    }

    override fun detectCapitalUse(word: String): Boolean {
        val u = word.uppercase(Locale.getDefault())
        val l = word.lowercase(Locale.getDefault())

        if (word == u || word == l) {
            return true
        }

        return word[0] == u[0] && word.substring(1) == l.substring(1)
    }

    override fun maximumCount(nums: IntArray): Int {
        var positive = 0
        var negative = 0

        for (num in nums) {
            if (num == 0) continue

            if (num > 0) {
                positive++
            } else {
                negative++
            }
        }

        return maxOf(positive, negative)
    }

    override fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val temp = candies.copyOf()
        temp.sort()

        val max = temp[temp.size - 1]
        val result = mutableListOf<Boolean>()

        for (item in candies) {
            result.add((item + extraCandies) >= max)
        }

        return result
    }

    override fun decode(encoded: IntArray, first: Int): IntArray {
        val result = mutableListOf(first)
        for (i in encoded.indices) {
            result.add(result[i] xor encoded[i])
        }
        return result.toIntArray()
    }

    override fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val result = IntArray(nums.size)

        for (i in nums.indices) {
            var count = 0
            for (j in nums.indices) {
                if (nums[i] > nums[j]) {
                    count++
                }
            }
            result[i] = count
        }

        return result
    }

    override fun numJewelsInStones(jewels: String, stones: String): Int {
        val map = mutableMapOf<Char, Char>()

        for (jewel in jewels) {
            map[jewel] = jewel
        }

        var count = 0
        for (stone in stones) {
            if (map.containsKey(stone)) {
                count++
            }
        }

        return count
    }

    override fun interpret(command: String): String {
        var str = ""

        var i = 0
        while (i < command.length) {
            when {
                command[i] == 'G' -> str += 'G'
                command[i] == '(' && command[i + 1] == ')' -> {
                    str += 'o'
                    i++
                }

                else -> {
                    str += "al"
                    i += 3
                }
            }
            i++
        }

        return str
    }

    override fun defangIPaddr(address: String): String {
        var value = ""

        address.toCharArray().map {
            if (it == '.') {
                value += "[.]"
            } else {
                value += it
            }
        }

        return value
    }
}