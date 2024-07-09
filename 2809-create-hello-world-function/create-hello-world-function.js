/**
 * @return {Function}
 */
var createHelloWorld = function() {
    return function(...args) {
        var a = "Hello World";
        return a;
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */