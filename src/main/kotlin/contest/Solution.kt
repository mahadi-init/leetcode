package contest

class Solution : Problem {
    override fun differenceOfSums(n: Int, m: Int): Int {
        var num1 = 0
        var num2 = 0

        for (i in 1..n) {
            if (i % m != 0) {
                num1 += i
            } else {
                num2 += i
            }
        }

        return num1 - num2
    }

    override fun minProcessingTime(processorTime: List<Int>, tasks: List<Int>): Int {
        val k = 4
        val sortedProcessorTime = processorTime.sorted()
        val sortedTasks = tasks.sortedDescending()
        var result = 0

        for (i in sortedProcessorTime.indices) {
            for (j in 0..<k) {
                result = maxOf(result, sortedProcessorTime[i] + sortedTasks[i * k + j])
            }
        }
        return result
    }

    override fun minimumSum(nums: IntArray): Int {
        if (nums.size < 3) return -1

        var minSum = Int.MAX_VALUE

        for (i in 1..<nums.size - 1) {
            val currentNum = nums[i]

            for (j in 0..<i) {
                val numJ = nums[j]
                if (numJ < currentNum) {
                    for (k in i + 1..<nums.size) {
                        val numK = nums[k]
                        if (currentNum > numK) {
                            minSum = minOf(minSum, numJ + currentNum + numK)
                        }
                    }
                }
            }
        }

        return if (minSum == Int.MAX_VALUE) -1 else minSum
    }
}