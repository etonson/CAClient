package com.demo.commons;

import java.awt.GraphicsEnvironment;

public class ListFont {
public static void main(String[] args) {
	String[] fontNames=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
	for(String fontName:fontNames) {
		System.out.println(fontName);
		}
	}
}
