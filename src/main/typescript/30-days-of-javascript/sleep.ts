// @ts-ignore
async function sleep(millis: number): Promise<void> {
    // @ts-ignore
    return new Promise((resolve: TimerHandler) => setTimeout(resolve, millis))
}


/**
 * let t = Date.now()
 * sleep(100).then(() => console.log(Date.now() - t)) // 100
 */