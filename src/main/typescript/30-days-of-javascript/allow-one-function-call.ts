type JSONValue = null | boolean | number | string | JSONValue[] | { [key: string]: JSONValue };
type OnceFn = (...args: JSONValue[]) => JSONValue | undefined

type Fn = (...args: any[]) => any

function once(fn: Fn): Fn {
    let executionCount = 0;
    return function (...args) {
        if(executionCount > 0) return undefined;
        executionCount++;
        return fn(...args);
    };
}