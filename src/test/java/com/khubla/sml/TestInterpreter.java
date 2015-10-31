package com.khubla.sml;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.khubla.sml.antlr.smlParser.ModelContext;

public class TestInterpreter {
   @Test(enabled = true)
   public void testExampleModels() {
      try {
         List<File> files = FileUtil.getAllFiles("src/test/resources/");
         if (null != files) {
            for (File file : files) {
               doTest(file.getAbsolutePath());
            }
         }
      } catch (Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }

   private void doTest(String name) {
      try {
         System.out.println("Parsing: " + name);
         InputStream is = new FileInputStream(name);
         ModelContext modelContext = SMLInterpreter.parse(is);
         Assert.assertNotNull(modelContext);
      } catch (Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }
}
