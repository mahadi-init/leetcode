class ArrayWrapper {
    arr: number[]

    constructor(nums: number[]) {
        this.arr = nums
    }

    valueOf(): number {
        let count = 0
        this.arr.map((i) => {
            count += i
        })

        return count
    }

    toString(): string {
        const v = this.arr.toString()
        return `[${v}]`
    }
}

/**
 * const obj1 = new ArrayWrapper([1,2]);
 * const obj2 = new ArrayWrapper([3,4]);
 * obj1 + obj2; // 10
 * String(obj1); // "[1,2]"
 * String(obj2); // "[3,4]"
 */