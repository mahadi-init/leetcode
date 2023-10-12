package medium

class Solution : Problem {
    override fun maxIceCream(costs: IntArray, coins: Int): Int {
        val arr = costs.sorted()

        var count = 0
        var remainingCoins = coins

        for (i in arr) {
            if (remainingCoins >= i) {
                remainingCoins -= i
                count++
            } else {
                break
            }
        }

        return count
    }

    override fun maxIncreaseKeepingSkyline(grid: Array<IntArray>): Int {
        val rowMax = grid.map { it.maxOrNull()!! }
        val colMax = (0..<grid[0].size).map { j -> grid.maxOf { it[j] } }

        var sum = 0
        for (i in grid.indices) {
            for (j in grid[i].indices) {
                sum += minOf(rowMax[i], colMax[j]) - grid[i][j]
            }
        }
        return sum
    }

    override fun findMinArrowShots(points: Array<IntArray>): Int {
        points.sortBy { it[1] }

        var ans = 1
        var bound = points[0][1]

        for (i in 1..<points.size) {
            if (points[i][0] > bound) {
                bound = points[i][1]
                ans++
            }
        }

        return ans
    }

    override fun minimumRounds(tasks: IntArray): Int {
        var count = 0
        val map = mutableMapOf<Int, Int>()

        for (x in tasks) {
            map[x] = (map[x] ?: 0) + 1
        }

        for (x in map.keys) {
            if (map[x] == 1) {
                return -1
            } else {
                count += map[x]!! / 3
                if (map[x]!! % 3 != 0) {
                    count++
                }
            }
        }

        return count
    }
}