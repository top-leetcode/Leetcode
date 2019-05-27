/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
  const str = JSON.stringify(x);
  const reversedX = str
    .split("")
    .reverse()
    .join("");
  return str === reversedX ? true : false;
};
