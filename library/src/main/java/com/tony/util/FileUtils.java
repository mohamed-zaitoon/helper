  /* Orginal file: FileUtils.java
bgteam.assitant@outlook.com
\com.tony.util*/
package com.tony.util;
import java.util.List;
import java.util.List;

  import java.util.List;


  import android.content.ContentResolver;

  import android.content.ContentUris;

  import android.content.Context;

  import android.database.Cursor;

  import android.graphics.Bitmap;

  import android.graphics.BitmapFactory;

  import android.graphics.Canvas;

  import android.graphics.ColorFilter;

  import android.graphics.ColorMatrix;

  import android.graphics.ColorMatrixColorFilter;

  import android.graphics.LightingColorFilter;

  import android.graphics.Matrix;

  import android.graphics.Paint;

  import android.graphics.PorterDuff;

  import android.graphics.PorterDuffXfermode;

  import android.graphics.Rect;

  import android.graphics.RectF;

  import android.media.ExifInterface;

  import android.net.Uri;

  import android.os.Environment;

  import android.provider.DocumentsContract;

  import android.provider.MediaStore;

  import android.text.TextUtils;


  import java.io.File;

  import java.io.FileInputStream;

  import java.io.FileOutputStream;

  import java.io.FileReader;

  import java.io.FileWriter;

  import java.io.IOException;

  import java.net.URLDecoder;

  import java.text.SimpleDateFormat;

  import java.util.ArrayList;

  import java.util.Date;


  public final class FileUtils {


  	private static void createNewFile(String path) {

  		int lastSep = path.lastIndexOf(File.separator);

  		if (lastSep > 0) {

  			String dirPath = path.substring(0, lastSep);

  			makeDir(dirPath);

  			}


  		File file = new File(path);


  		try {

  			if (!file.exists())

  			file.createNewFile();

  			} catch (IOException e) {

  			e.printStackTrace();

  			}

  		}


  	public static String readFile(String path) {

  		createNewFile(path);


  		StringBuilder sb = new StringBuilder();

  		FileReader fr = null;

  		try {

  			fr = new FileReader(new File(path));


  			char[] buff = new char[1024];

  			int length = 0;


  			while ((length = fr.read(buff)) > 0) {

  				sb.append(new String(buff, 0, length));

  				}

  			} catch (IOException e) {

  			e.printStackTrace();

  			} finally {

  			if (fr != null) {

  				try {

  					fr.close();

  					} catch (Exception e) {

  					e.printStackTrace();

  					}

  				}

  			}


  		return sb.toString();

  		}


  	public static void writeFile(String path, String str) {

  		createNewFile(path);

  		FileWriter fileWriter = null;


  		try {

  			fileWriter = new FileWriter(new File(path), false);

  			fileWriter.write(str);

  			fileWriter.flush();

  			} catch (IOException e) {

  			e.printStackTrace();

  			} finally {

  			try {

  				if (fileWriter != null)

  				fileWriter.close();

  				} catch (IOException e) {

  				e.printStackTrace();

  				}

  			}

  		}


  	public static void copyFile(String sourcePath, String destPath) {

  		if (!isExistFile(sourcePath)) return;

  		createNewFile(destPath);


  		FileInputStream fis = null;

  		FileOutputStream fos = null;


  		try {

  			fis = new FileInputStream(sourcePath);

  			fos = new FileOutputStream(destPath, false);


  			byte[] buff = new byte[1024];

  			int length = 0;


  			while ((length = fis.read(buff)) > 0) {

  				fos.write(buff, 0, length);

  				}

  			} catch (IOException e) {

  			e.printStackTrace();

  			} finally {

  			if (fis != null) {

  				try {

  					fis.close();

  					} catch (IOException e) {

  					e.printStackTrace();

  					}

  				}

  			if (fos != null) {

  				try {

  					fos.close();

  					} catch (IOException e) {

  					e.printStackTrace();

  					}

  				}

  			}

  		}


  	public static void moveFile(String sourcePath, String destPath) {

  		copyFile(sourcePath, destPath);

  		deleteFile(sourcePath);

  		}


  	public static void deleteFile(String path) {

  		File file = new File(path);


  		if (!file.exists()) return;


  		if (file.isFile()) {

  			file.delete();

  			return;

  			}


  		File[] fileArr = file.listFiles();


  		if (fileArr != null) {

  			for (File subFile : fileArr) {

  				if (subFile.isDirectory()) {

  					deleteFile(subFile.getAbsolutePath());

  					}


  				if (subFile.isFile()) {

  					subFile.delete();

  					}

  				}

  			}


  		file.delete();

  		}


  	public static boolean isExistFile(String path) {

  		File file = new File(path);

  		return file.exists();

  		}


  	public static void makeDir(String path) {

  		if (!isExistFile(path)) {

  			File file = new File(path);

  			file.mkdirs();

  			}

  		}


  	public static void listDir(String path, ArrayList<String> list) {

  		File dir = new File(path);

  		if (!dir.exists() || dir.isFile()) return;


  		File[] listFiles = dir.listFiles();

  		if (listFiles == null || listFiles.length <= 0) return;


  		if (list == null) return;

  		list.clear();

  		for (File file : listFiles) {

  			list.add(file.getAbsolutePath());

  			}

  		}


  	public static boolean isDirectory(String path) {

  		if (!isExistFile(path)) return false;

  		return new File(path).isDirectory();

  		}


  	public static boolean isFile(String path) {

  		if (!isExistFile(path)) return false;

  		return new File(path).isFile();

  		}


  	public static long getFileLength(String path) {

  		if (!isExistFile(path)) return 0;

  		return new File(path).length();

  		}


  	public static String getExternalStorageDir(Context context) {

  		return Environment.getExternalStorageDirectory().getAbsolutePath();

  		}


  	public static String getPackageDataDir(Context context) {

  		return context.getExternalFilesDir(null).getAbsolutePath();

  		}


  	public static String getPublicDir(Context c, String type) {

  		return Environment.getExternalStoragePublicDirectory(type).getAbsolutePath();

  		}


  	public static String convertUriToFilePath(final Context context, final Uri uri) {

  		String path = null;

  		if (DocumentsContract.isDocumentUri(context, uri)) {

  			if (isExternalStorageDocument(uri)) {

  				final String docId = DocumentsContract.getDocumentId(uri);

  				final String[] split = docId.split(l001434(1855));

  				final String type = split[0];


  				if (l001434(1876).equalsIgnoreCase(type)) {

  					path = Environment.getExternalStorageDirectory() + l001434(1898) + split[1];

  					}

  				} else if (isDownloadsDocument(uri)) {

  				final String id = DocumentsContract.getDocumentId(uri);


  				if (!TextUtils.isEmpty(id)) {

  					if (id.startsWith(l001434(1962))) {

  						return id.replaceFirst(l001434(1974), l001434(1977));

  						}

  					}


  				final Uri contentUri = ContentUris

  				.withAppendedId(Uri.parse(l001434(2002)), Long.valueOf(id));


  				path = getDataColumn(context, contentUri, null, null);

  				} else if (isMediaDocument(uri)) {

  				final String docId = DocumentsContract.getDocumentId(uri);

  				final String[] split = docId.split(l001434(2079));

  				final String type = split[0];


  				Uri contentUri = null;

  				if (l001434(2109).equals(type)) {

  					contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;

  					} else if (l001434(2139).equals(type)) {

  					contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;

  					} else if (l001434(2169).equals(type)) {

  					contentUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;

  					}


  				final String selection = MediaStore.Audio.Media._ID + l001434(2212);

  				final String[] selectionArgs = new String[]{

  					split[1]

  					};


  				path = getDataColumn(context, contentUri, selection, selectionArgs);

  				}

  			} else if (ContentResolver.SCHEME_CONTENT.equalsIgnoreCase(uri.getScheme())) {

  			path = getDataColumn(context, uri, null, null);

  			} else if (ContentResolver.SCHEME_FILE.equalsIgnoreCase(uri.getScheme())) {

  			path = uri.getPath();

  			}


  		if (path != null) {

  			try {

  				return URLDecoder.decode(path, l001434(2365));

  				}catch(Exception e){

  				return null;

  				}

  			}

  		return null;

  		}


  	private static String getDataColumn(Context context, Uri uri, String selection, String[] selectionArgs) {

  		Cursor cursor = null;


  		final String column = MediaStore.Images.Media.DATA;

  		final String[] projection = {

  			column

  			};


  		try {

  			cursor = context.getContentResolver().query(uri, projection, selection, selectionArgs, null);

  			if (cursor != null && cursor.moveToFirst()) {

  				final int column_index = cursor.getColumnIndexOrThrow(column);

  				return cursor.getString(column_index);

  				}

  			} catch (Exception e) {


  			} finally {

  			if (cursor != null) {

  				cursor.close();

  				}

  			}

  		return null;

  		}



  	private static boolean isExternalStorageDocument(Uri uri) {

  		return l001434(2617).equals(uri.getAuthority());

  		}


  	private static boolean isDownloadsDocument(Uri uri) {

  		return l001434(2648).equals(uri.getAuthority());

  		}


  	private static boolean isMediaDocument(Uri uri) {

  		return l001434(2679).equals(uri.getAuthority());

  		}


  	private static void saveBitmap(Bitmap bitmap, String destPath) {

  		FileOutputStream out = null;

  		FileUtils.createNewFile(destPath);

  		try {

  			out = new FileOutputStream(new File(destPath));

  			bitmap.compress(Bitmap.CompressFormat.PNG, 100, out);

  			} catch (Exception e) {

  			e.printStackTrace();

  			} finally {

  			try {

  				if (out != null) {

  					out.close();

  					}

  				} catch (IOException e) {

  				e.printStackTrace();

  				}

  			}

  		}


  	public static Bitmap getScaledBitmap(String path, int max) {

  		Bitmap src = BitmapFactory.decodeFile(path);


  		int width = src.getWidth();

  		int height = src.getHeight();

  		float rate = 0.0f;


  		if (width > height) {

  			rate = max / (float) width;

  			height = (int) (height * rate);

  			width = max;

  			} else {

  			rate = max / (float) height;

  			width = (int) (width * rate);

  			height = max;

  			}


  		return Bitmap.createScaledBitmap(src, width, height, true);

  		}


  	public static int calculateInSampleSize(BitmapFactory.Options options, int reqWidth, int reqHeight) {

  		final int width = options.outWidth;

  		final int height = options.outHeight;

  		int inSampleSize = 1;


  		if (height > reqHeight || width > reqWidth) {

  			final int halfHeight = height / 2;

  			final int halfWidth = width / 2;


  			while ((halfHeight / inSampleSize) >= reqHeight && (halfWidth / inSampleSize) >= reqWidth) {

  				inSampleSize *= 2;

  				}

  			}


  		return inSampleSize;

  		}


  	public static Bitmap decodeSampleBitmapFromPath(String path, int reqWidth, int reqHeight) {

  		final BitmapFactory.Options options = new BitmapFactory.Options();

  		options.inJustDecodeBounds = true;

  		BitmapFactory.decodeFile(path, options);


  		options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);


  		options.inJustDecodeBounds = false;

  		return BitmapFactory.decodeFile(path, options);

  		}


  	public static void resizeBitmapFileRetainRatio(String fromPath, String destPath, int max) {

  		if (!isExistFile(fromPath)) return;

  		Bitmap bitmap = getScaledBitmap(fromPath, max);

  		saveBitmap(bitmap, destPath);

  		}


  	public static void resizeBitmapFileToSquare(String fromPath, String destPath, int max) {

  		if (!isExistFile(fromPath)) return;

  		Bitmap src = BitmapFactory.decodeFile(fromPath);

  		Bitmap bitmap = Bitmap.createScaledBitmap(src, max, max, true);

  		saveBitmap(bitmap, destPath);

  		}


  	public static void resizeBitmapFileToCircle(String fromPath, String destPath) {

  		if (!isExistFile(fromPath)) return;

  		Bitmap src = BitmapFactory.decodeFile(fromPath);

  		Bitmap bitmap = Bitmap.createBitmap(src.getWidth(),

  		src.getHeight(), Bitmap.Config.ARGB_8888);

  		Canvas canvas = new Canvas(bitmap);


  		final int color = 0xff424242;

  		final Paint paint = new Paint();

  		final Rect rect = new Rect(0, 0, src.getWidth(), src.getHeight());


  		paint.setAntiAlias(true);

  		canvas.drawARGB(0, 0, 0, 0);

  		paint.setColor(color);

  		canvas.drawCircle(src.getWidth() / 2, src.getHeight() / 2,

  		src.getWidth() / 2, paint);

  		paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));

  		canvas.drawBitmap(src, rect, rect, paint);


  		saveBitmap(bitmap, destPath);

  		}


  	public static void resizeBitmapFileWithRoundedBorder(String fromPath, String destPath, int pixels) {

  		if (!isExistFile(fromPath)) return;

  		Bitmap src = BitmapFactory.decodeFile(fromPath);

  		Bitmap bitmap = Bitmap.createBitmap(src.getWidth(), src

  		.getHeight(), Bitmap.Config.ARGB_8888);

  		Canvas canvas = new Canvas(bitmap);


  		final int color = 0xff424242;

  		final Paint paint = new Paint();

  		final Rect rect = new Rect(0, 0, src.getWidth(), src.getHeight());

  		final RectF rectF = new RectF(rect);

  		final float roundPx = pixels;


  		paint.setAntiAlias(true);

  		canvas.drawARGB(0, 0, 0, 0);

  		paint.setColor(color);

  		canvas.drawRoundRect(rectF, roundPx, roundPx, paint);


  		paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));

  		canvas.drawBitmap(src, rect, rect, paint);


  		saveBitmap(bitmap, destPath);

  		}


  	public static void cropBitmapFileFromCenter(String fromPath, String destPath, int w, int h) {

  		if (!isExistFile(fromPath)) return;

  		Bitmap src = BitmapFactory.decodeFile(fromPath);


  		int width = src.getWidth();

  		int height = src.getHeight();


  		if (width < w && height < h)

  		return;


  		int x = 0;

  		int y = 0;


  		if (width > w)

  		x = (width - w) / 2;


  		if (height > h)

  		y = (height - h) / 2;


  		int cw = w;

  		int ch = h;


  		if (w > width)

  		cw = width;


  		if (h > height)

  		ch = height;


  		Bitmap bitmap = Bitmap.createBitmap(src, x, y, cw, ch);

  		saveBitmap(bitmap, destPath);

  		}


  	public static void rotateBitmapFile(String fromPath, String destPath, float angle) {

  		if (!isExistFile(fromPath)) return;

  		Bitmap src = BitmapFactory.decodeFile(fromPath);

  		Matrix matrix = new Matrix();

  		matrix.postRotate(angle);

  		Bitmap bitmap = Bitmap.createBitmap(src, 0, 0, src.getWidth(), src.getHeight(), matrix, true);

  		saveBitmap(bitmap, destPath);

  		}


  	public static void scaleBitmapFile(String fromPath, String destPath, float x, float y) {

  		if (!isExistFile(fromPath)) return;

  		Bitmap src = BitmapFactory.decodeFile(fromPath);

  		Matrix matrix = new Matrix();

  		matrix.postScale(x, y);


  		int w = src.getWidth();

  		int h = src.getHeight();


  		Bitmap bitmap = Bitmap.createBitmap(src, 0, 0, w, h, matrix, true);

  		saveBitmap(bitmap, destPath);

  		}


  	public static void skewBitmapFile(String fromPath, String destPath, float x, float y) {

  		if (!isExistFile(fromPath)) return;

  		Bitmap src = BitmapFactory.decodeFile(fromPath);

  		Matrix matrix = new Matrix();

  		matrix.postSkew(x, y);


  		int w = src.getWidth();

  		int h = src.getHeight();


  		Bitmap bitmap = Bitmap.createBitmap(src, 0, 0, w, h, matrix, true);

  		saveBitmap(bitmap, destPath);

  		}


  	public static void setBitmapFileColorFilter(String fromPath, String destPath, int color) {

  		if (!isExistFile(fromPath)) return;

  		Bitmap src = BitmapFactory.decodeFile(fromPath);

  		Bitmap bitmap = Bitmap.createBitmap(src, 0, 0,

  		src.getWidth() - 1, src.getHeight() - 1);

  		Paint p = new Paint();

  		ColorFilter filter = new LightingColorFilter(color, 1);

  		p.setColorFilter(filter);

  		Canvas canvas = new Canvas(bitmap);

  		canvas.drawBitmap(bitmap, 0, 0, p);

  		saveBitmap(bitmap, destPath);

  		}


  	public static void setBitmapFileBrightness(String fromPath, String destPath, float brightness) {

  		if (!isExistFile(fromPath)) return;

  		Bitmap src = BitmapFactory.decodeFile(fromPath);

  		ColorMatrix cm = new ColorMatrix(new float[]

  		{

  			1, 0, 0, 0, brightness,

  			0, 1, 0, 0, brightness,

  			0, 0, 1, 0, brightness,

  			0, 0, 0, 1, 0

  			});


  		Bitmap bitmap = Bitmap.createBitmap(src.getWidth(), src.getHeight(), src.getConfig());

  		Canvas canvas = new Canvas(bitmap);

  		Paint paint = new Paint();

  		paint.setColorFilter(new ColorMatrixColorFilter(cm));

  		canvas.drawBitmap(src, 0, 0, paint);

  		saveBitmap(bitmap, destPath);

  		}


  	public static void setBitmapFileContrast(String fromPath, String destPath, float contrast) {

  		if (!isExistFile(fromPath)) return;

  		Bitmap src = BitmapFactory.decodeFile(fromPath);

  		ColorMatrix cm = new ColorMatrix(new float[]

  		{

  			contrast, 0, 0, 0, 0,

  			0, contrast, 0, 0, 0,

  			0, 0, contrast, 0, 0,

  			0, 0, 0, 1, 0

  			});


  		Bitmap bitmap = Bitmap.createBitmap(src.getWidth(), src.getHeight(), src.getConfig());

  		Canvas canvas = new Canvas(bitmap);

  		Paint paint = new Paint();

  		paint.setColorFilter(new ColorMatrixColorFilter(cm));

  		canvas.drawBitmap(src, 0, 0, paint);


  		saveBitmap(bitmap, destPath);

  		}


  	public static int getJpegRotate(String filePath) {

  		int rotate = 0;

  		try {

  			ExifInterface exif = new ExifInterface(filePath);

  			int iOrientation = exif.getAttributeInt(ExifInterface.TAG_ORIENTATION, -1);


  			switch (iOrientation) {

  				case ExifInterface.ORIENTATION_ROTATE_90:

  				rotate = 90;

  				break;

  				case ExifInterface.ORIENTATION_ROTATE_180:

  				rotate = 180;

  				break;

  				case ExifInterface.ORIENTATION_ROTATE_270:

  				rotate = 270;

  				break;

  				default:

  				rotate = 0;

  				break;

  				}

  			}

  		catch (IOException e) {

  			return 0;

  			}


  		return rotate;

  		}

  	public static File createNewPictureFile(Context context) {

  		SimpleDateFormat date = new SimpleDateFormat(l001434(5526));

  		String fileName = date.format(new Date()) + l001434(5549);

  		File file = new File(context.getExternalFilesDir(Environment.DIRECTORY_DCIM).getAbsolutePath() + File.separator + fileName);

  		return file;

  		}

 
  	static String l001434(int l001433){
	 
  		byte[] l001432=null;
	 
  		try{ 
	 
  			if (l001433==-1) 
		 
  			{ if (l001433==-2) {}  
		   
  				else if (l001433==-3) {}   
		   
  				else if (l001433==-4) {}  
	   
  				}  
	  
  			if (l001433==1855){ 
		
  				l001432=new byte[] {5};

		 
  				for (int l00144=0; l00144<l001432.length; l00144++) 
		 
  				{l001432[l00144]=(byte)(l001432[l00144]^l001433);} 
		 
  				{return new String(l001432,l001332(6336));}  
		 
  				} 
	  
  			if (l001433==1876){ 
		
  				l001432=new byte[] {36,38,61,57,53,38,45};

		 
  				for (int l00144=0; l00144<l001432.length; l00144++) 
		 
  				{l001432[l00144]=(byte)(l001432[l00144]^l001433);} 
		 
  				{return new String(l001432,l001332(6435));}  
		 
  				} 
	  
  			if (l001433==1898){ 
		
  				l001432=new byte[] {69};

		 
  				for (int l00144=0; l00144<l001432.length; l00144++) 
		 
  				{l001432[l00144]=(byte)(l001432[l00144]^l001433);} 
		 
  				{return new String(l001432,l001332(6522));}  
		 
  				} 
	  
  			if (l001433==1962){ 
		
  				l001432=new byte[] {-40,-53,-35,-112};

		 
  				for (int l00144=0; l00144<l001432.length; l00144++) 
		 
  				{l001432[l00144]=(byte)(l001432[l00144]^l001433);} 
		 
  				{return new String(l001432,l001332(6619));}  
		 
  				} 
	  
  			if (l001433==1974){ 
		
  				l001432=new byte[] {-60,-41,-63,-116};

		 
  				for (int l00144=0; l00144<l001432.length; l00144++) 
		 
  				{l001432[l00144]=(byte)(l001432[l00144]^l001433);} 
		 
  				{return new String(l001432,l001332(6716));}  
		 
  				} 
	  
  			if (l001433==1977){ 
		
  				l001432=new byte[] {};

		 
  				for (int l00144=0; l00144<l001432.length; l00144++) 
		 
  				{l001432[l00144]=(byte)(l001432[l00144]^l001433);} 
		 
  				{return new String(l001432,l001332(6802));}  
		 
  				} 
	  
  			if (l001433==2002){ 
		
  				l001432=new byte[] {-79,-67,-68,-90,-73,-68,-90,-24,-3,-3,-74,-67,-91,-68,-66,-67,-77,-74,-95,-3,-94,-89,-80,-66,-69,-79,-115,-74,-67,-91,-68,-66,-67,-77,-74,-95};

		 
  				for (int l00144=0; l00144<l001432.length; l00144++) 
		 
  				{l001432[l00144]=(byte)(l001432[l00144]^l001433);} 
		 
  				{return new String(l001432,l001332(6995));}  
		 
  				} 
	  
  			if (l001433==2079){ 
		
  				l001432=new byte[] {37};

		 
  				for (int l00144=0; l00144<l001432.length; l00144++) 
		 
  				{l001432[l00144]=(byte)(l001432[l00144]^l001433);} 
		 
  				{return new String(l001432,l001332(7082));}  
		 
  				} 
	  
  			if (l001433==2109){ 
		
  				l001432=new byte[] {84,80,92,90,88};

		 
  				for (int l00144=0; l00144<l001432.length; l00144++) 
		 
  				{l001432[l00144]=(byte)(l001432[l00144]^l001433);} 
		 
  				{return new String(l001432,l001332(7177));}  
		 
  				} 
	  
  			if (l001433==2139){ 
		
  				l001432=new byte[] {45,50,63,62,52};

		 
  				for (int l00144=0; l00144<l001432.length; l00144++) 
		 
  				{l001432[l00144]=(byte)(l001432[l00144]^l001433);} 
		 
  				{return new String(l001432,l001332(7272));}  
		 
  				} 
	  
  			if (l001433==2169){ 
		
  				l001432=new byte[] {24,12,29,16,22};

		 
  				for (int l00144=0; l00144<l001432.length; l00144++) 
		 
  				{l001432[l00144]=(byte)(l001432[l00144]^l001433);} 
		 
  				{return new String(l001432,l001332(7367));}  
		 
  				} 
	  
  			if (l001433==2212){ 
		
  				l001432=new byte[] {-103,-101};

		 
  				for (int l00144=0; l00144<l001432.length; l00144++) 
		 
  				{l001432[l00144]=(byte)(l001432[l00144]^l001433);} 
		 
  				{return new String(l001432,l001332(7458));}  
		 
  				} 
	  
  			if (l001433==2365){ 
		
  				l001432=new byte[] {104,105,123,16,5};

		 
  				for (int l00144=0; l00144<l001432.length; l00144++) 
		 
  				{l001432[l00144]=(byte)(l001432[l00144]^l001433);} 
		 
  				{return new String(l001432,l001332(7553));}  
		 
  				} 
	  
  			if (l001433==2617){ 
		
  				l001432=new byte[] {90,86,84,23,88,87,93,75,86,80,93,23,92,65,77,92,75,87,88,85,74,77,86,75,88,94,92,23,93,86,90,76,84,92,87,77,74};

		 
  				for (int l00144=0; l00144<l001432.length; l00144++) 
		 
  				{l001432[l00144]=(byte)(l001432[l00144]^l001433);} 
		 
  				{return new String(l001432,l001332(7712));}  
		 
  				} 
	  
  			if (l001433==2648){ 
		
  				l001432=new byte[] {59,55,53,118,57,54,60,42,55,49,60,118,40,42,55,46,49,60,61,42,43,118,60,55,47,54,52,55,57,60,43,118,60,55,59,45,53,61,54,44,43};

		 
  				for (int l00144=0; l00144<l001432.length; l00144++) 
		 
  				{l001432[l00144]=(byte)(l001432[l00144]^l001433);} 
		 
  				{return new String(l001432,l001332(7879));}  
		 
  				} 
	  
  			if (l001433==2679){ 
		
  				l001432=new byte[] {20,24,26,89,22,25,19,5,24,30,19,89,7,5,24,1,30,19,18,5,4,89,26,18,19,30,22,89,19,24,20,2,26,18,25,3,4};

		 
  				for (int l00144=0; l00144<l001432.length; l00144++) 
		 
  				{l001432[l00144]=(byte)(l001432[l00144]^l001433);} 
		 
  				{return new String(l001432,l001332(8038));}  
		 
  				} 
	  
  			if (l001433==5526){ 
		
  				l001432=new byte[] {-17,-17,-17,-17,-37,-37,-14,-14,-55,-34,-34,-5,-5,-27,-27};

		 
  				for (int l00144=0; l00144<l001432.length; l00144++) 
		 
  				{l001432[l00144]=(byte)(l001432[l00144]^l001433);} 
		 
  				{return new String(l001432,l001332(8168));}  
		 
  				} 
	  
  			if (l001433==5549){ 
		
  				l001432=new byte[] {-125,-57,-35,-54};

		 
  				for (int l00144=0; l00144<l001432.length; l00144++) 
		 
  				{l001432[l00144]=(byte)(l001432[l00144]^l001433);} 
		 
  				{return new String(l001432,l001332(8265));}  
		 
  				} 

  			}catch(Exception e){ return null;	}	 return null;

  		}

  	
 static String l001332(int l001331){
	 byte[] l001330=null;
	 try{ 
	 if (l001331==-1) 
		 { if (l001331==-2) {}  
		   else if (l001331==-3) {}   
		   else if (l001331==-4) {}  
	   }  
	  if (l001331==6336){ 
		l001330=new byte[] {-107,-108,-122,-19,-8};

		 for (int l001333=0; l001333<l001330.length; l001333++) 
		 {l001330[l001333]=(byte)(l001330[l001333]^l001331);} 
		 {return new String(l001330,"UTF-8");}  
		 } 
	  if (l001331==6435){ 
		l001330=new byte[] {118,119,101,14,27};

		 for (int l001333=0; l001333<l001330.length; l001333++) 
		 {l001330[l001333]=(byte)(l001330[l001333]^l001331);} 
		 {return new String(l001330,"UTF-8");}  
		 } 
	  if (l001331==6522){ 
		l001330=new byte[] {47,46,60,87,66};

		 for (int l001333=0; l001333<l001330.length; l001333++) 
		 {l001330[l001333]=(byte)(l001330[l001333]^l001331);} 
		 {return new String(l001330,"UTF-8");}  
		 } 
	  if (l001331==6619){ 
		l001330=new byte[] {-114,-113,-99,-10,-29};

		 for (int l001333=0; l001333<l001330.length; l001333++) 
		 {l001330[l001333]=(byte)(l001330[l001333]^l001331);} 
		 {return new String(l001330,"UTF-8");}  
		 } 
	  if (l001331==6716){ 
		l001330=new byte[] {105,104,122,17,4};

		 for (int l001333=0; l001333<l001330.length; l001333++) 
		 {l001330[l001333]=(byte)(l001330[l001333]^l001331);} 
		 {return new String(l001330,"UTF-8");}  
		 } 
	  if (l001331==6802){ 
		l001330=new byte[] {-57,-58,-44,-65,-86};

		 for (int l001333=0; l001333<l001330.length; l001333++) 
		 {l001330[l001333]=(byte)(l001330[l001333]^l001331);} 
		 {return new String(l001330,"UTF-8");}  
		 } 
	  if (l001331==6995){ 
		l001330=new byte[] {6,7,21,126,107};

		 for (int l001333=0; l001333<l001330.length; l001333++) 
		 {l001330[l001333]=(byte)(l001330[l001333]^l001331);} 
		 {return new String(l001330,"UTF-8");}  
		 } 
	  if (l001331==7082){ 
		l001330=new byte[] {-1,-2,-20,-121,-110};

		 for (int l001333=0; l001333<l001330.length; l001333++) 
		 {l001330[l001333]=(byte)(l001330[l001333]^l001331);} 
		 {return new String(l001330,"UTF-8");}  
		 } 
	  if (l001331==7177){ 
		l001330=new byte[] {92,93,79,36,49};

		 for (int l001333=0; l001333<l001330.length; l001333++) 
		 {l001330[l001333]=(byte)(l001330[l001333]^l001331);} 
		 {return new String(l001330,"UTF-8");}  
		 } 
	  if (l001331==7272){ 
		l001330=new byte[] {61,60,46,69,80};

		 for (int l001333=0; l001333<l001330.length; l001333++) 
		 {l001330[l001333]=(byte)(l001330[l001333]^l001331);} 
		 {return new String(l001330,"UTF-8");}  
		 } 
	  if (l001331==7367){ 
		l001330=new byte[] {-110,-109,-127,-22,-1};

		 for (int l001333=0; l001333<l001330.length; l001333++) 
		 {l001330[l001333]=(byte)(l001330[l001333]^l001331);} 
		 {return new String(l001330,"UTF-8");}  
		 } 
	  if (l001331==7458){ 
		l001330=new byte[] {119,118,100,15,26};

		 for (int l001333=0; l001333<l001330.length; l001333++) 
		 {l001330[l001333]=(byte)(l001330[l001333]^l001331);} 
		 {return new String(l001330,"UTF-8");}  
		 } 
	  if (l001331==7553){ 
		l001330=new byte[] {-44,-43,-57,-84,-71};

		 for (int l001333=0; l001333<l001330.length; l001333++) 
		 {l001330[l001333]=(byte)(l001330[l001333]^l001331);} 
		 {return new String(l001330,"UTF-8");}  
		 } 
	  if (l001331==7712){ 
		l001330=new byte[] {117,116,102,13,24};

		 for (int l001333=0; l001333<l001330.length; l001333++) 
		 {l001330[l001333]=(byte)(l001330[l001333]^l001331);} 
		 {return new String(l001330,"UTF-8");}  
		 } 
	  if (l001331==7879){ 
		l001330=new byte[] {-110,-109,-127,-22,-1};

		 for (int l001333=0; l001333<l001330.length; l001333++) 
		 {l001330[l001333]=(byte)(l001330[l001333]^l001331);} 
		 {return new String(l001330,"UTF-8");}  
		 } 
	  if (l001331==8038){ 
		l001330=new byte[] {51,50,32,75,94};

		 for (int l001333=0; l001333<l001330.length; l001333++) 
		 {l001330[l001333]=(byte)(l001330[l001333]^l001331);} 
		 {return new String(l001330,"UTF-8");}  
		 } 
	  if (l001331==8168){ 
		l001330=new byte[] {-67,-68,-82,-59,-48};

		 for (int l001333=0; l001333<l001330.length; l001333++) 
		 {l001330[l001333]=(byte)(l001330[l001333]^l001331);} 
		 {return new String(l001330,"UTF-8");}  
		 } 
	  if (l001331==8265){ 
		l001330=new byte[] {28,29,15,100,113};

		 for (int l001333=0; l001333<l001330.length; l001333++) 
		 {l001330[l001333]=(byte)(l001330[l001333]^l001331);} 
		 {return new String(l001330,"UTF-8");}  
		 } 
}catch(Exception e){ return null;	}	 return null;
}/**/
}

  