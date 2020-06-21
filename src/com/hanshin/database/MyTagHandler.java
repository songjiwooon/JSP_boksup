package com.hanshin.database;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyTagHandler extends SimpleTagSupport{
	int num1, num2, num3, num4, num5;
	
	public int getNum1() {
		return num1;
	}
	
	public int getNum2() {
		return num2;
	}
	
	public int getNum3() {
		return num3;
	}
	
	public int getNum4() {
		return num4;
	}
	
	public int getNum5() {
		return num5;
	}
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}	
	
	public void setNum3(int num3) {
		this.num3 = num3;
	}
	
	public void setNum4(int num4) {
		this.num4 = num4;
	}
	
	public void setNum5(int num5) {
		this.num5 = num5;
	}
	
	public static int partition(int arr[], int left, int right) {

		int pivot = arr[(left + right) / 2];

		while (left < right) {
			while ((arr[left] < pivot) && (left < right))
				left++;
			while ((arr[right] > pivot) && (left < right))
				right--;

			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}

		return left;
	}

	public static void quickSort(int arr[], int left, int right) {

		if (left < right) {
			int pivotNewIndex = partition(arr, left, right);

			quickSort(arr, left, pivotNewIndex - 1);
			quickSort(arr, pivotNewIndex + 1, right);
		}

	}
	
	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();

		int[] arrs = { num1, num2, num3, num4, num5 };
		
		out.println(" 정렬 전: ");
		for(int i : arrs) {
			out.print(i + " ");
		}
		out.println("<br>");
		
		quickSort(arrs, 0, arrs.length-1);
		out.println(" 정렬 후: ");
		for(int i : arrs) {
			out.print(i + " ");
		}
		
		super.doTag();
	}
	
	
}
