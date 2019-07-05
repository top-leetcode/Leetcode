package com.myjoon.test.Leetcode.youngjoon;

import java.util.Arrays;

public class RotateImage_48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
		                  {1,2,3},
		                  {4,5,6},
		                  {7,8,9}
		                  };
		new RotateImage_48().rotate(matrix);
		
		System.out.println(Arrays.deepToString(matrix));
	}
	
	public void rotate(int[][] matrix) {
    
		int matLength = matrix[0].length;
		int[] matTemp = new int[matLength];
		int iTempTarValue = 0;
		int iTempSrcValue = 0;
		int iSrcX, iSrcY, iTarX, iTarY;
		
		for (int i=0; i < matLength/2 ; i++) {
			for (int k=i; k < matLength - i -1; k++) {
				iSrcX = i;
				iSrcY = k;
				iTarX = iSrcY;
				iTarY = matLength - 1 - iSrcX;

				iTempSrcValue = matrix[iSrcX][iSrcY];
				
				for (int j=0; j <4 ; j++) {
					iTarX = iSrcY;
					iTarY = matLength - 1 - iSrcX;
					
					iTempTarValue = matrix[iTarX][iTarY];
					matrix[iTarX][iTarY] = iTempSrcValue;
					
					iTempSrcValue = iTempTarValue;
					iSrcX = iTarX;
					iSrcY = iTarY;
					
					System.out.println(Arrays.deepToString(matrix));
				}
			}
		}
    }
	
	

}




