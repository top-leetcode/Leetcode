/**
 * @param {number} N
 * @return {number}
 */
var fib = function(N) {
  const array = [1, 1, null];
  switch (N) {
    case 0:
      return 0;
      break;
    case 1:
      return 1;
      break;
    case 2:
      return 1;
      break;
  }
  let nth = 3;
  while (nth <= N) {
    array[2] = array[0] + array[1];
    if (nth === N) {
      return array[2];
    }
    array.splice(0, 1);
    nth++;
  }
};
