/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
  const targetNo = 0;
  let results = [];
  if (nums.length < 3) {
    return results;
  } else {
    nums.sort((a, b) => a - b);
    for (let i = 0; i < nums.length - 2; i++) {
      // after the initial try, skip if the number is the same as the previous one
      if (i > 0 && nums[i] === nums[i - 1]) continue;
      // second number goes from left to right, third one from right to left
      let ii = i + 1;
      let iii = nums.length - 1;
      while (ii < iii) {
        let sum = nums[i] + nums[ii] + nums[iii];
        if (targetNo === sum) {
          results.push([nums[i], nums[ii], nums[iii]]);
          // skip all the same numbers
          while (nums[iii] === nums[iii - 1]) iii--;
          while (nums[ii] === nums[ii + 1]) ii++;
          iii--;
          ii++;
        } else if (sum < targetNo) {
          ii++;
        } else {
          iii--;
        }
      }
    }
    return results;
  }
};

// The following passed 311 / 313 test cases. reason: time limit. code efficiency not good.

// var threeSum = function(nums) {
//     // let targetNo = 0;
//     let results = [];

//     if (nums.length < 3 || nums.length === 0) {
//       return results;
//     } else {
//       nums.sort((a, b) => a - b);
//       for (let i = 0; i < nums.length - 2; i++) {
//         if (i > 0 && nums[i] === nums[i - 1]) {
//           continue;
//         }
//         let targetNo = 0 - nums[i];
//         for (let ii = i + 1; ii < nums.length - 1; ii++) {
//           if (i != ii - 1 && nums[ii] === nums[ii - 1]) {
//             continue;
//           }
//           for (let iii = ii + 1; iii < nums.length; iii++) {
//             if (ii != iii - 1 && nums[iii] === nums[iii - 1]) {
//               continue;
//             }
//             if (
//               targetNo === nums[ii] + nums[iii]
//             ) {
//               results.push([nums[i], nums[ii], nums[iii]]);
//             }
//           }
//         }
//       }
//       return results;
//     }
//   };

console.log(threeSum([-4, -2, 1, -5, -4, -4, 4, -2, 0, 4, 0, -2, 3, 1, -5, 0]));
