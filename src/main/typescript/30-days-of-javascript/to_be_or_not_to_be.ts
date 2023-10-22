type ToBeOrNotToBe = {
    toBe: (val: any) => boolean;
    notToBe: (val: any) => boolean;
};

function expect(val: any): ToBeOrNotToBe {
    const toBe = (arg0: any) => {
        if (val === arg0) return true
        else throw new Error("Not Equal")
    }

    const notToBe = (arg0: any) => {
        if (val === arg0) throw new Error("Equal");
        else return true;
    }

    return {toBe, notToBe}
}

expect(5).toBe(5); // true
expect(5).notToBe(5); // throws "Equal"

expect(5).toBe
