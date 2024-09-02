package org.vijin.ocp17.book.ch4.string;

public class MethodsOfString {

  public static void main(String[] args) {

    new MethodsOfString().stripVsTrim();
  }

  void replace() {
    String name = "Enrico";
    StringBuilder sb = new StringBuilder("coII");
    //replace take CharSequence as parameters so I can even pass a Substring
    String result = name.replace("co", sb);
    System.out.println(result);
  }

  void strip() {
    String value = " Enrico Giurin  ";
    //# Enrico Giurin  #
    print(value);

    //remove blank space from the beginning and end of the string
    //#Enrico Giurin#
    print(value.strip());

  }

  void stripNL() {
    String source = "\tTomorrow is saturday\n\t";
    System.out.println(source);
    //#Tomorrow is saturday#
    print(source.strip());
  }

  void stripLeadingTrailing() {
    String source = " ciao ";
    //remove space at the beginning
    print(source.stripLeading()); // #ciao #
    //remove space at the end
    print(source.stripTrailing()); // # ciao#
  }

  void trim() {
    String source = " ciao \n";
    String target = source.trim();
    print(target);
  }

  void stripVsTrim() {
    char unicodeSpace = '\u2000';
    String text =
        unicodeSpace + "text" + unicodeSpace; // This string contains unicode space
    String trimmedText = text.trim();
    String strippedText = text.strip();

    System.out.println(
        "Trimmed Text:  #" + trimmedText + "#"); // Trimmed Text:  # text #
    System.out.println(
        "Stripped Text: #" + strippedText + "#"); // Stripped Text: #text#


  }


  private void print(String target) {
    System.out.println("#" + target + "#");
  }

}
