package MVoter;

import javax.swing.text.*;

 public class TextfieldFilter extends PlainDocument {
   public static final String letters  =
        "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

   public static final String NUMERIC =
        "0123456789";


   protected String acceptedChars = null;
   protected boolean negativeAccepted = false;


   public TextfieldFilter(String acceptedchars) {
     acceptedChars = acceptedchars;
     }

   public void setNegativeAccepted(boolean negativeaccepted) {
     if (acceptedChars.equals(NUMERIC)  ){
         negativeAccepted = negativeaccepted;
        acceptedChars += "-";
        }
      }

   public void insertString
      (int offset, String  str, AttributeSet attr)
         throws BadLocationException {
     if (str == null) return;



     for (int i=0; i < str.length(); i++) {
       if (acceptedChars.indexOf(str.valueOf(str.charAt(i))) == -1)
         return;
       }



     if (negativeAccepted && str.indexOf("-") != -1) {
        if (str.indexOf("-") != 0 || offset != 0 ) {
           return;
           }
        }

     super.insertString(offset, str, attr);
   }
}
