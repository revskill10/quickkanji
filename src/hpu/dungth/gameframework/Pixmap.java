package hpu.dungth.gameframework;
import hpu.dungth.gameframework.Graphics.PixmapFormat;
public interface Pixmap {
	public int getWidth();
	public int getHeight();
	public PixmapFormat getFormat();
	public void dispose();
}
