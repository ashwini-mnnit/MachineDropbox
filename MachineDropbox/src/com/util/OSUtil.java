package com.util;

import com.google.common.jimfs.Configuration;

public final class OSUtil
{
   private static String OS = null;
   public static String getOsName()
   {
      if(OS == null) { OS = System.getProperty("os.name"); }
      return OS;
   }
   
   public static boolean isWindows()
   {
      return getOsName().startsWith("Windows");
   }

   public static boolean isUnix()
   {
	   return getOsName().startsWith("Unix") || getOsName().startsWith("Linux") ;
   }
   
   public static boolean isOSx()
   {
	   return getOsName().contains("OS X");
   }
   
   public static Configuration  getfileSystemConfiguration()
   {
	   if(isWindows())
		   return Configuration.windows();
	   if(isUnix())
		   return Configuration.unix();
	   if(isOSx())
		   return Configuration.osX();
	   
	   assert false;
	   return null;
   
   }
}