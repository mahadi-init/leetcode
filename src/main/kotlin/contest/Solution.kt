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
}