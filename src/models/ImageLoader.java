package models;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Author:      Grant Kurtz
 */
public class ImageLoader{

	private BufferedImage compositeImage;

	private Image[][] pacManImages;

	private static ImageLoader loader;

	private ImageLoader(){
		try{
			compositeImage = ImageIO.read(new File("images/pacman.png"));
		}
		catch(IOException e){
			e.printStackTrace();
			System.exit(1);
		}
	}

	public static ImageLoader getImageLoaderInstance(){
		if(loader == null)
			loader = new ImageLoader();
		return loader;
	}

	public Image[][] getPacManImages(){
		if(pacManImages == null){
			pacManImages = new Image[4][2];
			pacManImages[0][0] = compositeImage.getSubimage(3, 3, 13, 13);
			pacManImages[0][1] = compositeImage.getSubimage(23, 3, 13, 13);
			pacManImages[1][0] = compositeImage.getSubimage(3, 3, 13, 13);
			pacManImages[1][1] = compositeImage.getSubimage(3, 3, 13, 13);
			pacManImages[2][0] = compositeImage.getSubimage(3, 3, 13, 13);
			pacManImages[2][1] = compositeImage.getSubimage(3, 3, 13, 13);
			pacManImages[3][0] = compositeImage.getSubimage(3, 3, 13, 13);
			pacManImages[3][1] = compositeImage.getSubimage(3, 3, 13, 13);
		}
		return pacManImages;
	}
}
