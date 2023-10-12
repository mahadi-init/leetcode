package medium

interface Problem {
    fun maxIceCream(costs: IntArray, coins: Int): Int

    fun maxIncreaseKeepingSkyline(grid: Array<IntArray>): Int

    fun findMinArrowShots(points: Array<IntArray>): Int

    fun minimumRounds(tasks: IntArray): Int
}