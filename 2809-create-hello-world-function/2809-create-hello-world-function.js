/**
 * @return {Function}
 */
var createHelloWorld = function() {
    return function(...args) {
        // var a = ;
        return "Hello World";
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */