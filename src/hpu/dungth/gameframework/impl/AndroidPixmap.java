package hpu.dungth.gameframework.impl;

import hpu.dungth.gameframework.Graphics.PixmapFormat;
import hpu.dungth.gameframework.Pixmap;
import android.graphics.Bitmap;

public class AndroidPixmap implements Pixmap {
	Bitmap bitmap;
	PixmapFormat format;
	public AndroidPixmap(Bitmap bitmap, PixmapFormat format) {
		this.bitmap = bitmap;
	}
	@Override
	public int getWidth() {
		return bitmap.getWidth();
	}
	@Override
	public int getHeight() {
		return bitmap.getHeight();
	}
	@Override
	public PixmapFormat getFormat() {
		return format;
	}
	@Override
	public void dispose() {
		bitmap.recycle();
	}
}