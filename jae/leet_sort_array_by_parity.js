/**
 * @param {number[]} A
 * @return {number[]}
 */
var sortArrayByParity = function(A) {
  const newA = [];
  A.forEach(el => {
    if (el % 2 === 0) {
      newA.push(el);
    }
  });
  A.forEach(el => {
    if (el % 2 === 1) {
      newA.push(el);
    }
  });
  return newA;
};
