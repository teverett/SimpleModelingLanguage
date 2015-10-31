package com.khubla.sml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
   /**
    * find files
    */
   public static List<File> getAllFiles(String dir) throws Exception {
      return getAllFiles(dir, null);
   }

   /**
    * find files
    */
   public static List<File> getAllFiles(String dir, String extension) {
      final List<File> ret = new ArrayList<File>();
      final File file = new File(dir);
      if (file.exists()) {
         final String[] list = file.list();
         for (int i = 0; i < list.length; i++) {
            final String fileName = dir + "/" + list[i];
            final File f2 = new File(fileName);
            if (false == f2.isHidden()) {
               if (f2.isDirectory()) {
                  ret.addAll(getAllFiles(fileName, extension));
               } else {
                  if (null != extension) {
                     if (f2.getName().endsWith(extension)) {
                        ret.add(f2);
                     }
                  } else {
                     ret.add(f2);
                  }
               }
            }
         }
         return ret;
      } else {
         return null;
      }
   }
}
