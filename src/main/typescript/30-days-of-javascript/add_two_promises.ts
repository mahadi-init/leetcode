type P = Promise<number>

// @ts-ignore
export async function addTwoPromises(promise1: P, promise2: P): P {
    let number = 0

    number += await promise1
    number += await promise2

    return number
}
