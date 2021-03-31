package com.base.engine;

import static org.lwjgl.opengl.GL11.*;

public class Sprite {
	/**
	 * The color values for the sprite
	 */
	private float red;
	private float green;
	private float blue;

	/**
	 * The horizontal and vertical size values for the sprite
	 */
	private float sizex;
	private float sizey;

	/**
	 * Default constructor for a sprite
	 *
	 * @param r Red value
	 * @param g Green value
	 * @param b Blue value
	 * @param sx Horizontal length
	 * @param sy Vertical height
	 */
	public Sprite(float r, float g, float b, float sx, float sy) {
		this.red = r;
		this.green = g;
		this.blue = b;
		this.sizex = sx;
		this.sizey = sy;
	}

	/**
	 * Draws the sprite
	 */
	public void render() {
		glColor3f(red,green,blue);
		glBegin(GL_QUADS);

		// Drawing a simple rectangle as a placeholder
		// TODO: Implement actual sprites later
		glVertex2f(0,0);
		glVertex2f(0,sizey);
		glVertex2f(sizex,sizey);
		glVertex2f(sizex,0);

		glEnd();
	}
}
