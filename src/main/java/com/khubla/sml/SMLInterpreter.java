package com.khubla.sml;

/*
* kPascal Copyright 2012, khubla.com
*
*   This program is free software: you can redistribute it and/or modify
*   it under the terms of the GNU General Public License as published by
*   the Free Software Foundation, either version 3 of the License, or
*   (at your option) any later version.
*
*    This program is distributed in the hope that it will be useful,
*    but WITHOUT ANY WARRANTY; without even the implied warranty of
*    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*    GNU General Public License for more details.
*
*    You should have received a copy of the GNU General Public License
*    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import com.khubla.sml.antlr.smlLexer;
import com.khubla.sml.antlr.smlParser;
import com.khubla.sml.antlr.smlParser.ModelContext;

public class SMLInterpreter {
   /**
    * parse an input file
    */
   public static ModelContext parse(InputStream inputStream) throws Exception {
      try {
         if (null != inputStream) {
            final Reader reader = new InputStreamReader(inputStream, "UTF-8");
            final smlLexer lexer = new smlLexer(new ANTLRInputStream(reader));
            final CommonTokenStream tokens = new CommonTokenStream(lexer);
            final smlParser parser = new smlParser(tokens);
            return parser.model();
         } else {
            throw new IllegalArgumentException();
         }
      } catch (final Exception e) {
         throw new Exception("Exception reading and parsing file", e);
      }
   }
}
