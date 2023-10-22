package contest

interface Problem {
    fun differenceOfSums(n: Int, m: Int): Int

    fun minProcessingTime(processorTime: List<Int>, tasks: List<Int>): Int

    fun minimumSum(nums: IntArray): Int
}