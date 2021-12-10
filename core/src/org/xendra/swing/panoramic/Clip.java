package org.xendra.swing.panoramic;

import java.util.Arrays;

public class Clip {
	protected int[][] data;
	protected int height;
	protected int width;
	
	public Clip(final int width, final int height, int background) {
		this.width = width;
		this.height = height;
		data = new int[height][width];
		fill(background);
	}

	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}	
	public final int getPixel(int x, int y) {
		return data[y][x];
	}
	public void setPixel(int x, int y, int color) {
		data[y][x] = color;
	}
	public final void fill(int colour) {
		final int height = getHeight();
		for (int i = 0; i < height; i++) {
			Arrays.fill(data[i], colour);
		}
	}
}
