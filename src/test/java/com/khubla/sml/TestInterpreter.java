package com.khubla.sml;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.khubla.sml.antlr.smlParser.ModelContext;

public class TestInterpreter {
   private void doTest(String name) {
      try {
         System.out.println("Parsing: " + name);
         final InputStream is = new FileInputStream(name);
         final ModelContext modelContext = SMLInterpreter.parse(is);
         Assert.assertNotNull(modelContext);
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }

   @Test(enabled = true)
   public void testExampleModels() {
      try {
         final List<File> files = FileUtil.getAllFiles("src/test/resources/");
         if (null != files) {
            for (final File file : files) {
               doTest(file.getAbsolutePath());
            }
         }
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }
}
